package com.startjava.lesson_2_3.calculator;

public class Calculator {
    private int firstNumber;
    private int secondNumber;
    private String sign;

    public Calculator(int firstNumber, int secondNumber, String sign) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.sign = sign;
    }

    public void calculate() {
        switch (sign) {
            case "+" :
                System.out.println(firstNumber + secondNumber);
                break;
            case "-" :
                System.out.println(firstNumber - secondNumber);
                break;
            case "*" :
                System.out.println(firstNumber * secondNumber);
                break;
            case "/" :
                System.out.println(firstNumber / secondNumber);
                break;
            case "%" :
                System.out.println(firstNumber % secondNumber);
                break;
            case "^" :
                int result = 1;
                for(int i = 0; i < secondNumber; i++) {
                    result *= firstNumber;     
                }  
                System.out.println(result);
                break;
            default :
                System.out.println("wrong sign");
        }
    }
}