package chapter02;

public class Test01 {

	public static void main(String[] args) {
		
       //Q1 바이트 크기가 작은 자료형을 더 큰 자료형으로 대입하는 자동 형 변환의 코드 2가지 구현
		System.out.println("♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥");
		System.out.println("Q1");
		byte bNum=5; //8bit
		int iNum=bNum; //4byte
		System.out.println(iNum);
		byte dNum=3; 
		int jNum=dNum*2;
		System.out.println(jNum);
		System.out.println("♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥");
        
		
		 // Q2 실수를 정수형 변수에 대입하는 경우에 형변환이 자동으로 이루어지고 소수점 이하 부분이 없어지는 형변환 코드 2가지 구현
		System.out.println("Q2");
		float bVal=10.5f;
		int aVal=10;
		System.out.println("aVal + bVal : "+ (int)(aVal+bVal));
		System.out.println("♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥");
		
		
		 // Q3 더 많은 실수를 표현하기 위해서 가수부와 지수부로 비트를 나누어 표현한 방식 ( )
		 System.out.println("Q3");
		 System.out.println("부동소수점 방식");
		 System.out.println("♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥");
		 
		 // Q4 변수 두개를 선언해서 10과 2.5을 대입하고 두 변수의 사칙 연산 결과를 정수로만 출력
		    System.out.println("Q4");
			int cVal=10;
			float dVal=2.5f;
			System.out.println("더하기 : "+ (int)(cVal + dVal));
			System.out.println("빼기 : "+ (int)(cVal - dVal));
			System.out.println("곱하기 : "+ (int)(cVal * dVal));
			System.out.println("나누기 : "+ (int)(cVal / dVal));
			System.out.println("나누기 : "+ (int)(cVal % dVal));
			System.out.println("♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥");
			
		 // Q5 '글'이라는 한글 문자의 유니코드 값을 찾아서 char형으로 선언한 변수에 저장한 뒤 그 변수를 출력
			System.out.println("Q5");
			char ch1='글';
			char ch2='\uae00'; 
			System.out.println(ch1);
			System.out.println(ch2);
			System.out.println("♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥");
		 

	}

}
