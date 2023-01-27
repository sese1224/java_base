package chapter06;

public class StudentInfoMain {
	
	public static void main(String[] args) {
		
		StudentInfo studentKim=new StudentInfo();
		
		studentKim.studentID=1004;
		studentKim.grade=3;
		studentKim.address="서울시 종로구";
		
		studentKim.setStudentName("홍길동");
		String name=studentKim.getStudentName();
		
		System.out.println(name);
		
		
		
	}

}
