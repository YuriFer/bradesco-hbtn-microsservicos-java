package com.example.calculator.model;

import org.junit.jupiter.api.Test;
public class CalculatorTest {
    private final Calculator calculator = new Calculator();

    @Test
    void sumTest() {
        Double result = calculator.sum(4.0, 6.0);
        assert result.equals(10.0);
    }

    @Test
    public void numbersNullSumTest() {
        try {
            calculator.sum(null, null);
        } catch (NullPointerException e) {
            assert e.getMessage().equals("Número 1 e número 2 são obrigatórios.");
        }
    }

    @Test
    void subTest() {
        Double result = calculator.sub(10.0, 5.0);
        assert result.equals(5.0);
    }

    @Test
    void divideTest() {
       Double result = calculator.divide(10.0, 5.0);
       assert result.equals(2.0);
    }

    @Test
    public void divisionByZeroTest() {
        try {
            calculator.divide(10.0, 0.0);
        } catch (ArithmeticException e) {
            assert e.getMessage().equals("Divisão por zero não é permitida.");
        }
    }

    @Test
    void factorialTest() {
        Integer result = calculator.factorial(5);
        assert result.equals(120);
    }

    @Test
    void integerToBinaryTest() {
       Integer result = calculator.integerToBinary(10);
       assert result.equals(1010);
    }

    @Test
    void integerToHexadecimalTest() {
       String result = calculator.integerToHexadecimal(255);
       assert result.equals("FF");
    }

    @Test
    void calculeDayBetweenDateTest() {
        Integer result = calculator.calculeDayBetweenDate(java.time.LocalDate.of(2023,1,1), java.time.LocalDate.of(2023,1,31));
        assert result.equals(30);
    }
}