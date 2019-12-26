package com.startjava.lesson_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите математическое выражение: ");
            String scan = scanner.nextLine();

            Calculator calculator = new Calculator(scan);
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