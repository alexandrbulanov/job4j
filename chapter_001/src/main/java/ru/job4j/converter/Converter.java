package ru.job4j.converter;

/**
 * Корвертор валюты.
 */
public class Converter {

    /**
     * Конвертируем рубли в доллары.
     * @param value рубли.
     * @return Доллары
     */
    public int rubleToDollar(int value) {
		
		return this.value/60;
    }

    /**
     * Конвертируем доллары в рубли.
     * @param value Доллары.
     * @return рубли.
     */
    public int dollarToRuble(int value) {
		return this.value*60;
    }
	
    /**
     * Конвертируем рубли в евро.
     * @param value рубли.
     * @return Евро.
     */
    public int rubleToEuro(int value) {
		return this.value/70;
    }
	
	 /**
     * Конвертируем евро в рубли.
     * @param value Евро.
     * @return рубли.
     */
    public int euroToRuble(int value) {
		return this.value*60;
    }
}

/**
1. Реализовать метод конвертации рублей в евро и доллары. 
Добавить формулу вычисления.
На текущий момент соотношение валют.
То есть, Вам нужно вместo -1 подставить формулу для вычисления валюты.
1 доллар = 60 рублей.
1 евро = 70 рублей.
2. Добавь еще два методы для обратно конвертации евро и долларов в рубли.
3. Воспользуйтесь тестом.

public class ConverterTest {
    @Test
    public void when60RubleToDollarThen1() {
        Converter converter = new Converter();
        int result = converter.rubleToDollar(60);
        assertThat(result, is(1));
    }

    @Test
    public void when70RubleToEuroThen1() {
        Converter converter = new Converter();
        int result = converter.rubleToEuro(70);
        assertThat(result, is(1));
    }
}

public class Solution {
        public static void main(String[] args) {
        System.out.println (convertEurToUsd(30, 0.55));
        System.out.println (convertEurToUsd(40, 0.55));
    }
    public static double convertEurToUsd(int eur, double course) {
        double dollar = eur * course;
        return dollar;
    }
}

*/
