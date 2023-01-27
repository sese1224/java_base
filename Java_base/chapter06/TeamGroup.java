package chapter06;

public class TeamGroup {
	
	//멤버변수(배열->팀구성원)
	private TeamMember[] member = new TeamMember[6];
	
	//기본 생성자
	
	//초기화 메소드
	public void init() {
		member[0] = new TeamMember("김창우", "남");
		member[1] = new TeamMember("정세나", "여");
		member[2] = new TeamMember("김우태", "남");
		member[3] = new TeamMember("박수연", "여");
		member[4] = new TeamMember("백유기", "남");
		member[5] = new TeamMember("박범준", "남");
	}
	
	//출력 메소드
	public void Disp() {
		for(int i=0; i<member.length; i++) {
			//System.out.print("성별 : " + (member[i].getGender().equals("M") ? "남" : "여"));
			System.out.print("성별 : " + (member[i].getGender()));
			System.out.println(", 성명 : " + member[i].getName());
		}
	}

}
