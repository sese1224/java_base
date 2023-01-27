package chapter01;

public class ExplicitConversion {

	public static void main(String[] args) {
		// 캐스팅 문법(명시적 형변환)
		
		int iNum=1000;
		byte bNum=(byte)iNum; //-128 ~ 127
		
		System.out.println(iNum);
		System.out.println(bNum); //유실된 결과값(손실)		
		System.out.println("=====================");
		
		double dNum1=1.2; //8바이트 => 4바이트
		float fNum1=0.9f; //4바이트
		
		int iNum2=(int)(dNum1+fNum1);
		int iNum3=(int)dNum1+(int)fNum1;
		
		System.out.println(iNum2); //2.1 => 2
		System.out.println(iNum3); //1.2 => 1  / 0.9 =>0  => 1+0=1
		
		

	}

}
