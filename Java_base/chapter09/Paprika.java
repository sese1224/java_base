package chapter09;

public class Paprika extends Vegetable{
    
	private String color;
	private int price;
	private String name;
	
	//기본 생성자
	
	//setter
	public void Set2(String a, int b, String c) {
		color=a;
		price=b;
		name=c;
		
	}
	
	public void Disp1() {
		System.out.println("-----paprika-----");
		System.out.println("분류 : "+sort);
		System.out.println("계절 : "+season);
		//멤버변수가 부모로 부터 상속받은 것과 일치하는 것이 있을 경우
		//부모클래스의 기본 생성자(super)를 이용하여 선언한다
		System.out.println("이름 : "+super.name);
		
		System.out.println();
	}
	
	public void Disp2() {
		System.out.println("-----paprika-----");
		System.out.println("색깔 : "+color);
		System.out.println("가격 : "+price);
		System.out.println("이름 : "+name);
		
		System.out.println();
	}
	
	
	 
}
