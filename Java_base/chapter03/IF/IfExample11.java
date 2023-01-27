package chapter03.IF;

import java.util.Scanner;

public class IfExample11 {

	public static void main(String[] args) {
		// Scanner scan이라는 인스턴스 변수 선언
		Scanner scan=new Scanner(System.in);
		//ID라는 변수로 아이디 받기
		System.out.print("아이디 : ");
		String ID=scan.nextLine();
		//PW라는 변수로 비번 받기(String) => 숫자로 받되 String
		System.out.print("비밀번호 : ");
		String PW=scan.nextLine();
		//int형으로 형변환
		//int PW=Integer.parseInt(scan.nextLine()); //=>한줄코드
		int pass=Integer.parseInt(PW);
		/*
		//중첩질의를 사용하여 로그인 성공과 비밀번호 다름, 아이디 없음
		if(ID.equals("soldesk")) {
			if(pass==12345) {
				System.out.println("로그인 성공");
			}else {
				System.out.println("비밀번호가 일치하지 않습니다.");
			}
		}else {
			System.out.println("로그인 실패!!");
		}
		*/
		
		//논리 연산자
		if(ID.equals("soldesk") && pass==12345) {
			System.out.println("로그인 성공");
		}else {
			System.out.println("로그인 실패");
		}
		
		
	}//main
}//class

