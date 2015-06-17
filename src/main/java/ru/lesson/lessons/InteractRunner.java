package ru.lesson.lessons;

import java.util.Scanner;

/**
    Класс для запуска калькулятора. Поддерживает ввод пользователя.
*/
public class InteractRunner {
	public static void main(String[] arg) {
		Scanner reader = new Scanner(System.in);
		try {
			Calculator calc = new Calculator();
			String exit = "no";
			String operation="";
			while(!exit.equals("yes")) {
				System.out.println("Enter first arg : ");
				String first = reader.next();
				for (int i=0;i<1;) {
				System.out.println("Operation + or - or / or * or ^ : ");
				operation = reader.next();
				if(operation.equals("+") | operation.equals("-") | operation.equals("/") | operation.equals("*") | operation.equals("^"))
					i=1;
				else System.out.println("Enter + or - or / or * or ^ :");
				}
				System.out.println("Enter second arg : ");
				String second = reader.next();
			    calc.operations(operation);
				calc.add(Integer.valueOf(first), Integer.valueOf(second));
				System.out.println("Result : "+calc.getResult());
				calc.cleanResult();
				System.out.println("Exit : yes/no ");
				exit=reader.next();
			}
		} finally {
			reader.close();
		}
	}
}