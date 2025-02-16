package com.example;
import static org.junit.jupiter.api.Assertions.*;
import org.example.Calculator;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    public void testAdd() {
        assertEquals(5.0, calculator.add(2, 3), 0.001);
    }

    @Test
    public void testSubtract() {
        assertEquals(1.0, calculator.subtract(4, 3), 0.001);
    }

    @Test
    public void testMultiply() {
        assertEquals(6.0, calculator.multiply(2, 3), 0.001);
    }

    @Test
    public void testDivide() {
        assertEquals(2.0, calculator.divide(6, 3), 0.001);
    }

    @Test
    public void testDivideByZero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(6, 0);
        });
        assertEquals("Division by zero is not allowed.", exception.getMessage());
    }
}
