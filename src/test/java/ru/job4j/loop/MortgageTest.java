package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class MortgageTest {

    @Test
    void whenAmount1000Salary1200Percent1ThenYear1() {
        int amount = 1000;
        int salary = 1200;
        int percent = 1;
        int expected = 1;
        int result = Mortgage.year(amount, salary, percent);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenAmount100Salary120Percent50ThenYear2() {
        int amount = 100;
        int salary = 120;
        int percent = 50;
        int expected = 2;
        int result = Mortgage.year(amount, salary, percent);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenAmount1000Salary1200Percent20ThenYear1() {
        int amount = 1000;
        int salary = 1200;
        int percent = 20;
        int expected = 1;
        int result = Mortgage.year(amount, salary, percent);
        assertThat(result).isEqualTo(expected);
    }
}