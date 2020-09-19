package com.epam.task1.view;

public class ConsolePrintResultFactory implements PrintFactory {
    public PrintResult createPrint() {
        return new ConsolePrintResult();
    }
}
