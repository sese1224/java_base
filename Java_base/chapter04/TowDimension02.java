package chapter04;

import javax.swing.JOptionPane;

public class TowDimension02 {
	
	public static void main(String[] args) {
		
		int JavaScore[][]=new int[2][3];
		
		for(int i=0;i<JavaScore.length;i++) {
			for(int j=0;j<JavaScore[i].length;j++) {
				//입력
				int jumsu=Integer.parseInt(JOptionPane.showInputDialog("점 수"));
				//입력받은 점수 대입
				JavaScore[i][j]=jumsu;
				System.out.println("JavaScore["+i+"]["+j+"] : " + JavaScore[i][j]);		
			}
			System.out.println();
		}
	}

}
