package com.springboot.junit;

import org.junit.*;

import static org.junit.jupiter.api.Assertions.*;

public class MyMathTest {
    MyMath myMath = new MyMath();

    @Before
    public void before(){
        System.out.print("Before\n");
    }

    @After
    public void after(){
        System.out.print("After\n");
    }

    @BeforeClass
    public static void beforeClass(){
        System.out.print("Before Class\n");
    }

    @AfterClass
    public static void afterClass(){
        System.out.print("After Class\n");
    }

    @Test
    public void sum_with3numbers() {
        System.out.print("Test with 3 numbers");
        assertEquals(6, myMath.sum(new int[]{1,2,3}));
    }

    @Test
    public void sum_with1number() {
        System.out.print("Test with 1 number");
        assertEquals(3, myMath.sum(new int[]{3}));
    }
}