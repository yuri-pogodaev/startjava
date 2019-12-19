public class MyFirstGame {
	public static void main(String[] args) {
		int playerNumber = 4;
		int randomNumber = 2;

		if(playerNumber > randomNumber) {
			while(playerNumber <= 100 ) {
				if (playerNumber == randomNumber) {
					System.out.println("Вы угадали!");
					break;
				} else if(playerNumber > randomNumber) {
					System.out.println("Введенное вами число больше того, что загадал компьютер");
				}
			}	 
			playerNumber--;
		} else if(playerNumber < randomNumber) {
			while(playerNumber <= 100) {
				if (playerNumber == randomNumber) {
					System.out.println("Вы угадали!");
					break;
				} else if(playerNumber < randomNumber) {
					System.out.println("Введенное вами число меньше того, что загадал компьютер");
				}
			}
			playerNumber++;
		}		
	} 				
}