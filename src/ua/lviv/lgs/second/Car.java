package ua.lviv.lgs.second;

public class Car {

	private String name;
	private int doors;
	private String engine;
	private double capacity;
	private Body body;
	private Helm helm;
	private Wheel wheel;
	
	Car (String name, int doors, String engine, double capacity,
			Body body, Helm helm, Wheel wheel) {
		super();
		this.name = name;
		this.doors = doors;
		this.engine = engine;
		this.capacity = capacity;
		this.body = body;
		this.helm = helm;
		this.wheel = wheel;
	}
	
	public Body getBody() {
		return body;
	}
	public void setBody(Body body) {
		this.body = body;
	}
	
	public Helm getHelm() {
		return helm;
	}
	public void setHelm(Helm helm) {
		this.helm = helm;
	}
	
	public Wheel getWheel() {
		return wheel;
	}
	public void setWheel (Wheel wheel) {
		this.wheel = wheel;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", doors=" + doors + ", engine=" + engine + ", capacity=" + capacity + ", body= "+body+", helm = "+helm+", wheel="+wheel+"]";
	}

	public void changeCar (String newName) {
		this.name  = newName;
	}
	
//	public void changeBodyHelmWheel(int newDoors, Body newBodyName, 
//			Helm newHelmType, Wheel newWheelDiametr) {
//		this.doors = newDoors;
//		this.body = newBodyName;
//		this.helm = newHelmType;
//		this.wheel = newWheelDiametr;
//	} 
	

}
