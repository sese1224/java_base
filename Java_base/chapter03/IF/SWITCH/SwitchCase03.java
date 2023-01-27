package chapter03.IF.SWITCH;

import java.util.Scanner;

public class SwitchCase03 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		int month;
		int day;
		
		System.out.print("월을 입력하세요(1~12) : ");
		month=scan.nextInt();
		
		switch (month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			day=31;
			break;
		case 2:
			day=28;
			break;
		case 4: case 6: case 9: case 11:
			day=31;
			break;
		default:
			day=0;
			System.out.println("존재하지 않는 달입니다.");
		}//switch
		
		System.out.println(month +"월은 "+day+"일 까지 있습니다.");

	}//main
}//class
