package com.epam.task1.data;

public class ConsoleAcquirerFactory implements AcquirerFactory {
    public DataAcquirer createAcquirer() {
        return new ConsoleDataAcquirer();
    }
}
