package chapter05;

import java.util.Scanner;

public class Method {
	
	//멤버변수(=필드)
	Scanner scan = new Scanner(System.in);
	
	//생성자 생략
	
	//메소드
	void makeBread() {
		System.out.println("빵을 만듭니다");
	}//method1
	
	void makeBread(int count) {
		//1번째 빵을 만들었습니다
		//2번째 빵을 만들었습니다
		//.....
		//요청하신 5개의 빵이 모두 완료되었습니다
		System.out.println("주문할 빵의 갯수 : ");
		System.out.print("선택> ");
		count=scan.nextInt();
		for(int i=0;i<count;i++) {
			System.out.println((i+1)+"번째 빵을 만들었습니다");
		}
		System.out.println("요청하신 "+count+"개의 빵이 모두 완료되었습니다.");
		
	}//method2
	
	void makeBread(int count, String name) {
		//1번째 생크림 빵을 만들었습니다
		//2번째 생크림 빵을 만들었습니다
		//.....
		//요청하신 5개의 생크빵이 모두 완료되었습니다
		System.out.print("주문할 빵의 갯수 : ");
		int cnt=scan.nextInt();
		System.out.print("주문할 빵의 종류 : ");
		name=scan.next();
		for(int i=0;i<count;i++) {
			System.out.println((i+1)+"번째 " +name+" 빵을 만들었습니다");
		}
		System.out.println("요청하신 "+count+"개의 "+name+" 빵이 모두 완료되었습니다.");
		
	}//method3
	
	void order() {
		Scanner scan=new Scanner(System.in);
		
		while(true) {
			System.out.println("1. 빵 갯수 선택 | 2. 빵의 갯수와 종류 | 3. 종료 : ");
			System.out.print("선택> ");
			int input_num=scan.nextInt();
			
			if(input_num==1) {
				System.out.print("주문할 빵의 갯수 : ");
				int cnt=scan.nextInt();
				makeBread(cnt);
			}else if(input_num==2) {
				System.out.print("주문할 빵의 갯수 : ");
				int cnt=scan.nextInt();
				System.out.print("주문할 빵의 종류 : ");
				String name=scan.next();
				makeBread(cnt, name);
			}else {
				System.out.println("프로그램 종료");
				break;
			}//if
	
		}//while

		
	}//order method
	
	

}
