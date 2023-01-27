package chapter22;

import java.util.Scanner;

public class AccountMain {

	public static void main(String[] args) {
		
		Account acc =  new Account();
		Runnable r =new AccountThread(acc);
		
		Thread t1 = new Thread(r);
		t1.start();
		
		//스레드와는 별개로 값을 받아 입금 시키는 코드
		while(true) {
			System.out.println("입금할 돈을 입력하세요:");
			Scanner scan = new Scanner(System.in);
			int n = scan.nextInt();
			acc.deposit(n);
			if(acc.balance == 0){
				break;
			}
		}

	}

}
