package chapter02;

public class Example02 {

	public static void main(String[] args) {
		//원의 넓이를 구하시오(반지름*반지름*3.14)
		//반지름 : 10, 3.14는 double로 정의하여 구하시오
		//반지름 변수방 num1 / 3.14 변수방 pi /넓이 변수방 result
		
		//방법1
		int num1=10;
		double pi=3.14;
		
		//더 정밀한 자료타입으로 int가 묵시적 형변환
		double result=num1*num1*pi;
		System.out.println("원의 넓이 : "+ result);
		
		//방법2
		int num2=10;
		int num3=3;
		int num4=14;
		
		//int => double : Double.parseDouble
		//String => int : Integer.parseInt
		
		double result2=num2*num2*Double.parseDouble(num3+"."+num4);
		System.out.println("원의 넓이 : "+ result2);
		
		


	}

}
