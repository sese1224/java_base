package chapter03.IF.FOR;

public class ForTest03 {

	public static void main(String[] args) {
		// 1부터 100까지의 합을 구하되 합이 100이하여야 함
		/*
		//방법1
		System.out.println("1부터 100까지의 합을 구하되 합이 100미만인 수");
		
		int i;
		int sum=0;
		for(i=1; i<=100; i++) {
			sum +=i;
			if(sum<100) {
				System.out.println("숫자 "+i+"까지의 합 : "+sum+"입니다.");
			}//if
		}//for
		*/
		//방법2
		System.out.println("1부터 100까지의 합을 구하되 합이 100미만인 수중 가장 큰수");
		
		int j;
		int sum1=0;
		for(j=1; j<=100; j++) {
			sum1+=j;
			if(sum1>=100)
				break; 
		}
		System.out.println("해당 숫자 : "+(j-1)+"입니다.");
		System.out.println("숫자 "+(j-1)+"까지의 합 : "+(sum1-j)+"입니다.");
		
		//방법3
		System.out.println("1부터 합을 구하되 합이 100초과하는 첫번째 수와 합");
		
		int k;
		int sum2=0;
		for(k=1; sum2<100 ;k++){
			sum2+=k;
		}
		System.out.println("해당 숫자 : "+(k-1)+"입니다.");
		System.out.println("숫자 "+(k-1)+"까지의 합 : "+sum2+"입니다.");

	}

}
