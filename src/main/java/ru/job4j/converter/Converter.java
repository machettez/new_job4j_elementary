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
        float dollar = rubleToDollar(270);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("270 rubles are " + dollar + " dollar.");
    }

}
