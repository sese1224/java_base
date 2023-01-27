package chapter06;

import javax.swing.JOptionPane;

public class SungJuk {
	
	//필드 또는 멤버변수
	private String std_num;
	private String std_name;
	private int java, oracle, spring;
	
	//디폴트 생성자(생략가능)
	
	//메서드
	public void Sum() {
		int total=java+oracle+spring; //지역변수
		System.out.println("총합계 : "+total);
	}
	
	public void Avg() {
		int avg=(java+oracle+spring)/3;
		System.out.println("평 균 : "+avg);
	}
	

	public static void main(String[] args) {
		
		SungJuk rec=new SungJuk();
		
		rec.std_num=JOptionPane.showInputDialog("학번");
		rec.std_name=JOptionPane.showInputDialog("성명");
		
		rec.java=Integer.parseInt(JOptionPane.showInputDialog("자바점수 입력"));
		rec.oracle=Integer.parseInt(JOptionPane.showInputDialog("오라클점수 입력"));
		rec.spring=Integer.parseInt(JOptionPane.showInputDialog("스프링점수 입력"));
	
        System.out.println("학번 - "+rec.std_num+"| 성명 - "+rec.std_name+"님의 성적입니다");
        System.out.println("------------------------------------------------");
        rec.Sum();
        rec.Avg();
	}//main
}//class
