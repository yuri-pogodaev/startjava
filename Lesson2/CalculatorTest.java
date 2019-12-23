import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = null;
        while (true) {
            System.out.print("Введите первое число: ");
            scanner = new Scanner(System.in);
            int numberFirst = scanner.nextInt();
            
            System.out.print("Введите знак математической операции: ");
            scanner.nextLine();
            String sign = scanner.nextLine();

            System.out.print("Введите второе число: ");
            int numberSecond = scanner.nextInt();
            scanner.nextLine();

            Calculator calculator = new Calculator(numberFirst, numberSecond, sign);
            calculator.calculate();
            String answer = "";
            while (!(answer.equals("нет") || answer.equals("да"))) {
                System.out.print("Хотите продолжить? [да/нет]: ");
                scanner = new Scanner(System.in);
                answer = scanner.nextLine();
            }
            if (answer.equals("нет")) break;
        }
    }
}