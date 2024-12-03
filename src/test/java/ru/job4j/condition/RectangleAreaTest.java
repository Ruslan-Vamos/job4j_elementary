package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class RectangleAreaTest {

    @Test
    void whenP6K2ThenSquare2() {
        double p = 6;
        double k = 2;
        double expected = 2;
        double result = RectangleArea.square(p, k);
        assertThat(expected).isEqualTo(result, withPrecision(0.01));
    }

    @Test
    void whenP8K3ThenSquare3() {
        double p = 8;
        double k = 3;
        double expected = 3;
        double result = RectangleArea.square(p, k);
        assertThat(expected).isEqualTo(result, withPrecision(0.01));
    }

    @Test
    void whenP12K2ThenSquare8() {
        double p = 12;
        double k = 2;
        double expected = 8;
        double result = RectangleArea.square(p, k);
        assertThat(expected).isEqualTo(result, withPrecision(0.01));
    }
}