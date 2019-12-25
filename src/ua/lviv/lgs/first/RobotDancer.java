package ua.lviv.lgs.first;

public class RobotDancer extends Robot {
	
	private String type;

	RobotDancer(String name, String type) {
		super(name);
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "RobotDancer [type=" + type + ", name = "+ super.getName() +"]";
	}
	
	
	
	
	
	
}
