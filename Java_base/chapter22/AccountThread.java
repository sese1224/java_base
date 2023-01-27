package chapter22;

import java.util.Random;

public class AccountThread implements Runnable {
	Account acc;

	public AccountThread(Account acc) {
		this.acc=acc;
	}
	
	@Override
	public void run() {
	
	while(true) {
		
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		//출금액을 100원에서 300원 사이의 난수로 지정
				int money = (new Random().nextInt(3)+1)*300;
				acc.withdraw(money);
				System.out.println("잔액: "+acc.balance);
				
	}
	
	
	}

}
