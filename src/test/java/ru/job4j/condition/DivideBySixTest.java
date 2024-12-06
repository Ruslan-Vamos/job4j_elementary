package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class DivideBySixTest {

    @Test
    void whenNumberDividedBy6() {
        int number = 42;
        String result = DivideBySix.checkNumber(number);
        assertThat(result).isEqualTo("The number is divided by 6");
    }

    @Test
    void whenNumberNotDividedBy3AndEven() {
        int number = 16;
        String result = DivideBySix.checkNumber(number);
        assertThat(result).isEqualTo("The number is even but doesn't divided by 3");
    }

    @Test
    void whenNumberDividedBy3AndNotEven() {
        int number = 15;
        String result = DivideBySix.checkNumber(number);
        assertThat(result).isEqualTo("The number is divided by 3 but isn't the even number");
    }

    @Test
    void whenNumberNotDividedBy3AndNotEven() {
        int number = 11;
        String result = DivideBySix.checkNumber(number);
        assertThat(result).isEqualTo("The number doesn't divided by 3 and isn't the even number");
    }
}