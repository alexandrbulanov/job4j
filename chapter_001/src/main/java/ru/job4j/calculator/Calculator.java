package ru.job4j.calculator;

/**
*Class Calculator - класс для вычисления арифметических операций + - * /.
*@author Alexandr Bulanov
*@since 18.10.2018
*@version 0.1
*@param result - поле для хранения типов данных. 
*/
public class Calculator {
    private double result;

	/**
	*Сложение.
	*@param first - первый аргумент.
	*@param second - второй аргумент.
	*@param result - результат.
	*/	
    public void add(double first, double second) {
        this.result = first + second;
    }

	/**
	*Вычитание.
	*@param first - первый аргумент.
	*@param second - второй аргумент.
	*@param result - результат.
	*/	
    public void sub(double first, double second) {
        this.result = first - second;
    }

	/**
	*Умножение.
	*@param first - первый аргумент.
	*@param second - второй аргумент.
	*@param result - результат.
	*/
    public void mult(double first, double second) {
        this.result = first * second;
    }

	/**
	*Деление.
	*@param first - первый аргумент.
	*@param second - второй аргумент.
	*@param result - результат.
	*/
    public void div(double first, double second) {
        this.result = first / second;
    }

	/**
	*Возвращение значения поля result.	
	*@param result - результат.
	*/
    public double getResult() {
        return this.result;
    }
}
