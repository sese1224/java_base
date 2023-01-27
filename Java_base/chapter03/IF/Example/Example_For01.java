package chapter03.IF.Example;

public class Example_For01 {

	public static void main(String[] args) {
		// 1 ~ 100까지의 수중 3의배수의 합
		int sum=0;
		
		for(int i=1;i<=100;i++) {
			if(i % 3 == 0) {
				sum+=i;
			}
		}//for
        System.out.println("3의 배수의 합 : "+ sum);
	}

}
