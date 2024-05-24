package com.bu.algs.impl;

import java.math.BigDecimal;

public class Calculator<T extends Number> {
    public BigDecimal plus(T a, T b){
        return new BigDecimal(a.toString()).add(new BigDecimal (b.toString()));
    }

    public BigDecimal minus(T a, T b){
        return new BigDecimal(a.toString()).subtract(new BigDecimal (b.toString()));
    }
}
