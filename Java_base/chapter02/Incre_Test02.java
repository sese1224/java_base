package chapter02;

public class Incre_Test02 {

	public static void main(String[] args) {
		
		int x=10;
		int y=10;
		int z;
		
		System.out.println("-------------------");
		x++; //10 -> 11
		++x; //12
		System.out.println("x = : " +x);
		
		System.out.println("-------------------");
		y--; //10 -> 9
		--y; //8
		System.out.println("y = : " +y);
		
		System.out.println("-------------------");
		z=x++; 
		System.out.println("z = : " +z); //12
		System.out.println("x = : " +x); //13
		
		System.out.println("-------------------");
		z=++x; //x=x+1 -> z=x 
		System.out.println("z = : " +z); //14
		System.out.println("x = : " +x); //14
		
		System.out.println("-------------------");
		z=++x + y++; // 15+8 
		System.out.println("z = : " +z); //23
		System.out.println("x = : " +x); //15
		System.out.println("y = : " +y); //9
		

	}
	
}
