package com.company.lesson_14;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void GetArrayAfter4Test() {
        int[] resArray = {5};
        int[] paramArray = {1, 3, 4, 5};
        Assertions.assertArrayEquals(resArray, Main.getArrayAfter4(paramArray));
    }
    @org.junit.jupiter.api.Test
    void GetArrayAfter4TestException() {

        int[] paramArray = {1, 3, 3, 5};
        Assertions.assertThrows(RuntimeException.class, () -> Main.getArrayAfter4(paramArray));
    }

    @org.junit.jupiter.api.Test
    void isContainOneOrFourTest() {
        boolean resBoolean = true;
        int[] paramArray = {1, 4, 4, 4};
        Assertions.assertEquals(resBoolean, Main.isContainOneOrFour(paramArray));
    }



}