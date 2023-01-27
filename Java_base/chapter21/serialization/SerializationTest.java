package chapter21.serialization;

import java.io.*;

class Person implements Serializable{
	private static final long serialVeerionUID = 1L;//바이너리가 직렬화의 의미 
	
	String name;
	String job;
	//transient String number;//transient: 직렬화를 하지 않고 그냥 그대로 쓰겠다는 의미 
	
	public Person(String name, String job) {
		this.name = name;
		this.job = job;
		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+", "+job;
	}
	
}

public class SerializationTest {

	public static void main(String[] args) {
		
		Person personHong = new Person("홍길동","대표이사");
		Person personkim= new Person("김연아","상무이사");
		
		//ObjectOutputStream: 파일이나 네트워로 데이터를ㄹ 전달하기 위해 직렬화를 수행해줌
		//writeObject(): 직렬화 함수 
		//--------------직렬화---------------
		try (FileOutputStream fos = new FileOutputStream("serial.out");
				ObjectOutputStream oos = new ObjectOutputStream(fos)){
			
			//직렬화
			oos.writeObject(personHong);
			oos.writeObject(personkim);
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	//-----------------------역직렬화----------------------------
	//ObjectInputStream : 파일이나 네트워크를 통해 전달받은 직렬화된 데이터를 다시 원래대로 돌리는 역할
	//readObjec():역짖력화에 사용되는 메서드
		//직렬화 하기 전 객체로 캐스팅 해줘야 함 
		try(FileInputStream fis = new FileInputStream("serial.out");
				ObjectInputStream ois = new ObjectInputStream(fis)) {
			
	Person p1	=	(Person)ois.readObject();
	Person p2	= (Person)ois.readObject();
	
	System.out.println(p1);
	System.out.println(p2);
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}//메인 

}
