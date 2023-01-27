package chapter03.IF.Example;

import java.util.Scanner;

public class ExampleWhile01 {

	public static void main(String[] args) {
		
		boolean run=true;
		
		int balance=0;
		
		Scanner scan=new Scanner(System.in);
		
		while(run) {
			
			System.out.println("-------------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-------------------------------------");
			System.out.print("선택> ");

			int menuNum = Integer.parseInt(scan.nextLine());

			switch (menuNum) {
			case 1: //0이하의 금액이 입력되었을때 예외처리
				System.out.print("예금액> ");
				balance += Integer.parseInt(scan.nextLine());
				break;
			case 2://잔액이 부족합니다
				System.out.print("출금액> ");
				balance -= Integer.parseInt(scan.nextLine());
				break;
			case 3:
				System.out.print("잔고> ");
				System.out.println(balance);
				break;
			case 4:
				run = false;
				break; //switch
			}

			System.out.println();
		}

		System.out.println("프로그램 종료");

			
			
			
		}

	}


