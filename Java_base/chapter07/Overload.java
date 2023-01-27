package chapter07;

public class Overload {
	
	private String name;
	private int age;
	private float h;
	
	public Overload() {
		age=0;
		h=0;
		name="익명";
	}
	
	public Overload(int a, float ki) {
		age=a;
		h=ki;
		name="익명";
	}
	
	public Overload(int a, float ki, String n) {
		age=a;
		h=ki;
		name=n;
	}
	
	public void Disp() {
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
		System.out.println("키 : "+h);
	}

}
