package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float result = value / 100;
        return result;
    }

    public static float rubleToDollar(float value) {
        float result = value / 90;
        return result;
    }

    public static void main(String[] args) {
        float euro = rubleToEuro(200);
        System.out.println("200 rubles are " + euro + " euro.");
        float dollar = rubleToDollar(180);
        System.out.println("180 rubles are " + dollar + " dollars.");
    }

}
