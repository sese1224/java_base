package chapter05;

public class FunTest_OverloadingMain {

	public static void main(String[] args) {
		
		FunTest_Overloading obj=new FunTest_Overloading();
		
		obj.getReult(20);
		obj.getReult('A');
		obj.getReult("해피 주말~~~~");
		obj.getReult(6 ," 2023");

	}

}
