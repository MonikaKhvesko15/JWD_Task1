package com.epam.task1.data;

public class ConcreteCreator extends Creator{
public DataAcquirer factoryMethod(){
    return new ConsoleDataAcquirer();
}
}
