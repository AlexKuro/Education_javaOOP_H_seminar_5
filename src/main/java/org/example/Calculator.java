package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Calculator<T extends Number> implements CalcInterface{
    private T num1;
    private T num2;
    private Double result;
    private int value = 3;


    public void sum() {
        result = num1.doubleValue() + num2.doubleValue();
        BigDecimal bD = new BigDecimal(result);
        RoundingMode halfUp = RoundingMode.HALF_UP;
        result = (bD.setScale(value, RoundingMode.HALF_UP)).doubleValue();
    }

    public void subtraction() {
        result = num1.doubleValue() - num2.doubleValue();
        BigDecimal bD = new BigDecimal(result);
        RoundingMode halfUp = RoundingMode.HALF_UP;
        result = (bD.setScale(value, RoundingMode.HALF_UP)).doubleValue();
    }

    public void multiplications() {
        result = num1.doubleValue() * num2.doubleValue();
        BigDecimal bD = new BigDecimal(result);
        RoundingMode halfUp = RoundingMode.HALF_UP;
        result = (bD.setScale(value, RoundingMode.HALF_UP)).doubleValue();
    }

    public void division() {
        result = num1.doubleValue() / num2.doubleValue();
        BigDecimal bD = new BigDecimal(result);
        RoundingMode halfUp = RoundingMode.HALF_UP;
        result = (bD.setScale(value, RoundingMode.HALF_UP)).doubleValue();
    }


}
