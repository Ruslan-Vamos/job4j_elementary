package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class CounterTest {

    @Test
    void whenSum0To5Then15() {
        int start = 0;
        int finish = 5;
        int expected = 15;
        int fact = Counter.sum(start, finish);
        assertThat(fact).isEqualTo(expected);
    }

    @Test
    void whenSum0to10Then55() {
        int start = 0;
        int finish = 10;
        int expected = 55;
        int fact = Counter.sum(start, finish);
        assertThat(fact).isEqualTo(expected);
    }

    @Test
    void whenSum3to8Then33() {
        int start = 3;
        int finish = 8;
        int expected = 33;
        int fact = Counter.sum(start, finish);
        assertThat(fact).isEqualTo(expected);
    }

    @Test
    void when1To1Then1() {
        int start = 1;
        int finish = 1;
        int expected = 1;
        int fact = Counter.sum(start, finish);
        assertThat(fact).isEqualTo(expected);
    }

    @Test
    void when2To1Then0() {
        int start = 2;
        int finish = 1;
        int expected = 0;
        int fact = Counter.sum(start, finish);
        assertThat(fact).isEqualTo(expected);
    }

    @Test
    void whenMinus2To1ThenMinus2() {
        int start = -2;
        int finish = 1;
        int expected = -2;
        int fact = Counter.sum(start, finish);
        assertThat(fact).isEqualTo(expected);
    }
}