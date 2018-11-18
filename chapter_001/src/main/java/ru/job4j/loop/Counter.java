package ru.job4j.loop;

/**
 *Class Counter - Подсчет суммы чётных чисел в диапазоне.
 *@author Alexandr Bulanov
 *@since 31.10.2018
 *@version 0.1
 */

public class Counter {
    /**
     *Сложение.
     *@param start - первый аргумент.
     *@param finish - последний аргумент.
     *@param sum подсчет суммы
     *@param result - результат.
     */
    public int add(int start, int finish) {
        int i, sum = 0;
        for (i = start; i <= finish; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }
}