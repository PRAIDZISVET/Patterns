package by.itacademy.pattern.builder;

public class Student {
    private Integer age;
    private String name;
    private Gender gender;

    private Student(Integer age, String name, Gender gender) {
        this.age = age;
        this.name = name;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                '}';
    }

    public static StudentBuilder getBuilder () {
        return new StudentBuilder();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public static class StudentBuilder {

        private Integer age;
        private String name;
        private Gender gender;


        public Student build () {
            return new Student(age,name,gender);
        }

        public StudentBuilder age(Integer age) {
            this.age = age;
            return this;
        }

        public StudentBuilder gender(Gender gender) {
            this.gender = gender;
            return this;
        }

        public StudentBuilder name(String name) {
            this.name = name;
            return  this;
        }
    }
}
