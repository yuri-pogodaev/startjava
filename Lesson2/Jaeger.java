public class Jaeger {
	private String modelName;
	private float height;
	private int weight;
	private int speed;
	private int strength;
	private int armor;

	public Jaeger(String modelName, float height, int weight, int speed, int strength, int armor) {
		this.modelName = modelName;
		this.height = height;
		this.weight = weight;
		this.speed = speed;
		this.strength = strength;
		this.armor = armor ;
	}

	public String getModelName() {
        return modelName;
    }

    public float getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public int getSpeed() {
        return speed;
    }

    public int getStrength() {
        return strength;
    }

    public int getArmor() {
        return armor;
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