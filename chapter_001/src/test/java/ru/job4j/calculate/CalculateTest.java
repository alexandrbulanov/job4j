package ru.job4j.calculate;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 *Class  Test.
 *
 * @author Alexandr Bulanov
 * @since 16.10.2018
 * @version 0.1
 */
public class CalculateTest {
    /**
     * Добавление метода Test.
     */
    @Test
    public void whenAddOneToOneThenTwo() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Calculate.main(null);
        assertThat(out.toString(), is("Hello World\r\n"));
    }

    @Test
    public void whenTakeNameThenTreeEchoPlusName() {
        String input = " Alexandr Bulanov";
        String expect = "Echo, echo, echo : Alexandr Bulanov";
        Calculate calculate = new Calculate();
        String result = calculate.echo(input);
        assertThat(result, is(expect));
    }
}	