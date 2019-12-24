import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private int computerNumber;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        Random random = new Random();
        computerNumber = random.nextInt((101));
    }

    public void startGame() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println(player1.getName() + " введите ваше число ");
            player1.setNumber(scanner.nextInt());
            if (player1.getNumber() == computerNumber) {
                System.out.println(player1.getName() + " победил");
                break;
            } else if (player1.getNumber() > computerNumber) {
                System.out.println("Введенное число больше загаданного");
            } else if (player1.getNumber() < computerNumber) {
                System.out.println("Введенное число меньше загаданного");
            }

            System.out.println(player2.getName() + " введите ваше число ");
            player2.setNumber(scanner.nextInt());
            if (player2.getNumber() == computerNumber) {
                System.out.println(player2.getName() + " победил");
                break;
            } else if (player2.getNumber() > computerNumber) {
                System.out.println("Введенное число больше загаданного");
            } else if (player2.getNumber() < computerNumber) {
                System.out.println("Введенное число меньше загаданного");
            }
        }
    }
}