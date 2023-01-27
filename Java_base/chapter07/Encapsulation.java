package chapter07;

public class Encapsulation {
	
	private int Side;
	private int Height;
	
	public Encapsulation() {
		Side=0;
		Height=0;
	}
	
	public int Cal_Area(int S, int H) {
		Side=S;
		Height=H;
		
		return(S*H);
	}

}
