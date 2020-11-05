package work04;

import java.util.Scanner;

public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		//내꺼
		// random number 찾기 // 다시보기....ㅠㅠ
		/*
		 * 랜덤숫자 (1-100)
		 * 유저입력 - > 1 - 100
		 * 
		 * 입력받을시 / 랜덤숫자와 비교. 
		 * 
		 * 
		 * 77    < - 50				!! 10회의 기회 !!
		 * 			  너무 작습니다.
		 *  	 < - 75
		 *  		  너무 작습니다.
		 *  
		 *       < - 85
		 *			  너무 큽니다.
		 *
		 *			  정답입니다.
		 *
		 */
		
		
			
		int r_num, u_num;
		boolean clear;  // 맞췄는지 못맞췄는지 변수
		int w; //루프 변수
		String replay;
		
		while (true) {
			
		// 초기화 - r_num, u_num 필요없다. 입력받을거라서.
		
		
		clear = false;
		w = 0;
		
		// 1. random 수를 취득 (1 - 100)
		
		r_num = (int)(Math.random() * 100) + 1; //1-100 랜덤값 지정하기.
		System.out.println("r_num : " + r_num); //정답 일단 표시해두기.
		
		///////////////////////////////////// loop start
		
		while (w < 10) { //무한루프 break가 있기 전까지.
		
		// 2. user input (1 - 100)
		
		while(true) { //무한루프 진행... 정확한 범위로 입력할때까지.
		
				System.out.println("랜덤숫자 입력 = ");
				u_num = sc.nextInt();
				if( u_num >= 1 && u_num <= 100 ) {  // 정상적으로 입력했을때!
					break;
				}
				System.out.println("범위를 벗어났습니다! 다시 입력해주세요!");	
				}
		
		// 3. input과 정답 값 비교
		
		int find_num = 1; //메세지를 출력하기 위한 용도
		
		if(u_num > r_num) {    //값이 클때 (f)
			find_num = 1; // find_num1 스위치문 작동
		} else if (u_num < r_num) {  //값이 작을때 (f)
			find_num = 2; // find_num2 스위치문 작동
		} else { // 정답일때! (t) -> 5 결과 출력
			clear = true;
			break;
		}
		
		
		
		// 4. 메세지 출력
		
		switch(find_num) {
		case 1:
			System.out.println("너무 큽니다.");
			break;
			
		case 2:
			System.out.println("너무 작습니다.");
			break;
		}
		
		w++; // 못맞췄을시...기회 2번째로 됨.
		
		}
		
		///////////////////////////////////// loop end
		
		
		// 5. 결과 출력
		
		if(clear == true) {
			System.out.println("축하합니다. 클리어하셨습니다.");
		} else {
			System.out.println("아쉽습니다.. 다시 도전합시다.");
		}
		
		// 맞추던, 안맞추던 다시 도전 가능하게 출력.
		
		System.out.println("play again? (y/n)=");
		replay = sc.next();
		
		if(replay.equals("n")) {
			System.out.println("bye...");
			break;
			
		} else {
			System.out.println("good!");
			}
		}
		
		
		
		/*
		
		내가푼것 
		
		int num = 0;
		
		Scanner sc = new Scanner(System.in);
		
		int n = 0;
		
		for (int i = 0; i < 10; i++) {
			System.out.println("랜덤숫자 입력 = ");
			num = sc.nextInt();
			
			if(num == 77) {
				System.out.println("정답입니다." );
				break;
			}
			
			if(num < 77) {
				System.out.println("너무 작습니다." );
				continue; 
			}
			
			if(num > 77 && num <= 100) {
				System.out.println("너무 큽니다." );
				continue; 
			}
			
			if(num > 100) {
				System.out.println("100보다 큰 값입니다." );
				continue; 
			
		}
	

		}
		
		*/
		
		
		
		
		
		
	}

}
