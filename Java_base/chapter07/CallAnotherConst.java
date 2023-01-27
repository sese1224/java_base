package chapter07;

class Person2{
	
	String name;
	int age;
	
	public Person2() {
		this("이름없음", 0); //Person2(String str, int a)
	}
	
	public Person2(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	//자기자신의 주소
	Person2 returnSelf() {
		return this;
	}
	
	
}


public class CallAnotherConst {
	
	public static void main(String[] args) {
		
		Person2 noName=new Person2();
		System.out.println(noName.name);
		System.out.println(noName.age);
		System.out.println("noName의 주소 : "+noName);
		System.out.println("noName의 주소 : "+noName.returnSelf());
		//noName과 p의 객체는 전혀 다른곳으로 할당
		System.out.println("------------------------------------");
		Person2 p=new Person2();
		System.out.println("p의 주소 : "+p);
		//주소 복사
		System.out.println("------------------------------------");
		Person2 person=noName.returnSelf();
		System.out.println(person);
		System.out.println(noName);
		

	}

}
