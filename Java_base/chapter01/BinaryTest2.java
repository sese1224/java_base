package chapter01;

public class BinaryTest2 {
	
     public static void main(String[] args) {
		 //카멜 : 첫글자는 무조건 소문자 중간단어의 첫자 대문자
    	 //파스칼 : 첫글자는 무조건 대문자
    	 int num=10;
    	 int bNum=0B1000; //Binary 즉 2진수(0B)
    	 int oNum=010; //8진수(OCT)
    	 
    	 int bNum2=0B10000; 
    	 int hNum=0x10; //16진수(Hex)
    	 
    	 System.out.println(num);
    	 System.out.println(bNum);
    	 System.out.println(oNum);
    	 System.out.println(bNum2);
    	 System.out.println(hNum);
	}
}
