package chapter05;

import javax.swing.JOptionPane;

public class TryCatch {

	public static void main(String[] args) {

		int num1, num2;
		
		num1=Integer.parseInt(JOptionPane.showInputDialog("값1"));
		num2=Integer.parseInt(JOptionPane.showInputDialog("값2"));
		/*
		int res=num1/num2;
		System.out.println(res);
		*/
		
		try {
			System.out.println(num1/num2);//해당 작업 코드
		} catch (ArithmeticException e) {
			System.out.println("숫자 0을 입력하시면 안됩니다");//에러시 수행되어야 할 코드
		}//try
		
		System.out.println("Error 후 컴파일 => 프로그램 종료");

	}//main

}
