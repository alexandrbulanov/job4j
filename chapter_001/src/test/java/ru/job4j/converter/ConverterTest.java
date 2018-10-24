package ru.job4j.converter;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ConverterTest {
    @Test
    public void rubleToDollar() {
        Converter converter = new Converter();
        int result = converter.rubleToDollar(55);
        assertThat(result, is(1));
    }

	@Test
    public void dollarToRuble() {
        Converter converter = new Converter();
        int result = converter.dollarToRuble(60);
        assertThat(result, is(1));
    }
	
    @Test
    public void euroToRuble() {
        Converter converter = new Converter();
        int result = converter.rubleToEuro(65);
        assertThat(result, is(1));
    }
	
    @Test
    public void rubleToEuro() {
        Converter converter = new Converter();
        int result = converter.euroToRuble(70);
        assertThat(result, is(1));
    }
}
