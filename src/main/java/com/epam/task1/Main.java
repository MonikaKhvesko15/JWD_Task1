package com.epam.task1;

//8.	Вычислить значение функции:(формула)

import com.epam.task1.data.ConsoleAcquirerFactory;
import com.epam.task1.data.AcquirerFactory;
import com.epam.task1.data.DataAcquirer;
import com.epam.task1.logic.Calculator;
import com.epam.task1.view.ConsolePrintResultFactory;
import com.epam.task1.view.PrintFactory;
import com.epam.task1.view.PrintResult;

public class Main {
    public static void main(String[] args) {

        //receive a number
        AcquirerFactory acquirerFactory = new ConsoleAcquirerFactory();
        DataAcquirer dataAcquirer = acquirerFactory.createAcquirer();
        int number = dataAcquirer.getIntNumber();

        //calculate value
        Calculator calculator = new Calculator();
        double result = calculator.calculateValue(number);

        //show result
        PrintFactory printFactory = new ConsolePrintResultFactory();
        PrintResult printResult = printFactory.createPrint();
        printResult.print(result);
    }
}
