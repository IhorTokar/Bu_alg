package com.bu.algs.impl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    public void calculator(){
        Calculator<Integer> plus = new Calculator<Integer>();

        Assertions.assertEquals(new BigDecimal(14), plus.plus(5, 9));

    }

    @Test
    public void calculator2(){
        Calculator<Double> plus = new Calculator<Double>();

        Object[] array1 = new Object[]{"array", "arr", "tt"};
        Object[] array2 = new Object[]{1, 5, 7};
        Assertions.assertEquals(new BigDecimal(50.0), plus.plus(20.00, 30.00));

    }
}