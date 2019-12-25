package ua.lviv.lgs.first;

public class RobotCoocker extends Robot {

	private String type;
	
	RobotCoocker(String name, String type) {
		super (name);
		this.type = type;
		}
	
	public String getTupe () {
		return type;
	}
	
	public void setType(String type) {
		this.type =type;
	}

	@Override
	public String toString() {
		return "RobotCoocker [type=" + type + ", name = "+ super.getName() +"]";
	}
	
	
}
