package chapter05;

public class FunTest05 {
	
	public String channel; //멤버변수
	public int channelInt; //멤버변수
	public int volume; //멤버변수
	
	//생략가능
	public FunTest05() {
		// TODO Auto-generated constructor stub
	}
	/*
	public FunTest05(int volume) {
		// TODO Auto-generated constructor stub
	}
	*/
	
	public void channelUp(int volume) {
		System.out.println("소리를 "+volume +"만큼 올립니다");
	}
	
	public void channelDown(int volume) {
		System.out.println("소리를 "+volume +"만큼 내립니다");
	}
	
	//오버로딩(다형성 만족)
	public void channelChange(String channel) {
		System.out.println("TV 채널을 "+channel +"로 바꿉니다");
	}
	
	//오버로딩(다형성 만족)
    public void channelChange(int channelInt) {
    	System.out.println("채널을 "+channelInt +"로 바꿉니다");
	}
	
//======================================================
	public static void main(String[] args) {
		
		FunTest05 tv=new FunTest05();
		
		tv.channelUp(3);
		tv.channelDown(5);
		
		tv.channelChange("TvN");
		tv.channelChange(5);
		

	}//main

}















