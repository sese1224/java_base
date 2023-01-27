package chapter04;

public class ArrayTest03 {

	public static void main(String[] args) {
		
		int arr[]= {10,20,30,40,50};
		int i;
		
		System.out.println("배열의 원소 출력");
		/*
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		*/
		
		for(i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
