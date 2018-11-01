package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import static sun.nio.cs.Surrogate.is;

/**
 *@author Alexandr Bulanov
 *@since 31.10.2018
 *@version 0.1
 */

public class CounterTest {
    /**
     *Сложение.
     */
    @Test
    public void whenThen() {
        Counter count = new Counter();
        int result = count.add(1, 10);
        assertThat(result, is(30));
    }
}