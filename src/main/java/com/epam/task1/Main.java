package com.epam.task1;

//8.	Вычислить значение функции:(формула)

import com.epam.task1.data.ConsoleDataAcquirer;
import com.epam.task1.data.DataAcquirer;
import com.epam.task1.logic.Calculator;
import com.epam.task1.view.ConsolePrintResult;
import com.epam.task1.view.PrintResult;

public class Main {
    public static void main(String[] args) {

        //receive a number
        DataAcquirer acquirer = new ConsoleDataAcquirer();
        int number = acquirer.getIntNumber();

        //calculate value
        Calculator calculator = new Calculator();
        double result = calculator.CalculateValue(number);

        //show result
        PrintResult print = new ConsolePrintResult();
        print.print(result);
    }
}
