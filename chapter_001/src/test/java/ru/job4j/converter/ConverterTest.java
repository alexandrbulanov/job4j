package ru.job4j.converter;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ConverterTest {
    @Test
    public void when60RubleToDollarThen1() {
        Converter converter = new Converter();
        int result = converter.rubleToDollar(55);
        assertThat(result, is(1));
    }

	@Test
    public void when60DollarToRubleThen1() {
        Converter converter = new Converter();
        int result = converter.dollarToRuble(65);
        assertThat(result, is(1));
    }
	
    @Test
    public void when70RubleToEuroThen1() {
        Converter converter = new Converter();
        int result = converter.rubleToEuro(70);
        assertThat(result, is(1));
    }
	
    @Test
    public void when70EuroToRubleThen1() {
        Converter converter = new Converter();
        int result = converter.euroToRuble(75);
        assertThat(result, is(1));
    }
}