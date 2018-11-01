package ru.job4j.max;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 *@author Alexandr Bulanov
 *@since 28.10.2018
 *@version 0.1
 */

public class MaxThirdTest {
    /**
     * Максимум из трех чисел.
     */
    @Test
    public void whenFirstLessSecondLessThid() {
        Max maxim = new Max();
        //int result = Math.max(1, Math.max(2, 3));
        //assertThat(result, is(3));
        int result = maxim.max(1, 2, 3);
        assertThat(result, is(3));
    }
}
