public class JaegerTest {
	public static void main(String[] args) {
	Jaeger jaegerOne = new Jaeger();
	jaegerOne.setModelName("Crimson Typhoon");
	jaegerOne.setHeight(76.2f);
	jaegerOne.setWeight(1722);
	jaegerOne.setSpeed(9);
	jaegerOne.setStrength(8);
	jaegerOne.setArmor(6);
	jaegerOne.useWeapon();
	jaegerOne.usePowerMove();
	System.out.println("Модель " + jaegerOne.getModelName());
	System.out.println("Высота " + jaegerOne.getHeight());
	System.out.println("Вес " + jaegerOne.getWeight());
	System.out.println("Скорость " + jaegerOne.getSpeed());
	System.out.println("Сила " + jaegerOne.getStrength());
	System.out.println("Броня " + jaegerOne.getArmor());

	Jaeger jaegerTwo = new Jaeger();
	jaegerTwo.setModelName("Gipsy Danger");
	jaegerTwo.setHeight(79.5f);
	jaegerTwo.setWeight(1980);
	jaegerTwo.setSpeed(7);
	jaegerTwo.setStrength(8);
	jaegerTwo.setArmor(6);
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