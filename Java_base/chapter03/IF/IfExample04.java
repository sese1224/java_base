package chapter03.IF;

import javax.swing.JOptionPane;

public class IfExample04 {

	public static void main(String[] args) {
		// 전시관의 입장료는 미취학 아동은 1000원
		// 전시관의 입장료는 초등학생은 2000원
		// 전시관의 입장료는 중.고등학생은 3500원
		// 전시관의 입장료는 성인은 5000원
		
		int age;
		int charge;
		//swing(나이를 입력하세요) 사용하여 입력 받기
		age=Integer.parseInt(JOptionPane.showInputDialog("나이를 입력하세요"));
         /*
		//if
		if(age<=7) {
			charge=1000;
			System.out.println("미 취학 아동입니다");
		}else if(age<=13) {
			charge=2000;
			System.out.println("초등학생 입니다");
		}else if(age<=19) {
			charge=3500;
			System.out.println("중.고등학생 입니다");
		}else {
			charge=5000;
			System.out.println("성인 입니다");
		}
		
		
		System.out.println("입장료는 "+ charge +"원 입니다");
		*/
		
		String dev;
		int mon;
		if (age >= 20) {
			dev = "성인";
			mon = 5000;
		} else if (age >= 14) {
			dev = "중고등학생";
			mon = 3500;
		} else if (age >= 8) {
			dev = "초등학생";
			mon = 2000;
		} else {
			dev = "미취학 아동";
			mon = 1000;
		}
		
		System.out.println(dev + " 입니다.");
		System.out.println("입장료는 "+ mon + "원 입니다.");
       

	}

}
