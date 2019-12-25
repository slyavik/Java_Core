package ua.lviv.lgs.second;

public class Body {

	private String name;
	private String type;
	
	
	Body (String name, String type) {
		this.name = name;
		this.type = type;
	}
	
	public String getName () {
		return name;
	}
	
	public String getType() {
		return type;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String toString() {
		return "Body[ name = "+name+", type = "+type+" ]";
	}
	
	public void lenghtbody(double l2 ) {
		this.type = type + (l2+l2);
	}
	
	public void changeBody(String newName, String newType) {
		this.name = newName;
		this.type = newType;
	}
	
}