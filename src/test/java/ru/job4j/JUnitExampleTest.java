package ru.job4j;

import org.junit.jupiter.api.*;

import static org.assertj.core.api.Assertions.*;

class JUnitExampleTest {

    @Timeout(7)
    @Test
    @DisplayName("When 5 multi 5 should be 25")
    void when5and5Then25() throws InterruptedException {
        Thread.sleep(5000);
        JUnitExample jUnitExample = new JUnitExample();
        int a = 5;
        int b = 5;
        int expected = 25;
        int result = jUnitExample.multiply(a, b);
        assertThat(result).isEqualTo(expected);
    }
}