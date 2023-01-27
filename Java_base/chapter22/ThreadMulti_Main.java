package chapter22;

public class ThreadMulti_Main {

	public static void main(String[] args) {
		//멀티 스레듸
		ThreadEx03 t1 = new ThreadEx03();
		ThreadEx03_2 t2 = new ThreadEx03_2();
		
		t1.start();
		t2.start();
		
		//번갈아가면서 실행됨
	}

}
