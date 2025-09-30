package br.inatel.cdg.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void givenTwoIntegers_whenMethodAdd_thenReturnTheirSum(){
        int sum = Calculator.add(1,2);
        assertEquals(3,sum);
    }

    @Test
    public void givenTwoIntegers_whenMethodSubtract_thenReturnTheirDifference(){
        int sub = Calculator.subtract(2,1);
        assertEquals(1,sub);
    }

    @Test
    public void givenTwoIntegers_whenMethodMultiply_thenReturnTheirProduct(){
        int product = Calculator.multiply(2,2);
        assertEquals(4,product);
    }
}
