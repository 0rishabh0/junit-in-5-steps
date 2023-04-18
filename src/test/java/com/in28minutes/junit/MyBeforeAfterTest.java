package com.in28minutes.junit;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class MyBeforeAfterTest {

    // @BeforeAll and @AfterAll are class level and method name must have 'static' as modifier

    @BeforeAll // Any common setup for all test
    static void beforeAll(){
        System.out.println("BeforeAll");
    }

    @AfterAll // Any common cleanup task for all the tests
    static void afterAll(){
        System.out.println("AfterAll");
    }


    @BeforeEach  // Any setup for each test
    void beforeEach(){
        System.out.println("BeforeEach");
    }

    @AfterEach  // Any cleanup for each test
    void afterEach(){
        System.out.println("AfterEach");
    }

    @Test
    void  test1(){
        System.out.println("test1");
    }

    @Test
    void  test2(){
        System.out.println("test2");
    }

    @Test
    void  test3(){
        System.out.println("test3");
    }
}
