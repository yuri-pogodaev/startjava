//package com.startjava.lesson_1.calculator;

public class Calculator {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 3;
		char sign = '+';

		if(sign == '+') {
			System.out.println(num1 + num2);
		} else if(sign == '-') {
			System.out.println(num1 - num2);
		} else if(sign == '*') {
			System.out.println(num1 * num2);
		} else if(sign == '/') {
			System.out.println(num1 / num2);
		} else if(sign == '%') {
			System.out.println(num1 % num2);
		} else if(sign == '^') {
			int result = 1;
			int counter = 1;
			do {
				counter++;
				result *= num1;
			} while (counter <= num2);
			System.out.println(result);
		}		
	}
}