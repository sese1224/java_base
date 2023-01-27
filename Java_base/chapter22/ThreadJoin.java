package chapter22;

public class ThreadJoin implements Runnable {

	public static void main(String[] args) {
		System.out.println("매인클래스 시작!");
		ThreadJoin t1 = new ThreadJoin();
		Thread JThread = new Thread(t1);
		JThread.start();
		
		try {
			JThread.join();//run메서드와 main메서드가 join이 되어 run()가 완전히 종료 될때까지 기다림 (위-> 아래)
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("메인클래스 종료!");
	}
//=======================================================
	@Override
	public void run() {
		System.out.println("run() 메서드 수행!");
		first();
	}
	
	public void first() {
		System.out.println("first()메서드 수행!");
		seconds();
	}
	
	public void seconds() {
		System.out.println("seconds()메서드 수행!");
	}
	

}
