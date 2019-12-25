package ua.lviv.lgs.second;

public class Main {
	
	public static void main(String[] args) {
					System.out.println("---------------body Кузов");		
		Body b = new Body("oka ","sedan ");
		System.out.println(b);
		b.lenghtbody(2.5);
		System.out.println(b);
					System.out.println("---------------Helm Кермо");		
		Helm h = new Helm("standart ",17.3);
		System.out.println(h);
		h.bigDiametr(1.5);
		System.out.println(h);
					System.out.println("---------------Wheel Колесо");		
		Wheel w = new Wheel("sleem",17.5);
		System.out.println(w);
		w.bigWheel(2.8);
		System.out.println(w);
					System.out.println("---------------Car Автомобіль");						
		Car c = new Car("Lada",3,"oil",1.6, new Body("L-8","sedan"), new Helm("sport", 15), new Wheel("sleel", 17.5));
		System.out.println(c);
		
		Car c2 = new Car ("rere",222,"eee",23.3,b,h,w);
		System.out.println(c2);
		
		System.out.println();
		
		c2.changeCar("newCar");
		b.changeBody("new L-9", "newSedan");
		h.changeHelm(30.2);
		w.changeWheel("wide");
		System.out.println(c2);
	}

}
