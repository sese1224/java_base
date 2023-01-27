package chapter04;

public class TowDimension01 {

	public static void main(String[] args) {

		int arr[][]=new int[2][3];
		int n=0;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				n++;
				System.out.print((arr[i][j]=n)+" ");//리터널 입력후 출력
			}
			System.out.println();
		}//for
		
		System.out.println("-----------------------------");
		System.out.println(arr.length);//행
		System.out.println(arr[0].length);//열
		System.out.println("-----------------------------");
		
		int arr1[][]= { {1,2,3},{4,5,6}};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr1[i].length;j++) { //각줄의 끝까지 읽음
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
		
	}//main

}//class
