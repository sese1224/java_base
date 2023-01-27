package chapter07;

public class ConstTest {
	
	private int aa;
	private int bb;
	
	//기본 생성자
	public ConstTest() { }
	
	//생성자 오버로딩
	public ConstTest(int aa, int bb) {
		this.aa = aa;
		this.bb = bb;
	}

	public static void main(String[] args) {
		
		ConstTest obj1=new ConstTest();
		obj1.aa=10; //멤버변수가 private이여도 같은 클래스에 메인이 존재하면 사용가능
		obj1.bb=20;
		System.out.println(obj1.aa);
		System.out.println(obj1.bb);
		System.out.println("---------------");
		ConstTest obj2=new ConstTest(30, 40);
		System.out.println(obj2.aa);
		System.out.println(obj2.bb);

	}

}//class
