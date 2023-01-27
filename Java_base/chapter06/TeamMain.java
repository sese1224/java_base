package chapter06;

public class TeamMain {

	public static void main(String[] args) {
		
		TeamGroup team=new TeamGroup();
		TeamMember t=new TeamMember();
		//메소드를 통해서 팀명을 초기화
		t.setTeamName("IT프렌즈");
		System.out.println("팀명 : "+t.getTeamName());
		System.out.println("------[팀원 명단]-----");
		team.init();
		team.Disp();
		
		System.out.println();
		t.setmName("김병효");
	    System.out.println("팀장이름 : " + t.getmName());
	    t.setMPhone("0102223333");
	    System.out.println("팀장번호 : " + t.getMPhone());
	    t.setsName("이채윤");
	    System.out.println("부팀장이름 : " + t.getsName());
	    
	    
		
		
		
		
		

	}

}
