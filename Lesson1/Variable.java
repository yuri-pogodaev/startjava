public class Variable {
	public static void main(String[] args) {
		byte hhd = 1;
		short numProc = 4;
		int hhdMemory = 500;
		long lanSpeed  = 100;
		float procFrequency = 2.10f;
		double ram = 4.00f;
		int modelComp = 120;
		boolean isTrueComp = false;
		
		System.out.println("Количество жестких дисков" + " " + hhd);		
		System.out.println("Количество процессоров" + " " + numProc);
		System.out.println("Память жесткого диска" + " " + hhdMemory + " " + "ГБ");
		System.out.println("Скорость интернета" + " " + lanSpeed + " " + "Мбит/с");
		System.out.println("Частота процессоров" + " " + procFrequency + " " + "ГГц");
		System.out.println("Оперативная память"+ " " + ram + " " + "ГБ");
		System.out.println("Модель компьютера" + " " + (char) modelComp);
		System.out.println("Это настоящий компьютер" + " " + isTrueComp);
	}
}