package ua.lviv.lgs.first;

public class Main {
	
	public static void main(String[] args) {
		
		Robot r = new Robot("� robot");
		System.out.println(r);
		r.work(" ������ ������");
		System.out.println(r);
		
		System.out.println("---------------------");
		
		CoffeRobot cr = new CoffeRobot("� CoffeRobot", "Made a Coffe");
		System.out.println(cr);
		cr.work(" - � ������ ���� ����");
		System.out.println(cr);
		
		System.out.println("----------------------");
		
		RobotCoocker coor = new RobotCoocker("RobotCoocker", "Coocking");
		System.out.println(coor);
		coor.work(" � � ������ �����");
		System.out.println(coor);
		
		System.out.println("----------------------");
		
		RobotDancer rd = new RobotDancer("RobotDancer", "dancing");
		System.out.println(rd);
		rd.work("� � ������ ������");
		System.out.println(rd);
		
		System.out.println("----------------------");
		
		Robot[] robot = new Robot [4];
			robot[0] = r;
			robot [1] = cr;
			robot [2] = coor;
			robot [3] = rd;
			
			for (int i=0; i<=robot.length; i++) {
				System.out.println(i + " => ");
				System.out.println(robot[i]);
			}
			
			
			//System.out.println(robot[1]);
		
//		String [] arearobots = new String [4];
//			arearobots[0] = p;

//			System.out.println(arearobots[0]);
		
	}

}
