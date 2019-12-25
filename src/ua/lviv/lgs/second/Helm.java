package ua.lviv.lgs.second;

public class Helm {
	
	private String type;
	private double diametrHelm;
	
	Helm (String type, double diametrHelm) {
		this.type = type;
		this.diametrHelm = diametrHelm;
	}
	
	public String getType() {
		return type;
	}
	public double getDiametrHelm() {
		return diametrHelm;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	public void setDiametrHelm (double diametrHelm) {
		this.diametrHelm = diametrHelm;
	}
	
	public String toString() {
		return "Helm[type="+type+", diametrHelm="+diametrHelm+"]";
	}
	
	public void bigDiametr(double plus) {
		this.diametrHelm = diametrHelm + plus;
	}
	
	public void changeHelm (double newDiametr) {
		this.diametrHelm = newDiametr;
	}

}