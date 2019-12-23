public class JaegerTest {
	public static void main(String[] args) {
	Jaeger jaegerOne = new Jaeger("Crimson Typhoon", 76.2f, 1722, 9, 8, 6);
	System.out.println(jaegerOne);
	jaegerOne.useWeapon();
	jaegerOne.usePowerMove();

	Jaeger jaegerTwo = new Jaeger("Gipsy Danger", 79.5f, 1980, 7, 8, 6);
	System.out.println(jaegerTwo);
	jaegerTwo.useWeapon();
	jaegerTwo.usePowerMove();

	}
}