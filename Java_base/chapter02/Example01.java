package chapter02;

public class Example01 {

	public static void main(String[] args) {
		
		/* Soldesk 과수원
		배, 사과, 오렌지를 키우고 있는데 하루에 생산되는 양은 각각 5개, 7개, 5개이다

		과수원에서 하루에 생산되는 총 과일의 갯수를 출력하고, 시간당(24) 전체 과일의 평균 생산갯수를 출력하시오
		(단, 평균값을 담는 데이터 타입은 float으로 정의한다)
		*/
		
		//변수방 선언
		int pear=5;	
		int apple=7;	
		int orange=5;
		
		System.out.println("하루에 생산되는 총 과일의 갯수: "+(pear+apple+orange)+"개");
		System.out.println("시간당 배의 평균 생산갯수: "+((float)(pear)/24)+"개");
		System.out.println("시간당 사과의 평균 생산갯수: "+((float)(apple)/24)+"개");
		System.out.println("시간당 오렌지의 평균 생산갯수: "+((float)(orange)/24)+"개");
		System.out.println("시간당 전체 과일의 평균 생산갯수: "+((float)(pear+apple+orange)/24)+"개");
		
		/*
		//총갯수
		int fruitTotal=pear+apple+orange;
		System.out.println("하루에 생산되는 과일의 총갯수 : "+ fruitTotal);
		
		//시간당 평균
		float h=24f;
		float fruitAge=fruitTotal/h;
		System.out.println("시간당 생산되는 과일의 평균 : "+ fruitAge);
		*/

	}

}
