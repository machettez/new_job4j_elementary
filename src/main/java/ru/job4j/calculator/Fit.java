package ru.job4j.calculator;

public class Fit {

    public static double manWeight(short height) {
        double result = (height - 100) * 1.15;
        return result;
    }

    public static double womanWeight(short height) {
        double result = (height - 110) * 1.15;
        return result;
    }

    public static void main(String[] args) {
        short manHeight = 187;
        short womanHeight = 175;
        double man = manWeight(manHeight);
        double woman = womanWeight(womanHeight);
        System.out.println("Man 190 is " + man);
        System.out.println("Woman 175 is " + woman);
    }

}
