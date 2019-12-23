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
                int counter = 1;
                if(secondNumber == 0){
                    result = 1;
                } else{
                do {
                counter++;
                result *= firstNumber;
                } while (counter <= secondNumber);
                System.out.println(result);
                break;}
            default :
                System.out.println("wrong sign");
        }
    }
}