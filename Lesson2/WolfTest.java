public class WolfTest {
	public static void main(String[] args) {
		Wolf wolf = new Wolf();
		wolf.gender = "man";
		wolf.nickname = "Tzar";
		wolf.weight = 20.5f;
		wolf.age = 9;
		wolf.color = "red";
		wolf.move();
		wolf.sit();
		wolf.run();
		wolf.howl();
		wolf.hunt();

		System.out.println("Gender wolf is a " + wolf.gender);
		System.out.println("Nickname wolf is a " + wolf.nickname);
		System.out.println("Weight wolf is " + wolf.weight);
		System.out.println("Age wolf is " + wolf.age);
		System.out.println("Color of wolf is " + wolf.color);
	}
}