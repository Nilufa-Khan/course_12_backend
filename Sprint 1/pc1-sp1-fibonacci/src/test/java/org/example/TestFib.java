package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestFib {
    Fibonacci obj;
    @BeforeEach
    public void setUp(){
        obj = new Fibonacci();
    }
    @AfterEach
    public void tearDown(){
        obj = null;
    }
    @Test
    public void test1(){
        Assertions.assertEquals(1,obj.fibonacci(3));
    }
}
