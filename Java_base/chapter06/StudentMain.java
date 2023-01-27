package chapter06;

public class StudentMain {

	public static void main(String[] args) {
		// 필드를 이용하여 set
		Student student1=new Student();
		student1.studentName="김치";
		student1.address="서울시 종로구";
		
		student1.showStudentInfo();
		System.out.println("---------------------------");
		
		//메소드를 이용하여 set
		Student student2=new Student();
		student2.setStudentName("박수");
		student2.setAddress("경기도 고양시");
		
		student2.showStudentInfo();
		System.out.println("---------------------------");
		
		//생성자 오버로딩으로 set
		Student student3=new Student("김치즈", "서울시 은평구");
		
		student3.showStudentInfo();
		

	}

}
