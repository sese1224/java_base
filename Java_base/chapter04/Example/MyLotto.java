package chapter04.Example;


import java.util.Random;

import javax.swing.JOptionPane;

public class MyLotto {

	public static void main(String[] args) {
		// 로또번호 6개를 담을 배열
		int number;
		int cnt=0;
		int[] lotto=new int[6];
		
		System.out.println("==== 이번주 로또 예상번호 ====");
		number=Integer.parseInt(JOptionPane.showInputDialog("원하는 로또 구매횟수를 입력하세요"));
	   while(number > cnt ) {
		  System.out.println("["+(cnt+1)+"] : ");
		  
		      outer : for(int i=0;i<lotto.length;) {
					  lotto[i]=new Random().nextInt(45)+1;
					  //중복값을 비교하는 반복문
					  for(int j=0;j<i;j++) {
						  if(lotto[i] == lotto[j]) {
							  continue outer;
						  }//if  
				       }//in for
			            System.out.print(lotto[i]+" ");
			            i++;
		  		  }//out for
		  		   cnt++;
		  		   System.out.println();  
		  		   /*
		  		 System.out.print("["+(cnt+1)+"] :");
					for (int i=0 ; i < lotto.length; i++) {
						lotto[i]= (int)(Math.random()*(45)+1);
						System.out.print(lotto[i]+" ");
						
					if (num == lotto [i]) {
						i--; 
						break;
					}
						
									
					}
					System.out.println();
					cnt++;
		  		   */
		  		   
		 }//while
	}//main
}//class
