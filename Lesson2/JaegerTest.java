public class JaegerTest {
	public static void main(String[] args) {
	Jaeger jaegerOne = new Jaeger("Crimson Typhoon", 76.2f, 1722, 9, 8, 6);

	jaegerOne.useWeapon();
	jaegerOne.usePowerMove();
	System.out.println("Модель " + jaegerOne.getModelName());
	System.out.println("Высота " + jaegerOne.getHeight());
	System.out.println("Вес " + jaegerOne.getWeight());
	System.out.println("Скорость " + jaegerOne.getSpeed());
	System.out.println("Сила " + jaegerOne.getStrength());
	System.out.println("Броня " + jaegerOne.getArmor());

	Jaeger jaegerTwo = new Jaeger("Gipsy Danger", 79.5f, 1980, 7, 8, 6);
	jaegerTwo.useWeapon();
	jaegerTwo.usePowerMove();
	System.out.println("Модель " + jaegerTwo.getModelName());
	System.out.println("Высота " + jaegerTwo.getHeight());
	System.out.println("Вес " + jaegerTwo.getWeight());
	System.out.println("Скорость " + jaegerTwo.getSpeed());
	System.out.println("Сила " + jaegerTwo.getStrength());
	System.out.println("Броня " + jaegerTwo.getArmor());
	}
}