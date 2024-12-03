package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void when00to20Then2() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double expected = 2;
        double result = Point.distance(x1, y1, x2, y2);
        assertThat(expected).isEqualTo(result, withPrecision(0.01));
    }

    @Test
    void whenMinus3Minus3to33Then8dot49() {
        int x1 = -3;
        int y1 = -3;
        int x2 = 3;
        int y2 = 3;
        double expected = 8.49;
        double result = Point.distance(x1, y1, x2, y2);
        assertThat(expected).isEqualTo(result, withPrecision(0.01));
    }

    @Test
    void whenMinus2and3to45Then6dot32() {
        int x1 = -2;
        int y1 = 3;
        int x2 = 4;
        int y2 = 5;
        double expected = 6.32;
        double result = Point.distance(x1, y1, x2, y2);
        assertThat(expected).isEqualTo(result, withPrecision(6.32));
    }
}