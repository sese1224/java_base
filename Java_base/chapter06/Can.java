package chapter06;

public class Can {
	
	//필드
	private String canName;
	private int price;
	
	//생성자 오버로딩
	public Can(String canName, int price) {
		this.canName=canName;
		this.price=price;
	}

	public String getCanName() {
		return canName;
	}

	public int getPrice() {
		return price;
	}
	
	

}
