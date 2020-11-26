package com.tiimipaiva.calculator;

import com.tiimipaiva.TiimipaivaApplicationTests;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;


public class ChangeCalculatorTest extends TiimipaivaApplicationTests {

    @Autowired
    ChangeCalculator changeCalculator;

    @Test
    public void test() {
        var testi = changeCalculator.calculateChange(BigDecimal.valueOf(11.75));
        System.out.println(1);
    }
}
