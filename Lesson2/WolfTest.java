public class WolfTest {
	public static void main(String[] args) {
		Wolf wolf = new Wolf();
		wolf.setGender("man");
		wolf.setNickname("Tzar");
		wolf.setWeight(20.5f);
		wolf.setAge(9);
		wolf.setColor("red");
		wolf.move();
		wolf.sit();
		wolf.run();
		wolf.howl();
		wolf.hunt();

		System.out.println("Gender wolf is a " + wolf.getGender());
		System.out.println("Nickname wolf is a " + wolf.getNickname());
		System.out.println("Weight wolf is " + wolf.getWeight());
		System.out.println("Age wolf is " + wolf.getAge());
		System.out.println("Color of wolf is " + wolf.getColor());
	}
}