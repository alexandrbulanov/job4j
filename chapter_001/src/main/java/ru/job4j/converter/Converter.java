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
        return value/55;
    }

    /**
     * Конвертируем доллары в рубли.
     * @param value Доллары.
     * @return рубли.
     */
    public int dollarToRuble(int value) {
        return value*60;
    }

    /**
     * Конвертируем рубли в евро.
     * @param value рубли.
     * @return Евро.
     */
    public int rubleToEuro(int value) {
        return value/75;
    }

    /**
     * Конвертируем евро в рубли.
     * @param value Евро.
     * @return рубли.
     */
    public int euroToRuble(int value) {
        return value*65;
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

*/
