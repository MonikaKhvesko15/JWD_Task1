package com.epam.task1.view;

public class ConsolePrintResult implements PrintResult {

    public void print(double number) {
        System.out.println("Function value F(x) = " + number);
    }
}
