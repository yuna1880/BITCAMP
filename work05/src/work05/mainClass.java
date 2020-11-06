package work05;

import java.util.Random;
import java.util.Scanner;

public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 
		 * baseball 게임
		 * 
		 * 1 - 10 |        7  3  5
		 * 				   1  2  3 <-  1 ball (숫자만 맞을때)
		 * 				   2  3  7 <-  1 strike (숫자, 자리 둘 다 맞을때 ) 1 ball
		 * 				   7  3  6 <-  2 strike
		 * 
		 * 룰 : 랜덤숫자3개는 다 달라야 합니다.       (배열로?)
		 * 		uers 입력 숫자 3개 다 달라야 합니다. /  다를시, 다시 입력해!!!!라고 뜨게.
		 * 		10번의 기회만 주도록!
		 * 			
		 */				
		
		Scanner sc = new Scanner(System.in);
		
		//초기화
		
		int com[] = new int[3];   //컴퓨터 랜덤넘버
		int user[] = new int[3];    // 입력받은 랜덤넘버
		int strike = 0;
		int ball = 0;
	
		boolean randomball = true;  // 맞췄는지 못맞췄는지 
		
		//1. 랜덤 수 취득 (?)
		
		while (randomball) {
			for (int i = 0; i < com.length; i++) {
				com[i] = (int)(Math.random()*10)+1;  // 1-10까지의 랜덤 숫자 생성.
				for (int j = 0; j < i; j++) {
					if (com[i] == com[j]) { // 위치와 값이 같을경우, 해당 위치의 숫자를 다시 생성하기 위한 작업.
						i--;
						break;
					}
				}
			}
			
			randomball = true;
	
		randomball = false;
		
		
		if(randomball == true) {
			System.out.println("지정 랜덤 넘버 = " + com[0] + "," + com[1] + "," + com[2]);
		} 
		
	
			
			
		///////////////////////////////////loop start
		
		//2. user input
		
		while(strike < 3) {
			
			for (int j = 0; j < user.length; j++) {
				System.out.println((j+1)+" 번째 수 입력 = ");
				user[j] = sc.nextInt();
				
				while (user[j] > 10 || user[j] <= 0) {  // 10이상, 0이하로 입력하면 오류 출력!!
					System.out.print("error. 1-10사이의 수를 입력하세요.");
					System.out.println((j+1)+" 번째 수 입력 = ");
					user[j]=sc.nextInt();
				}
			}	
	
		//3. input과 정답 값 비교 (strike & ball check)
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) { 
				if(com[i] == user[j]) { //[0] [0] 배열 자리수가 같을때
					if (i == j) { // 그 자리 수 앉의 값이 같을때
						strike += 1;   // 스크라이크 누적
					} else {
					ball += 1;   // 아닐시 볼 누적
					}
				}
			}
		}
	
		
		//4. 메세지 출력
		
		if (strike == 0 && ball == 0) {
			System.out.println("아웃!!!!");	
		} else if (strike == 3) {
			System.out.println("스크라이크!!!");
			randomball = true;
		} else {
			System.out.print("스트라이크  = " + strike + " 볼 = " + ball );
			strike=0;
			ball=0;   // 
		}
		
		}
		
		/////////////////////////////////loop
		
		
		// 5. 결과 출력
		
		if(randomball == true) {
			System.out.println("축하합니다. 클리어하셨습니다.");
		} else {
			System.out.println("아쉽습니다.. 다시 도전합시다.");
		}
		
		
		
		
		}
		
	}


