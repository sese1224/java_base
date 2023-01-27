package chapter04;

public class CharArray02 {

	public static void main(String[] args) {
		
		char alpahabets[]=new char[26];
		char ch='A'; //65
		//System.out.println(ch++);
		//System.out.println(ch);
		/*
		for(int i=0;i<alpahabets.length;i++) {
			alpahabets[i]=ch++;
			System.out.print(alpahabets[i]+" ");
		}//for
		System.out.println();*/
		for(int i=0;i<alpahabets.length;i++, ch++) {
			alpahabets[i]=ch;
			System.out.print("("+alpahabets[i]+", "+(int)(alpahabets[i])+")"+"|");
		}//for
	}

}
