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
    void whenSum1To1Then1() {
        int start = 1;
        int finish = 1;
        int expected = 1;
        int fact = Counter.sum(start, finish);
        assertThat(fact).isEqualTo(expected);
    }

    @Test
    void whenSum2To1Then0() {
        int start = 2;
        int finish = 1;
        int expected = 0;
        int fact = Counter.sum(start, finish);
        assertThat(fact).isEqualTo(expected);
    }

    @Test
    void whenSumMinus2To1ThenMinus2() {
        int start = -2;
        int finish = 1;
        int expected = -2;
        int fact = Counter.sum(start, finish);
        assertThat(fact).isEqualTo(expected);
    }

    @Test
    void whenSumEven0To5Then6() {
        int start = 0;
        int finish = 5;
        int expected = 6;
        int fact = Counter.sumByEven(start, finish);
        assertThat(fact).isEqualTo(expected);
    }

    @Test
    void whenSumEven3To8Then18() {
        int start = 3;
        int finish = 8;
        int expected = 18;
        int fact = Counter.sumByEven(start, finish);
        assertThat(fact).isEqualTo(expected);
    }

    @Test
    void whenSumEven4To8Then18() {
        int start = 4;
        int finish = 8;
        int expected = 18;
        int fact = Counter.sumByEven(start, finish);
        assertThat(fact).isEqualTo(expected);
    }

    @Test
    void whenSumEven1To1Then0() {
        int start = 1;
        int finish = 1;
        int expected = 0;
        int fact = Counter.sumByEven(start, finish);
        assertThat(fact).isEqualTo(expected);
    }

    @Test
    void whenSumEvenMinus5To7Then6() {
        int start = -5;
        int finish = 7;
        int expected = 6;
        int fact = Counter.sumByEven(start, finish);
        assertThat(fact).isEqualTo(expected);
    }
}