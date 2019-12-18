public class ConditionalStatement {
	public static void main(String[] args) {
		int age = 29;
		if(age > 20) {
			System.out.println("Not at all");
		}

		boolean isYourMan = true;
		
		if(isYourMan == true) {
			System.out.println("Это еще ничего не значит");
		} else if(isYourMan == false) {
			System.out.println("Вам может быть повезло в этой жизни");
		}

		double hight = 1.82;
		if(hight > 1.80) {
			System.out.println("Вы довольно высокий");
		} else if(hight < 1.80) {
			System.out.println("Рост не главное для человека");
		}

		String firstNameLetter = "Ю";

		if(firstNameLetter == "М") {
			System.out.println("Может вас зовут Максим");
		} else if(firstNameLetter == "N") {
			System.out.println("Может вас зовут Nлья");
		} else {
			System.out.println("Давай угадай имя");
		}
	}
}