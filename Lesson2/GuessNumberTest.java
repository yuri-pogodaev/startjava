import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите имя первого парня ");
            String firstName = scanner.nextLine();
            Player player1 = new Player(firstName);
            System.out.println("Введите имя второго парня ");
            String secondName = scanner.nextLine();
            Player player2 = new Player(secondName);

            GuessNumber guessNumber = new GuessNumber(player1, player2);
        
            guessNumber.startGame();
            
            String answer = "";
            while (!(answer.equals("нет") || answer.equals("да"))) {
                System.out.print("Хотите продолжить? [да/нет]: ");
                answer = scanner.nextLine();
            }
            if (answer.equals("нет")) break;
		}
	}
}
