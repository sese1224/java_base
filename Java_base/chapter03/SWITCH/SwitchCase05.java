package chapter03.IF.SWITCH;

public class SwitchCase05 {

	public static void main(String[] args) {
		System.out.print("주사위 눈의 수 : ");
        int num=(int)(Math.random()*10)+1;
        
        switch (num) {
		//case 1,2,3,4,5,6://version 14 이후
		case 1: case 2: case 3: case 4: case 5: case 6:{
			System.out.println(num +"점 획득");
			break;
		}
		default:
			System.out.println("잘못된 숫자 입니다.");
		}
	}

}
