package com.epam.task1.logic;

public class Calculator {

    public double CalculateValue(int number) {
        double result;
        if (number >= 3) {
            result = -Math.pow(number, 2) + 3 * number + 9;
        } else {
            result = 1.0 / (Math.pow(number, 3) - 6);
        }
        return result;
    }

}
