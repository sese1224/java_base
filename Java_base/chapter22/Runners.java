package chapter22;

import java.util.Random;

public class Runners {
	public static void main(String[] args) {
	
		int [] playerRandom = new int[5];
		String[] playerJump = {"","","","",""};
		
		boolean finish =false;
		int finishPlayer =0;
		
		while(true) {
		//도약거리
		for(int i=0;i<playerRandom.length;i++) {
			playerRandom[i] = new Random().nextInt(4);//0~3 
		}
		
		//0.1초 간격으로 휴식
		try {
			Thread.sleep(100);
		} catch (Exception e) {
			e.printStackTrace();
		}
			//각 선수에게 도약거리 적용
			for(int j =0;j<playerJump.length;j++) {
				switch (playerRandom[j]) {
				case 0:
					playerJump[j] += "   ";
					break;
				case 1:
					playerJump[j] += "  ";
					break;
				case 2:
					playerJump[j] += "     ";
					break;
				case 3:
					playerJump[j] += "";
					break;

	
				}//스위치
			}//for
			//달리기
			System.out.println("-----------------------------------------------------------");
			for(int i=0;i<playerJump.length;i++) {
			System.out.print(playerJump[i]);
			System.out.println(+i+1+" 옷");
			
			if(playerJump[i].length() >=50) {
				finishPlayer = i+1;
				finish = true;
				}
			}//for
			System.out.println("------------------------------------------------------------");
			
			//결산
			
			if(finish) {
				System.out.println("WIN"+finishPlayer);
				break;
				}
			}
		}//메인
	
	}


