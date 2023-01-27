package chapter03.IF.WHILE;

import java.util.Scanner;

public class WhileTest04 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.print("Java 교과목 점수를 입력하세요 : ");
			int scr = scan.nextInt();
			
			//점수가 0미만 또는 100초과이면 while문 중지 
			if(scr < 0 || scr>100) {
						break;
			}else if(scr >=60) {
				System.out.println("합격 하셨습니다");
			}else {
				System.out.println("불합격 하셨습니다");
			}//if
		}//while
		System.out.println("프로그램 종료");
	}
}
