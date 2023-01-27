package chapter03.IF.FOR;

import java.util.Scanner;

public class ForTest17 {

	public static void main(String[] args) {
		// 정수를 입력받아서 입력된 수만큼 ★ 출력
		Scanner scn = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int i, j, k;
		int n = scn.nextInt();//5
		/*
		for (i=0; i<n; i++) { 
			
			for(j=n-1; j>i; j--)
				System.out.print(" ");
			for(k=0; k<=i; k++)
				System.out.print("★");
			System.out.println();
		}
		*/
		//전체 회전수
		for( i=0; i<n; i++)
		{   //공백
			for( j=0; j<=n-1-i; j++)
			{
				System.out.print(" ");
			}
			//별
			for( j=0; j<2*i+1; j++)
			{
				System.out.print("★");
			}
			System.out.println();
		}

	}

}
