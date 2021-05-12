package by.itacademy.solid.openclose;

public class OpenCloseDemo {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Square square = new Square(7);
        Rectangle rectangle = new Rectangle(4, 6);
        double result = AreaSummarizer.summarize(circle, square, rectangle);
        System.out.println(result);

    }
}
