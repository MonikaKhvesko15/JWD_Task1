package com.epam.task1.logic;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void shouldCalculateCorrectValue() {
        //given
        Calculator calculator = new Calculator();
        double excepted = -1.0;
        int point = 5;

        //when
        double actual = calculator.CalculateValue(point);
        //then
        Assert.assertEquals(excepted, actual, 0.000001);
    }
}
