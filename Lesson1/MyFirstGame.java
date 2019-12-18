public class MyFirstGame{
	public static void main(String[] args){
		int number = 0;
		int random = 36;
		while(number <= 100){
			if (number == random){
				System.out.println("Вы угадали!");
				break;
			} else{
			if(number < random){
				System.out.println("Введенное вами число меньше того, что загадал компьютер");
			} else if(number > random){
				System.out.println("Введенное вами число больше того, что загадал компьютер");
			}	
			}
			number++;
		} 
				
				
	}
}