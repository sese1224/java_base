package chapter06;

public class TakeTrans {

	public static void main(String[] args) {
		//학생 2명 생성
		StdInfo studentJames=new StdInfo("James", 12000);
		StdInfo studentTom=new StdInfo("Tom", 10000);
		
		
		//버스타기
		Bus bus100=new Bus(100);
		studentJames.takeBus(bus100);
		//정보확인
		studentJames.showInfo();//지출
		bus100.showInfo();//수입증가 인원수 증가
		System.out.println("----------------------------------------");
		Bus bus987=new Bus(987);
		studentTom.takeBus(bus987);
		studentTom.showInfo();
		bus987.showInfo();
		System.out.println("=======================================");
		System.out.println();
		//지하철 타기
		Subway subwayGreen=new Subway("2호선");
		studentTom.takeSubway(subwayGreen);
		//정보확인
		studentTom.showInfo();
		subwayGreen.showInfo();
		
		Subway subOrange = new Subway("3호선");
		studentJames.takeSubway(subOrange);
		studentJames.showInfo();
		subOrange.showInfo();
		
		
	}

}
