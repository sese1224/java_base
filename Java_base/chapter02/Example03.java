package chapter02;

public class Example03 {

	public static void main(String[] args) {
		//삼항연산자를 이용하여 score1이 60점 보다 크거나 같으면 합격 그렇지 않으면 불합격으로 반환 하시오
		int score1=60;
		
		String pass=(score1 >= 60) ? "합격" : "불합격";
		System.out.println("합격 여부 : " + pass);
		
		//삼항연산자를 이용하여 score2가 90보다 크면 'A'이고 score가 80보다 크면 'B' 그 이하는 모두 'C'로 간주한다 
		int score2=82;
		
		char grade;
		grade=(score2 > 90)? 'A':((score2 > 80)? 'B':'C');
		System.out.println("학점 : "+ grade);

	}

}
