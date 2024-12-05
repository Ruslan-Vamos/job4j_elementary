package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class LogicNotTest {

    @Test
    void whenIsEvenTrue() {
        boolean result = LogicNot.isEven(2);
        assertThat(result).isTrue();
    }

    @Test
    void whenIsEvenFalse() {
        boolean result = LogicNot.isEven(3);
        assertThat(result).isFalse();
    }

    @Test
    void whenIsPositiveTrue() {
        boolean result = LogicNot.isPositive(2);
        assertThat(result).isTrue();
    }

    @Test
    void whenIsPositiveFalse() {
        boolean result = LogicNot.isPositive(-2);
        assertThat(result).isFalse();
    }

    @Test
    void whenNumIs0IsPositiveIsFalse() {
        boolean result = LogicNot.isPositive(0);
        assertThat(result).isFalse();
    }

    @Test
    void whenNotEvenFalse() {
        boolean result = LogicNot.notEven(4);
        assertThat(result).isFalse();
    }

    @Test
    void whenNotEvenTrue() {
        boolean result = LogicNot.notEven(3);
        assertThat(result).isTrue();
    }

    @Test
    void whenNegativeTrue() {
        boolean result = LogicNot.isNegative(-14);
        assertThat(result).isTrue();
    }

    @Test
    void whenNegativeFalse() {
        boolean result = LogicNot.isNegative(5);
        assertThat(result).isFalse();
    }

    @Test
    void whenNumIs0NegativeFalse() {
        boolean result = LogicNot.isNegative(0);
        assertThat(result).isFalse();
    }

    @Test
    void whenNotEvenAndPositiveIsTrue() {
        boolean result = LogicNot.notEvenAndPositive(9);
        assertThat(result).isTrue();
    }

    @Test
    void whenNotEvenFalseIsAllFalse() {
        boolean result = LogicNot.notEvenAndPositive(2);
        assertThat(result).isFalse();
    }

    @Test
    void whenPositiveFalseIsAllFalse() {
        boolean result = LogicNot.notEvenAndPositive(-3);
        assertThat(result).isFalse();
    }

    @Test
    void whenNotEvenAndPositiveFalse() {
        boolean result = LogicNot.notEvenAndPositive(-4);
        assertThat(result).isFalse();
    }

    @Test
    void whenEvenOrNegativeIsTrue() {
        boolean result = LogicNot.evenOrNegative(-2);
        assertThat(result).isTrue();
    }

    @Test
    void whenEvenIsTrueThenAllIsTrue() {
        boolean result = LogicNot.evenOrNegative(8);
        assertThat(result).isTrue();
    }

    @Test
    void whenNegativeIsTrueThenAllIsTrue() {
        boolean result = LogicNot.evenOrNegative(-1);
        assertThat(result).isTrue();
    }

    @Test
    void whenEvenOrNegativeIsFalse() {
        boolean result = LogicNot.evenOrNegative(3);
        assertThat(result).isFalse();
    }
}