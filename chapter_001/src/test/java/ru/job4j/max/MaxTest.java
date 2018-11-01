package ru.job4j.max;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 *@author Alexandr Bulanov
 *@since 28.10.2018
 *@version 0.1
 */

public class MaxTest {

    /**
     * Максимум из двух чисел.
     */
    @Test
    public void whenFirstLessSecond() {
       Max maxim = new Max();
        int result = maxim.max(1, 2);
        assertThat(result, is(2));
    }
}
