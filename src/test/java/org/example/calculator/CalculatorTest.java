package org.example.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private final Calculator calc = new Calculator();

    @Test
    void add_shouldReturnSum() {
        assertEquals(5, calc.add(2, 3));
    }

    @Test
    void sub_shouldReturnDiff() {
        assertEquals(1, calc.sub(4, 3));
    }

    @Test
    void mul_shouldReturnProduct() {
        assertEquals(12, calc.mul(4, 3));
    }

    @Test
    void div_shouldReturnQuotient() {
        assertEquals(2, calc.div(6, 3));
    }

    @Test
    void div_byZero_shouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> calc.div(1, 0));
    }
}
