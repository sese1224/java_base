package chapter01;

public class BinaryTest3 {

	public static void main(String[] args) {
		// int : 정수(4바이트) => 32비트
		// 0 => 양수 / 1 => 음수
		int num1=0B00000000000000000000000000000101; //2진수
		//코드오류는 아니지만 1의 보수로는 정확한 표현이 안됨
		int num2=0B11111111111111111111111111111010;  //2진수 보수(-)
		//끝자리에 +1을 하므로 정확한 보수가 성립됨 => 0 (음수?/양수?)
		int num3=0B11111111111111111111111111111011;  //2진수의 2의 보수
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);


	}

}
