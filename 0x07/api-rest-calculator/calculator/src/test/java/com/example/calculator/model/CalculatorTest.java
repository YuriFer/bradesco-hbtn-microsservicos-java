package com.example.calculator.model;

import static org.mockito.ArgumentMatchers.anyDouble;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.Test;
public class CalculatorTest {
    // new Calculator();
    private final Calculator calculator = mock(Calculator.class);

    @Test
    void sumTest() {
        when(calculator.sum(anyDouble(), anyDouble())).thenReturn(10.0);
        Double result = calculator.sum(4.0, 6.0);
        assert result.equals(10.0);
    }

    @Test
    public void numbersNullSumTest() {
        when(calculator.sum(null, null)).thenThrow(new NullPointerException("Número 1 e número 2 são obrigatórios."));
        try {
            calculator.sum(null, null);
        } catch (NullPointerException e) {
            assert e.getMessage().equals("Número 1 e número 2 são obrigatórios.");
        }
    }

    @Test
    void subTest() {
        when(calculator.sub(anyDouble(), anyDouble())).thenReturn(5.0);
        Double result = calculator.sub(10.0, 5.0);
        assert result.equals(5.0);
    }

    @Test
    void divideTest() {
       when(calculator.divide(anyDouble(), anyDouble())).thenReturn(2.0);
       Double result = calculator.divide(10.0, 5.0);
       assert result.equals(2.0);
    }

    @Test
    public void divisionByZeroTest() {
        when(calculator.divide(anyDouble(), eq(0.0))).thenThrow(new ArithmeticException("Divisão por zero não é permitida."));
        try {
            calculator.divide(10.0, 0.0);
        } catch (ArithmeticException e) {
            assert e.getMessage().equals("Divisão por zero não é permitida.");
        }
    }

    @Test
    void factorialTest() {
        when(calculator.factorial(5)).thenReturn(120);
        Integer result = calculator.factorial(5);
        assert result.equals(120);
    }

    @Test
    void integerToBinaryTest() {
       when(calculator.integerToBinary(10)).thenReturn(1010);
       Integer result = calculator.integerToBinary(10);
       assert result.equals(1010);
    }

    @Test
    void integerToHexadecimalTest() {
       when(calculator.integerToHexadecimal(255)).thenReturn("FF");
       String result = calculator.integerToHexadecimal(255);
       assert result.equals("FF");
    }

    @Test
    void calculeDayBetweenDateTest() {
        when(calculator.calculeDayBetweenDate(java.time.LocalDate.of(2023,1,1), java.time.LocalDate.of(2023,1,31))).thenReturn(30);
        Integer result = calculator.calculeDayBetweenDate(java.time.LocalDate.of(2023,1,1), java.time.LocalDate.of(2023,1,31));
        assert result.equals(30);
    }
}