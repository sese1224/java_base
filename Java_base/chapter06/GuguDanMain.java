package chapter06;

import java.util.Scanner;

public class GuguDanMain {

	public static void main(String[] args) {

		GuguDan gd=new GuguDan();
		
		int num;
		
		System.out.print("출력할 단을 입력하세요 : ");
		Scanner s=new Scanner(System.in);
		
		num=s.nextInt();
		
		gd.showTable(num);

	}

}
