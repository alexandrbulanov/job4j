package ru.job4j.fit;

import org.junit.Test;

import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.assertThat;

public class FitTest {

    @Test
    public void manWeight() {
        Fit fit = new Fit();
        double weight = fit.manWeight(180);
        assertThat(weight, closeTo(92.0, 0.1));
    }

    @Test
    public void womanWeight() {
        Fit fit = new Fit();
        double weight = fit.womanWeight(170);
        assertThat(weight, closeTo(69.0, 0.1));
 }
}

/**
В этом тесты мы используем метод closeTo - Он нужен чтобы сравнивать числа 
с плавающей точкой.
В Java нельзя сравнить два числа разного типа. Например
Это связано с арифметическими операция. например 7.0 - 1.0 даст 5.99999999
Поэтому результат вычисления мы должны сравнивать через специальный метод.
closeTo(value, round)
value - это ожидаемое значение
round - это диапазон в округ значения. например, если round = 0.1, 
то диапазон будет [value - 0.1, value + 0.1];
Ожидаемое значение должно попасть в этот диапазон.
*/
