package chapter09;
//상속
public class Berry extends Fruit{
	
	private String name;
	private String size;
	
	//setter
	public void Set2(String a, String b) {
		name=a;
		size=b;
	}
	
	
	//getter
	public void Disp2() {
		System.out.println("이름 : "+name);
		System.out.println("크기 : "+size);
	}

}
