package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    Calculator calculator;
    @BeforeEach
    public  void setUp(){
        calculator = new Calculator();
    }
    @AfterEach
    public void tearDown(){
        calculator = null;
    }
    @Test
    public void additionTest(){
        double n1 = 10, n2 = 20;
        double res = calculator.addition(n1,n2);
        Assertions.assertEquals(30,res);
        Assertions.assertNotEquals(11,res);
    }
    @Test
    public void subtractionTest(){
        double n1 = 10, n2 = 20;
        double res = calculator.subtraction(n1,n2);
        Assertions.assertEquals(-10,res);
        Assertions.assertNotEquals(11,res);
    }
    @Test
    public void multiplicationTest(){
        double n1 = 10, n2 = 20;
        double res = calculator.multiplication(n1,n2);
        Assertions.assertEquals(200,res);
        Assertions.assertNotEquals(11,res);
    }

    @Test
    public void divisionTest(){
        double n1 = 10, n2 = 20;
        double res = calculator.division(n1,n2);
        Assertions.assertEquals(0.5,res);
        Assertions.assertNotEquals(11,res);
    }
    @Test
    public void moduloTest(){
        double n1 = 10, n2 = 20;
        double res = calculator.modulo(n1,n2);
        Assertions.assertEquals(10.0,res);
        Assertions.assertNotEquals(11,res);
    }
}
