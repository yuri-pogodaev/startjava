public class Calculator{
	public static void main(String[] args){
		int num1 = 10;
		int num2 = 3;
		for(int i = 0 ; i < 6 ; i++){
			if(i == 0){
				System.out.println(num1 + num2);
			}
			if(i == 1){
				System.out.println(num1 - num2);
			}
			if(i == 2){
				System.out.println(num1 * num2);
			}
			if(i == 3){
				System.out.println(num1 / num2);
			}
			if(i == 4){
				System.out.println(num1 % num2);
			}
			if(i == 5){
				int result = 1;
				int k=1;
				do{
					k++;
					result = result * num1;
				} while (k <= num2);
				
				System.out.println(result);
			}
			
		}		
	}
}