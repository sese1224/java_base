package chapter06;

import java.util.Random;
import java.util.Scanner;

public class BaseballGame {
	
	//멤버변수
	private int[] num = new int[3];
	private String result;
	
	Scanner scan = new Scanner(System.in);
	
	//생성자(computer number)
	public BaseballGame() {
		int[] numberPool = new int[9];
		outer : for(int i=0;i<3;) {//증가값을 생략이 가능하다.
				num[i] = new Random().nextInt(9) + 1;
				//중복값을 제거하는 반복문
				for(int j=0;j<i;j++) {
					if(num[j] == num[i]) {
						continue outer;
					}//if
				}//for
			i++;
		}//for
	}//BaseballGame
	
	//메소드(Mynumber)
	public String check(){
		result = "OUT";
		int[] myNum = new int[3];
		int strike = 0;
		int ball = 0;
		
		System.out.println("1~9사이의 수를 입력하세요");
		String[] numStr = {"첫", "두", "세"};
		for(int i=0;i<3;i++) {
			do {
			System.out.print(numStr[i] + "번째 수를 입력하세요 > ");
			myNum[i] = scan.nextInt();
				if(myNum[i]>9||myNum[i]<1) {
					System.err.println("1~9 사이의 수를 입력하세요"); //예외처리
				}
			}while(myNum[i]>9||myNum[i]<1); //중복제거
	  //=================비교판단=====================		
		for(int j=0;j<3;j++) {
			if(myNum[i]==num[j]) {
				if(i==j)
					strike++;
				else
					ball++;
			}//if
		}//in for	
	 }//out for
		
       //output
		if(strike==3) {
			result = "WIN";
		}else if(strike+ball!=0) {//Integer.toString : int => string
			result = Integer.toString(strike) + "Strike " + Integer.toString(ball) + "Ball";
		}
		System.out.println(result + "!!");
		return result;
		
	}

}
