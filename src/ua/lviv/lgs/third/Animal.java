package ua.lviv.lgs.third;

public class Animal {
	
	private String name;
	private double speed;
	private int age;
	
	Animal (String name, double speed, int age)  {
		this.name = name;
		this.speed = speed;
		this.age = age;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	
	public int getAge() {
		return age;
	}
	public void set(int age) {
		this.age = age;
	}
	
	public String toString() {
		return "Animal[ name = "+name+", speed="+speed+", age="+age+" ]";
	}
}
