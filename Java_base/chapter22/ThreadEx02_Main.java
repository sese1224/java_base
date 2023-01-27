package chapter22;

public class ThreadEx02_Main {
	public static void main(String[] args) {
		
		ThreadEx02 t1 = new ThreadEx02(); //1~10까지의 요소가 temp변수방에 초기화됨
		t1.start(); //start()메서드를 수행하면 내부에 run메서드가 수행된다
		
		try {
			Thread.sleep(2000);//2초 대기상태
			System.out.println("프로그램 종료");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
