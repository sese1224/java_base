package chapter04;

public class ArrayTest05 {

	public static void main(String[] args) {
		
		double data[]=new double[5];
		int size=0;
		
		data[0]=10.0;
		size++;//1
		data[1]=20.0;
		size++;//2
		data[2]=30.0;
		size++;//3
		
		double total=1.0;
		
		for(int i=0;i<size;i++) {
			System.out.println(data[i]);
			total *=data[i];
		}//for	
		System.out.println("Total : "+total);

	}//main

}//class
