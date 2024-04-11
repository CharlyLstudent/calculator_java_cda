package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calc = new Calculator();
    @Test
    void add() {
        assertEquals(5, calc.add(2, 3));
    }

    @Test
    void subtract() {
        assertEquals(0, calc.subtract(2, 2));
    }

    @Test
    void multiply() {
        assertEquals(6, calc.multiply(2, 3));
    }

    @Test
    void divide() {
        assertEquals(2, calc.divide(6,3 ));
    }

    @Test
    void divideByZero(){
        assertThrows(ArithmeticException.class, () -> calc.divide(6,0));
    }
}