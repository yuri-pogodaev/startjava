package com.startjava.lesson_4.calculator;

public class Calculator {
    private String firstNumber;
    private String secondNumber;
    private String sign;
    public Calculator(String firstNumber, String secondNumber, String sign) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.sign = sign;
    }

    public void calculate() {
        switch (sign) {
            case "+" :
                System.out.println(Math.addExact(Integer.parseInt(firstNumber),Integer.parseInt(secondNumber)));
                break;
            case "-" :
                System.out.println(Math.subtractExact(Integer.parseInt(firstNumber),Integer.parseInt(secondNumber)));
                break;
            case "*" :
                System.out.println(Math.multiplyExact(Integer.parseInt(firstNumber),Integer.parseInt(secondNumber)));
                break;
            case "/" :
                System.out.println(Math.floorDiv(Integer.parseInt(firstNumber),Integer.parseInt(secondNumber)));
                break;
            case "%" :
                System.out.println(Integer.parseInt(firstNumber) & Integer.parseInt(secondNumber));
                break;
            case "^" :
                System.out.println(Math.pow(Double.parseDouble(firstNumber),Double.parseDouble(secondNumber)));

                break;
            default :
                System.out.println("wrong sign");
        }
    }
}