package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        return value / 100;
    }

    public static float rubleToDollar(float value) {
        return value / 90;
    }

    public static void main(String[] args) {
        float euro = rubleToEuro(200);
        System.out.println("200 rubles are " + euro + " euro.");
        float dollar = rubleToDollar(180);
        System.out.println("180 rubles are " + dollar + " dollars.");
        float input = 200;
        float expected = 2;
        float output = Converter.rubleToEuro(input);
        boolean passed = expected == output;
        System.out.println("200 rubles are 2 euro. Test result: " + passed);
        input = 180;
        output = Converter.rubleToDollar(input);
        passed = expected == output;
        System.out.println("180 rubles are 2 dollars. Test result: " + passed);
    }

}
