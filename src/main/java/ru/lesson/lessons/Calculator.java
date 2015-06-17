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
	 public String opr;
	 /**
	  * Суммируем аргументы.
	  * @param params Аргументы суммирования.
	  */
	public void operations(String op) {
		this.opr=op;
	}
	
	public void add(int ... params) {
		int i=0;
		for (Integer param : params) {
			if(opr.equals("+"))
			   this.result +=  param;
		    else { if(i==0) {
				this.result=param;
				i++;
			}
			     else {
		    if(opr.equals("-"))
			   this.result = this.result-param;
		    if(opr.equals("*"))
			   this.result = this.result*param;
		    if(opr.equals("/"))
			   this.result = this.result/param;
		    if(opr.equals("^"))
			   this.result = (int)Math.pow(this.result, param);
			}
		}
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