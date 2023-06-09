package src.main.java;

import java.util.Arrays;

public class LeetcodeTask2469 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(convertTemperature(36.50)));
        System.out.println(Arrays.toString(convertTemperature(122.11)));
    }

    public static double[] convertTemperature(double celsius) {
        double kelvin = celsius + 273.15;
        double fahrenheit = celsius * 1.80 + 32.00;
        return new double[]{kelvin, fahrenheit};
    }
}

/*
2469. Convert the Temperature

You are given a non-negative floating point number rounded to two decimal places celsius, that denotes the temperature in Celsius.

You should convert Celsius into Kelvin and Fahrenheit and return it as an array ans = [kelvin, fahrenheit].

Return the array ans. Answers within 10-5 of the actual answer will be accepted.

Note that:

Kelvin = Celsius + 273.15
Fahrenheit = Celsius * 1.80 + 32.00
*/
