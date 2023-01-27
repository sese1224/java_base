package chapter03.IF;

import java.util.Scanner;

public class IfExample07 {
	
	public static void main(String[] args) {
		
		//입력 Scanner 클래스 초기화 => 인스턴스 변수방 선언
		Scanner scan=new Scanner(System.in);
		
		//num1
		System.out.print("1. 첫번째 수 : ");
		double num1=Double.parseDouble(scan.nextLine()); 
		System.out.println("첫번째 입력받은 수 출력 : "+ num1);
		System.out.println();
		
		//num2
		System.out.print("2. 두번째 수 : ");
		double num2=Double.parseDouble(scan.nextLine());
		System.out.println("두번째 입력받은 수 출력 : "+ num2);
		System.out.println();
		
		/*
		if(num2 != 0.0) {
			System.out.println("나눈 값 : " + num1 / num2);
		}else {
			System.out.println("0으로 나눌 수 없습니다");
		}
		*/
		if(num2 == 0.0) {
			System.out.println("0으로 나눌 수 없습니다");
		}else {
			System.out.println("나눈 값 : " + num1 / num2);
		}
		
		
	}

}
