package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class DivideBySixTest {

    @Test
    public void whenNumberDivideBy6() {
        int in = 24;
        String result = DivideBySix.checkNumber(in);
        String expected = "The original number is divided by 6.";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenNumberDivideBy3AndNotEven() {
        int in = 9;
        String result = DivideBySix.checkNumber(in);
        String expected = "The original number is divided by 3, but it is not even.";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenNumberNoDivideBy3AndEven() {
        int in = 14;
        String result = DivideBySix.checkNumber(in);
        String expected = "The original number is not divisible by 3, but it is even.";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenNumberNoDivideBy3AndNotEven() {
        int in = 25;
        String result = DivideBySix.checkNumber(in);
        String expected = "The original number is not divisible by 3 and it is not even.";
        assertThat(result).isEqualTo(expected);
    }
}