package com.epam.task1.logic;

public class Calculator {
    /*
    f(x)={ -x^2+3x+9, если x>=3
           1/(x^3 -6), если x<3 }
     */
    public double calculateValue(int number) {
        double result;
        if (number >= 3) {
            result = -Math.pow(number, 2) + 3 * number + 9;
        } else {
            result = 1.0 / (Math.pow(number, 3) - 6);
        }
        return result;
    }

}
