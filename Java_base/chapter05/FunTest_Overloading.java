package chapter05;

public class FunTest_Overloading {
	
	//필드=멤버변수
	
	//생성자(디폴트 생략)
	
	//다형성을 만졸
	//Overloading : 메소드명을 통일성 있게 사용해야하는 경우 메소드의 매개변수를 종류와 갯수를 다르게하여 구현
	
	 	public void getReult(int n) {
	 		System.out.println(n +"은(는) int입니다");	
		}
	 	
	 	public void getReult(String n) {
	 		System.out.println(n +"은(는)  String입니다");	
		}
	 	
	 	public void getReult(char n) {
	 		System.out.println(n +"은(는) char 입니다");	
		}
	 	
	 	public void getReult(int n, String str) {
	 		System.out.println(n +"은(는) int와 String 입니다");	
		}

}
