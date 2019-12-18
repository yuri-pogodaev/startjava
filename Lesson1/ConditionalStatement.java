public class ConditionalStatement {
	public static void main(String[] args){
		int age = 29;
		if(age > 20){
			System.out.println("Not at all");
		}
		String male = "1";
		String man = "1";
		String woman = "2";
		
		if(male == man) {
			System.out.println("Это еще ничего не значит");
		} else if(male == woman){
			System.out.println("Вам может быть повезло в этой жизни");
		}
		double hight = 1.82;
			if(hight > 1.80){
			System.out.println("Вы довольно высокий");
		} else if(hight < 1.80){
			System.out.println("Рост не главное для человека");
		}
		String firstnameletter = "Ю";
		String letter1 = "М";
		String letter2 = "N"; 
		    if(firstnameletter == letter1){
			System.out.println("Может вас зовут Максим");
		} else if(firstnameletter == letter2){
			System.out.println("Может вас зовут Nлья");
		} else{
			System.out.println("Давай угадай имя");
		}
	}
}