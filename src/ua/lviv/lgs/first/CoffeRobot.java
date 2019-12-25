package ua.lviv.lgs.first;

public class CoffeRobot extends Robot {

	private String type;
	
	CoffeRobot (String name, String type) {
		super ("CoffeRobot");
		this.type = type;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String toString () {
		return "CoffeRobot [type = "+type+", name = "+super.getName()+"]";
	}
}
