package ru.job4j.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
*Class CalculatorTest - класс для тестирования арифметических операций + - * /.
*@author Alexandr Bulanov
*@since 18.10.2018
*@version 0.1
*@param result - поле для хранения типов данных. 
*/
public class CalculatorTest {
	
	/**
	*Тест сложения.
	*assertThat - это статический метод из класса org.junit.Assert.assertThat;
	*Этот метод принимает две переменных. result и Matcher.
	*Matcher - в данном примере - это методы статический метод из класса import static org.hamcrest.core.Is.is;
	*Он определяет как сравнивать две переменных result и except.
	*В этом пример он сравнивает значения. то есть
	*result == except - если объекты равны. то код выполняется успешно. если выражения не равны. то программа падает с ошибкой.
	*/	
    @Test
    public void whenAddOnePlusOneThenTwo() {
        Calculator calc = new Calculator();
        calc.add(1D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }
	
	/**
	*Тест вычитания.
	*/	
    @Test
    public void whenSubOnePlusOneThenTwo() {
        Calculator calc = new Calculator();
        calc.sub(1D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }
	
	/**
	*Тест умножения.
	*/	
    @Test
    public void whenMultOnePlusOneThenTwo() {
        Calculator calc = new Calculator();
        calc.mult(1D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }
		
	/**
	*Тест деления.
	*/	
    @Test
    public void whenDivOnePlusOneThenTwo() {
        Calculator calc = new Calculator();
        calc.div(1D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }
}