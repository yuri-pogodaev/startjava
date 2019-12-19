public class Wolf {
	private String gender;
	private String nickname;
	private float weight;
	private int age;
	private String color;

	public String getGender() {
		return gender;
	}

	void setGender(String gender) {
		this.gender = gender;
	}

	public String getNickname() {
		return nickname;
	}

	void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public float getWeight() {
		return weight;
	}

	void setWeight(float weight) {
		this.weight = weight;
	}

	public int getAge() {
		return age;
	}

	void setAge(int age) { 
		if(age > 8) {
			System.out.println("Некорректный возраст");
		} else{
			this.age = age;
		}
		
	}

	void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void move() {

	}

	public void sit() {

	}

	public void run() {

	}

	public void howl() {

	}

	public void hunt() {

	}
}
