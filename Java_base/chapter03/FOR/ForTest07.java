package chapter03.IF.FOR;

import java.util.Scanner;

public class ForTest07 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		int i; 
		System.out.print("숫자를 입력하세요 : ");
		int a=scan.nextInt();
		
		//if문의 조건에 0보다 크면서 11보다 작은수
		if(a>0 && a<11) {
			for(i=1; i<=a; i++) {
				System.out.println("Java 프로그래밍!");
			}//for
		}else {
			System.out.println("입력값이 잘못 되었습니다");
		}//if
		
		System.out.println("프로그램이 종료됩니다.");
	}//main
}//class
