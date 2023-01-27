package chapter07;

public class Person {
	
	String name;
	float height;
	float weight;
	
	//기본 생성자
	public Person() {}
	
	//오버로딩
	public Person(String name) {
		this.name=name;
	}
	
	//오버로딩
	public Person(String name, float height, float weight) {
		this.name=name;
		this.height=height;
		this.weight=weight;
	}
	
	

}
