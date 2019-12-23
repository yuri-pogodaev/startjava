public class Jaeger {
	private String modelName;
	private float height;
	private int weight;
	private int speed;
	private int strength;
	private int armor;

	public String getModelName() {
		return modelName;
	}

	void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public float getHeight() {
		return height;
	}

	void setHeight(float height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	void setWeight(int weight) {
		this.weight = weight;
	}

	public int getSpeed() {
		return speed;
	}

	void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getStrength() {
		return strength;
	}

	void setStrength(int strength) {
		this.strength = strength;
	}

	public int getArmor() {
		return armor;
	}

	void setArmor(int armor) {
		this.armor = armor;
	}

	public void useWeapon() {
		if(modelName.equals("Crimson Typhoon")) {
			System.out.println("You use IB22 Plasmacaster");
		} else if(modelName.equals("Gipsy Danger")) {
			System.out.println("You use I-19 Plasmacaster");
		}
	}

	public void usePowerMove() {

	}
}