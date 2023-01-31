package com.bridgelabz;

import org.example.Calculator;
import org.junit.jupiter.api.*;

public class CalculatorTest {
    //GivenWhenThen
    //Calculator calculator;
    static Calculator calculator1;
//    @BeforeEach
//    void init(){
//        calculator=new Calculator();
//        System.out.println("BeforeEach");
//    }
    @BeforeAll
   static void init1(){
        calculator1=new Calculator();
        System.out.println("BeforeAll");
    }
    @Test
    void GivenTwoNumberWhenAddedThenReturnSum() {
        //Calculator calculator=new Calculator();
        int ActualValue= calculator1.sum(4,6);
        Assertions.assertEquals(10,ActualValue);
    }
    @Test
    void GivenTwoNumberWhenAddedThenReturnProduct() {
       // Calculator calculator=new Calculator();
        int ActualValue= calculator1.Product(4,6);
        Assertions.assertEquals(24,ActualValue);
    }
//    @AfterEach
//     void m1(){
//        System.out.println("AfterEach");
//    }
    @AfterAll
    static void Afterm2(){
        System.out.println("AfterAll");
    }
}
