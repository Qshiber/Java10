package com.sda;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Executable;
import java.util.Scanner;

class CalculatorTest {

    @Test
    void testSumOfTwoNumbers() {
        //give
        double a = 2.0;
        double b = 2.0;
        double expectedResult = 4.0;
        Calculator calculator = new Calculator();
        //when
        double actualResult = calculator.sum(a, b);

        //then
        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Test
    void testUnhappyPath() {
        //give
        int a = 2542512;
        int b = 44124;
        Calculator calculator = new Calculator();
        //when
        //then
        Assertions.assertThrows(IllegalArgumentException.class, () -> calculator.multiply(a, b));
    }

    @Test
    void testDivisionEdgeCaseDivByZero() {
        //give
        double a = 2.0;
        double b = 0.0;
        Calculator calculator = new Calculator();
        //when

        //then
        Assertions.assertThrows(ArithmeticException.class, () -> calculator.division(a, b));


    }


}