package ru.job4j.max;

/**
 * Максимум из двух чисел.
 *@author Alexandr Bulanov
 *@since 28.10.2018
 *@version 0.1
 */

public class MaxThird {
    /**
     *@param first - первое число.
     *@param second - второе число.
     *@param thid - второе число.
     *@return Вывод максимального числа.
     */
    public int max(int first, int second, int thid) {
        return Math.max(first, Math.max(second, thid));
        //return max(first, max(second, thid));
    }
}
