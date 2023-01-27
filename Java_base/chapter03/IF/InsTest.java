package chapter03.IF;

//내부 클래스
class clsA{
	void fun() {
		System.out.println("2023년 1월 첫주 월요일 입니다");
	}//fun	
}//clsA

class clsB extends clsA{

}//clsB
//================================================

public class InsTest {

	public static void main(String[] args) {
		//clsB의 인스턴스 변수
		clsB objB=new clsB();
		
		if(objB instanceof clsA) {
			System.out.println("Yes");
			objB.fun();
		}//if
		
		if(objB instanceof clsB) {
			System.out.println("Yes");
		}//if
		
	}//main

}//InsTest class
