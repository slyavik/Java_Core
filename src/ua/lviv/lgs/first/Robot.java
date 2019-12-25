package ua.lviv.lgs.first;

public class Robot {

	private String name;

	Robot(String name) {
		this.name = name;
	}

	
	public String getName () {
		return name;
	}
	
	
	public void work(String function) {
		this.name = name + function;
	} 
	
	public String toString () {
		return " Robot [name = "+ name +"] ";
	}
	
}
