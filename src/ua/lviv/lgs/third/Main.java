package ua.lviv.lgs.third;

public class Main {
	
	public static void main(String[] args) {
		
		Animal a = new Animal ("Леопард",45.3,4);
		System.out.println(a);
		System.out.println("Назва тварини = " + a.getName() 
				+ ", Швидкість тварини = " + a.getSpeed()
				+" км/год, Вік тварини = "+a.getAge() + " років" );
		a.setName("Bull");
		a.setSpeed(30.1);
		a.set(14);
		System.out.println(a);
		System.out.println("Назва тварини = " + a.getName() 
		+ ", Швидкість тварини = " + a.getSpeed()
		+" км/год, Вік тварини = "+a.getAge() + " років" );		
		
	}

}
