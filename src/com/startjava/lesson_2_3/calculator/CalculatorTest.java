package com.startjava.lesson_2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        while (true) {
            System.out.print("Введите первое число: ");
            Scanner scanner = new Scanner(System.in);
            int firstNumber = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Введите знак математической операции: ");
            String sign = scanner.nextLine();

            System.out.print("Введите второе число: ");
            int secondNumber = scanner.nextInt();
            scanner.nextLine();

            Calculator calculator = new Calculator(firstNumber, secondNumber, sign);
            calculator.calculate();
            String answer = "";
            while (!(answer.equals("нет") || answer.equals("да"))) {
                System.out.print("Хотите продолжить? [да/нет]: ");
                answer = scanner.nextLine();
            }
            if (answer.equals("нет")) break;
        }
    }
}