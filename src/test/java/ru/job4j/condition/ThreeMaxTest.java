package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class ThreeMaxTest {

    @Test
    void firstMax() {
        int first = 10;
        int second = 5;
        int third = 1;
        int expected = 10;
        int result = ThreeMax.max(first, second, third);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void secondMax() {
        int first = 1;
        int second = 20;
        int third = 3;
        int expected = 20;
        int result = ThreeMax.max(first, second, third);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void thirdMax() {
        int first = 1;
        int second = 2;
        int third = 30;
        int expected = 30;
        int result = ThreeMax.max(first, second, third);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void allEq() {
        int first = 3;
        int second = 3;
        int third = 3;
        int expected = 3;
        int result = ThreeMax.max(first, second, third);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void firstEqSecond() {
        int first = 10;
        int second = 10;
        int third = 3;
        int expected = 10;
        int result = ThreeMax.max(first, second, third);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void firstEqThird() {
        int first = 18;
        int second = 2;
        int third = 18;
        int expected = 18;
        int result = ThreeMax.max(first, second, third);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void secondEqThird() {
        int first = 1;
        int second = 28;
        int third = 28;
        int expected = 28;
        int result = ThreeMax.max(first, second, third);
        assertThat(result).isEqualTo(expected);
    }
}