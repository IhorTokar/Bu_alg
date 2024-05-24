package com.bu.algs.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class ObjectsTest {

    @Test
    void testNullEqNull() {
        // given
        boolean expected = true;

        // when
        boolean actual = Objects.equals(null, null);

        // then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testNotNullNotEqNull() {
        // given
        boolean expected = false;

        // when
        boolean actual = Objects.equals(null, "bar");

        // then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testNullNotEqNotNull() {
        // given
        boolean expected = false;

        // when
        boolean actual = Objects.equals("foo", null);

        // then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testIntEqInt() {
        // given
        boolean expected = true;

        // when
        boolean actual = Objects.equals(1, 1);

        // then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testObjEqObj() {
        // given
        boolean expected = true;

        // when
        boolean actual = Objects.equals(new Object(), new Object());

        // then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void compareTest(){

        int result = Objects.<BigDecimal>compare(new BigDecimal("1"), new BigDecimal("2"));
    }
}

