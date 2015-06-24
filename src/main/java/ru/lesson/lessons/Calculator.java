package ru.lesson.lessons;

import java.lang.Math;
/**
 * Класс ркализует калькулятор.
*/
public class Calculator {
     /**
	  Результат вычисления.
     */
     private int result;
	 /**
	  * Суммируем аргументы.
	  * @param params Аргументы суммирования.
	  */
	public void add(int ... params) {
		for (int param : params) {
			   this.result +=  param;
		}
	}

	/**
	 * Вычисляем деление
	 * @param args входящие аргументы.
	 * @throws UserException Если аргументов нет, выкидываем исключение.
	 */
	public void div(int ... args) throws UserException {
		if (args.length>0) {
			this.result =args[0];
			for (int params : args) {
				if (params==0) {
					throw new IllegalArgumentException("You try to div by 0. Pleas change arg!");
				}
				this.result /= params;
			}
		} else {
			throw new UserException("You should enter args!");
		}
	}
	/**
	    Получить результат.
		@return результат вычисления.
	*/
	public int getResult() {
		return this.result;
	}
	
	/**
	    Очистить результат вычисления.
	*/
	public void cleanResult() {
		this.result=0;
	}
}