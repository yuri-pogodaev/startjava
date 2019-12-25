package com.startjava.lesson_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        while (true) {
            String[] mathExpression = null;
            String sign = "";
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите математическое выраженте: ");
            String scan = scanner.nextLine();
            if (scan.contains("/")) {
                mathExpression = scan.split("/");
                sign = "/";
            } else if (scan.contains("^")) {
                mathExpression = scan.split("\\^");
                sign = "^";
            } else if (scan.contains("-")) {
                mathExpression = scan.split("-");
                sign = "-";
            }else if (scan.contains("+")) {
                mathExpression = scan.split("\\+");
                sign = "+";
            } else if (scan.contains("*")) {
                mathExpression = scan.split("\\*");
                sign = "*";
            } else if (scan.contains("%")) {
                mathExpression = scan.split("%");
                sign = "%";
            }

            Calculator calculator = new Calculator(mathExpression[0],mathExpression[1],sign);
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
