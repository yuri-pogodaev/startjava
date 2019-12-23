import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        while (true) {

            System.out.println("Введите первое число: ");
            Scanner scanFirstNumber = new Scanner(System.in);
            int numberFirst = scanFirstNumber.nextInt();

            System.out.println("Введите знак математической операции: ");
            Scanner scanSign = new Scanner(System.in);
            String sign = scanSign.nextLine();

            System.out.println("Введите второе число: ");
            Scanner scanSecondNumber = new Scanner(System.in);
            int numberSecond = scanSecondNumber.nextInt();

            System.out.println(sign + " " + numberFirst + " " + numberSecond);

            String answer = "";
            while (true) {
                System.out.println("Будешь играть?");
                Scanner scanAnswer = new Scanner(System.in);
                answer = scanAnswer.nextLine();
                if (answer.equals("нет") || answer.equals("да")) {
                    break;
                }
            }
            if (answer.equals("нет")) break;
        }
    }
}