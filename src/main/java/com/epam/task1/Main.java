package com.epam.task1;

//8.	Вычислить значение функции:(формула)

import com.epam.task1.data.ConcreteCreator;
import com.epam.task1.data.ConsoleDataAcquirer;
import com.epam.task1.data.Creator;
import com.epam.task1.data.DataAcquirer;
import com.epam.task1.logic.Calculator;
import com.epam.task1.view.ConsolePrintResult;
import com.epam.task1.view.PrintResult;

public class Main {
    public static void main(String[] args) {

        //receive a number
        Creator creator = new ConcreteCreator();
        DataAcquirer dataAcquirer = creator.factoryMethod();
        int number = dataAcquirer.getIntNumber();

        //calculate value
        Calculator calculator = new Calculator();
        double result = calculator.CalculateValue(number);

        //show result
        com.epam.task1.view.Creator creator1 = new com.epam.task1.view.ConcreteCreator();
        PrintResult printResult = creator1.factoryMethod();
        printResult.print(result);
    }
}
