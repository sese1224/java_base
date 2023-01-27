package chapter03.IF.WHILE;

import java.util.Scanner;

public class WhileTest05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num, cnt=0, sum=0;
		double avg;
		//0을 입려하면 종료
		while(true) {
			System.out.print("숫자를 입력하세요 : ");
			
			num=scan.nextInt();
			
			if(num==0) {
				break;
			}
			
			cnt++;
			sum+=num;
		
		}//while
		
		System.out.println("입력된 자료의 갯수 : "+cnt);
		System.out.println("입력된 자료의 합계 : "+sum);
		System.out.println("입력된 자료의 평균 : "+sum/(double)cnt);

	}

}
