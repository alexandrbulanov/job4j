package ru.job4j.array;

/**
 *@author Alexandr Bulanov
 *@since 07.11.2018
 *@version 0.1
 */

import java.util.*;

/**
 * data: целочисленный массив
 * n: количество элементов в массиве
 */

public class SortArray {

    public static boolean masSorted(int[] data, int n) {
        // Нулевое значение или менее двух элементов - сортируется.
        if (data == null || n < 2) {
            return true;
        } else if (data[n - 2] > data[n - 1]) {
            // Если элемент до (n-2) больше (n-1)
            return false;
        }
        // recurse.
        return masSorted(data, n - 1);
    }

    public static void main(String[] args) {
        int[] data = {2, 3, 5};
        System.out.println(Arrays.toString(data) + (masSorted(data, data.length) ? " Отсортирован" : " НЕ отсортирован"));
    }
}