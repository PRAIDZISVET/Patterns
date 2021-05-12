package by.itacademy.solid.openclose;

public class AreaSummarizer {
    public static double summarize(Area... objects) {
        double result = 0.0;
        for (Area object : objects) {
            result += object.area();
        }

        return result;
    }


}
