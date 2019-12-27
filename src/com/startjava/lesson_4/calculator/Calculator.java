package com.startjava.lesson_4.calculator;

public class Calculator {
    private String mathExpression;

    public Calculator(String problem) {
        this.mathExpression = problem;
    }

    public void calculate() {
        String[] parsedMathExpression = mathExpression.split(" ");
        String firstNumber = parsedMathExpression[0];
        String sign = parsedMathExpression[1];
        String secondNumber = parsedMathExpression[2];
        switch (sign) {
            case "+":
                System.out.println(Math.addExact(Integer.parseInt(firstNumber), Integer.parseInt(secondNumber)));
                break;
            case "-":
                System.out.println(Math.subtractExact(Integer.parseInt(firstNumber), Integer.parseInt(secondNumber)));
                break;
            case "*":
                System.out.println(Math.multiplyExact(Integer.parseInt(firstNumber), Integer.parseInt(secondNumber)));
                break;
            case "/":
                System.out.println(Math.floorDiv(Integer.parseInt(firstNumber), Integer.parseInt(secondNumber)));
                break;
            case "%":
                System.out.println(Integer.parseInt(firstNumber) % Integer.parseInt(secondNumber));
                break;
            case "^":
                System.out.println(Math.pow(Double.parseDouble(firstNumber), Double.parseDouble(secondNumber)));
                break;
            default:
                System.out.println("wrong sign");
        }
    }
}