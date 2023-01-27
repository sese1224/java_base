package chapter06;

import java.util.Random;
import java.util.Scanner;

public class BaseBallGame2 {
private String com;
	
	public BaseBallGame2() {
		
		com = "000";
		
		do {
			com = "";
			for(int i=0; i<3; i++) {
				com += (char)(new Random().nextInt(9) + 49); //아스키코드 '1' ~ '9' 사이의 수 랜덤
			}
		}while(com.charAt(0) == com.charAt(1) || com.charAt(1) == com.charAt(2) || com.charAt(2) == com.charAt(0));
		
		//System.out.println("정답 : " + com);
	}
	
	public String check() {
		Scanner scan = new Scanner(System.in);
		String result = "LOSE";
		
		System.out.print("세자리 수를 입력하세요 : ");
		String user = scan.next();
		int strike=0, ball=0;
		
		outer : for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(com.charAt(i) == user.charAt(j)) {
					if(i == j) { // 같으면 스트라이크가 증가하고 더이상 해당 자리수는 세지 않는다.
						 strike++;
						 continue outer;
					}
					else{ // 자리수가 다를경우는 볼을 증가
						ball++;
					}
				}
			}
		}
		
		System.out.println(strike + " strike, " + ball + " ball ");
		if(strike == 3) {
			result = "WIN";
		}
		
		return result;
	}

}
