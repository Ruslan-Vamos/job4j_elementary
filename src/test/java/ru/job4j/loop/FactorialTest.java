package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class FactorialTest {

    @Test
    void whenFact0Then1() {
        int number = 0;
        int expected = 1;
        int fact = Factorial.calculate(number);
        assertThat(fact).isEqualTo(expected);
    }

    @Test
    void whenFact1Then1() {
        int number = 1;
        int expected = 1;
        int result = Factorial.calculate(number);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenFact3Then6() {
        int number = 3;
        int expected = 6;
        int result = Factorial.calculate(number);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenFact5Then120() {
        int number = 5;
        int expected = 120;
        int fact = Factorial.calculate(number);
        assertThat(fact).isEqualTo(expected);
    }

    @Test
    void whenFact6Then720() {
        int number = 6;
        int expected = 720;
        int result = Factorial.calculate(number);
        assertThat(result).isEqualTo(expected);
    }
}