package ua.lviv.lgs.second;

public class Wheel {
	
	private String profile;
	private double diametrWheel;
	
	Wheel (String profile, double diametrWheel) {
		this.profile = profile;
		this.diametrWheel = diametrWheel;
	}
	
	public String getProfile () {
		return profile;
	}
	public double getDiametrWheel() {
		return diametrWheel;
	}
	
	public void setProfile (String profile) {
		this.profile = profile;
	}
	public void setDiametrWheel(double diametrWheel) {
		this.diametrWheel = diametrWheel;
	}
	
	public String toString() {
		return "Wheel[profile="+profile+", diametrWheel = "+diametrWheel+" ]";
	}
	
	public void bigWheel(double plusWheel) {
		this.diametrWheel = diametrWheel+plusWheel;
	}
	
	public void changeWheel (String newProfile) {
		this.profile = newProfile;
	}
}
