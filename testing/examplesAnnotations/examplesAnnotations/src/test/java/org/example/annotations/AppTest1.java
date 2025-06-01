package org.example.annotations;

import org.junit.jupiter.api.*;

/**
 * Unit test for simple App.
 */
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class AppTest1
{
//    @TestMethodOrder(MethodOrderer.MethodName.class)
//    public class AlphanumericOrderUnitTest {
//
//    }

    @Test @Order(2)
    public void methodFirst() {
        System.out.println(1);
        Assertions.assertEquals(1, 2);
    }
    @Test @Order(1)
    public void methodSecond() {
        System.out.println(2);
        Assertions.assertEquals(2, 3);
    }
}
