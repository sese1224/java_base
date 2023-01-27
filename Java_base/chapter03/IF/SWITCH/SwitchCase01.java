package chapter03.IF.SWITCH;

public class SwitchCase01 {

	public static void main(String[] args) {
		
		int ranking=2;
		char medalColor;
		
		switch (ranking) {
		case 1: 
			medalColor='G';
			break;
		case 2:
			medalColor='S';
			break;
		case 3:
			medalColor='B';
			break;
		default: //나머지 value
			medalColor='A';
		}
		
		System.out.println(ranking +"등 메달은 "+medalColor+"입니다");

	}

}
