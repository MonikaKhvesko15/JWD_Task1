package com.epam.task1.view;

public class ConcreteCreator extends Creator {
    public PrintResult factoryMethod() {
        return new ConsolePrintResult();
    }
}
