public class MyFirstGame {
	public static void main(String[] args) {
		int playerNumber = 2;
		int randomNumber = 4;

		if(playerNumber > randomNumber) {
			while(playerNumber >= 0) {
				if (playerNumber == randomNumber) {
					System.out.println("Вы угадали!");
					break;
				} else {
					System.out.println("Введенное вами число больше того, что загадал компьютер");
				}
			playerNumber--;	
			}	 
		} else if(playerNumber < randomNumber) {
			while(playerNumber <= 100) {
				if (playerNumber == randomNumber) {
					System.out.println("Вы угадали!");
					break;
				} else {
					System.out.println("Введенное вами число меньше того, что загадал компьютер");
				}
			playerNumber++;	
			}
		}		
	} 				
}