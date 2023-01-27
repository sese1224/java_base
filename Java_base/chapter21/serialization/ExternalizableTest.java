package chapter21.serialization;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

class Dog implements Externalizable{
	String name;
	
	public Dog() {}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeUTF(name);
		
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		name = in.readUTF();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}
	
}

public class ExternalizableTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// Externalizablet: 인터페이스Externalizable을 사용하여 내부의 내용을 쉽게 조작함
		//writeExternal / readExternal()
		Dog myDog = new Dog();
		myDog.name="이솜이";
		
		FileOutputStream fos = new FileOutputStream("external.out");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		try (fos;oos){
			oos.writeObject(myDog);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		FileInputStream fis = new FileInputStream("external.out");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Dog dog = (Dog)ois.readObject();
		System.out.println(dog);
		
		
	}

}
