package ua.lviv.lgs.third;

public class Main {
	
	public static void main(String[] args) {
		
		Animal a = new Animal ("�������",45.3,4);
		System.out.println(a);
		System.out.println("����� ������� = " + a.getName() 
				+ ", �������� ������� = " + a.getSpeed()
				+" ��/���, ³� ������� = "+a.getAge() + " ����" );
		a.setName("Bull");
		a.setSpeed(30.1);
		a.set(14);
		System.out.println(a);
		System.out.println("����� ������� = " + a.getName() 
		+ ", �������� ������� = " + a.getSpeed()
		+" ��/���, ³� ������� = "+a.getAge() + " ����" );		
		
	}

}
