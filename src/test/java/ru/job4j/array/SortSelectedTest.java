package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class SortSelectedTest {

    @Test
    public void whenSort5Elems() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort3Elems() {
        int[] data = new int[] {3, 4, 2};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {2, 3, 4};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort8Elems() {
        int[] data = new int[] {18, 3, 4, 1, 2, 5, 11, 0};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {0, 1, 2, 3, 4, 5, 11, 18};
        assertThat(result).containsExactly(expected);
    }
}