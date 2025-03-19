package com.github.richgon24.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class calculatorTest {
    calculator calculator;
    @BeforeEach
    void setUp() {
        calculator = new calculator();

    }

    @Test
    @DisplayName(" Test For Simple Addition")
    void testAdd() {
        assertEquals(3, calculator.add(1, 2), "Adds 1 and 2");
        assertEquals(-2, calculator.add(-4, 2), "Adds negative number");
    }

    @Test
    @DisplayName(" Test For Simple Subtraction")
    void testSubtract() {
        assertEquals(2, calculator.subtract(4, 2), "Four minus two");
        assertEquals(4, calculator.subtract(5, 1), "Five minus one");
    }

    @Test
    @DisplayName(" Test For Simple Division")
    void testDivide() {
        assertEquals(2, calculator.divide(6, 3), "six divided by three");
        assertEquals(5, calculator.divide(5, 1), "five divided by one");
    }

    @Test
    @DisplayName("Division by zero should throw an ArithmeticException")
    void testDivideByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> calculator.divide(5, 0));
        assertEquals("Cannot divide by zero", exception.getMessage());
    }

}//end CalculatorTest