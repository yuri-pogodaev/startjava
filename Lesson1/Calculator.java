public class Calculator {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 3;
		char ch = '+';

		if(ch == '+') {
			System.out.println(num1 + num2);
		} else if(ch == '-') {
			System.out.println(num1 - num2);
		} else if(ch == '*') {
			System.out.println(num1 * num2);
		} else if(ch == '/') {
			System.out.println(num1 / num2);
		} else if(ch == '%') {
			System.out.println(num1 % num2);
		} else if(ch == '^') {
			int result = 1;
			int numberOperation = 1;
			do {
					numberOperation++;
					result *= num1;
			} while (numberOperation <= num2);
			System.out.println(result);
		}		
	}
}