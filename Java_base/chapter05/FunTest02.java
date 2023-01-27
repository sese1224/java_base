package chapter05;

import javax.swing.JOptionPane;

public class FunTest02 {
	
	
	public void sum(int num1, int num2) {
		//int num1=3;
		//int num2=5;
		int total=num1+num2;
		System.out.println(num1 + " + " + num2+ " = " + total);
		
	}
	
   //실행 담당하는 메소드
	public static void main(String[] args) {
		
		  int a, b;
		  a=Integer.parseInt(JOptionPane.showInputDialog("값1"));
		  b=Integer.parseInt(JOptionPane.showInputDialog("값2"));
		  //static에서 호출되지 않았으므로 Error발생
		  //sum(a,b);
		  
		  FunTest02 Obj=new FunTest02();
		  Obj.sum(a, b);
		  
	}//main
	

}//class













