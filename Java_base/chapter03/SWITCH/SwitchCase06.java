package chapter03.IF.SWITCH;

public class SwitchCase06 {

	public static void main(String[] args) {
		// 오전 9 ~ 오후 6
		int time=(int)(Math.random()*10)+9;
		System.out.println("[현재시간 : "+time+"시]");
		System.out.print("할 일 : ");
		switch (time) {
		case 9:
			System.out.println("수업듣기");
    		break;
		case 10: 			
			System.out.println("휴식하기");
			break;
		case 11: 			
			System.out.println("게임하기");
			break;
		case 12: 			
			System.out.println("점심먹기");
			break;
		case 13: 			
			System.out.println("회의하기");
			break;
		case 14:
			System.out.println("운동하기");
			break;
		case 15:
			System.out.println("TV보기");
			break;
		case 16:
			System.out.println("정리하기");
			break;
		case 17:
			System.out.println("업무보기");
			break;
		case 18:
			System.out.println("업무보기");
			break;

		default:
			System.out.println("복습하기");
		}

	}

}
