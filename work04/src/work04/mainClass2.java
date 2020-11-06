package work04;

import java.util.Scanner;

public class mainClass2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//선언
		
		int r_num[] = null; // 컴퓨터 랜덤넘버
		//int r_num[] = {1,2,3,4,5,6,7,8,9,10};//2번 방법용
		int u_num[] = null; // 유저 입력받는 넘버 //  둘 다 초기값 null // 동적할당 받는건 선언과 동시에 초기화 해줘야한다.
		
		
		int strike,ball; // 쌓이는 것이라 초기화할 필요 없다. 
		
		boolean clear; 
		int gameloop;
		boolean swit[] = new boolean[10]; //3번째 방법 스위치. // 숫자의 개수만큼 , 10개 배열 동적할당해주기.
		
		// TODO:초기화
		
		r_num = new int[3];  // 2번 방법용
		u_num = new int[3];  // 나오는 배열은 3개로 잡아놓기 + 초기화.
		
		clear = false;
		gameloop = 0; // w 루프용 변수.
		
		for (int i = 0; i < swit.length; i++) {
			swit[i] = false; //3번째방법// switch off 해놓기
		}
		
		// 1.random 3개 취득.
		
		
		/*// 램덤 취득 1번 방법
		
		while(true) {
		for (int i = 0; i < r_num.length; i++) {
			r_num[i] = (int)(Math.random()*10)+1;
		} 
		 
		if(r_num[0] != r_num[1] 
				&& r_num[0] != r_num[2] 
						&& r_num[0] != r_num[2])
			break;
		} 
		
		*/
		
		
		/*// 2번 방법 (swap) 이용.
		
		int r1,r2;
		
		
		for (int i = 0; i < 1000; i++) {
			r1 = (int)(Math.random()*10); // 0-9 나옴
			r2 = (int)(Math.random()*10); // 0-9 나옴
			
			int temp = r_num[r1];
			r_num[r1] = r_num[r2];
			r_num[r2] = temp;   //넘버 섞는 과정.
		}
		
		//r_num[0] - [2] 까지 사용.
		
		for (int i = 0; i < r_num.length; i++) {
			System.out.println("r_num[ " + i + " ]" + r_num[i]);
		}
		*/
		
		
		// debug 작업.
		
		//3번 방법.
		
		int r, w;
		w = 0;
			
		while(w < r_num.length) {  
			r = (int)(Math.random()*10); // 0-9까지 나온다.
		if(swit[r] == false) { //스위치가 꺼져있는지 확인!!!
			swit[r] = true; // 꺼져있으면 들어와서 스위치 켜준다.
			r_num[w] = r + 1; // 범위 0-9 -> 1-10으로 바뀜.
			w++;
			
			} 
		}
		
		for (int i = 0; i < r_num.length; i++) {
			System.out.println("r_num["+ i +"] = " + r_num[i]);
		}
		
		/////////////////////////////////////// loop
		
		
		while(gameloop < 10) {
		
			// 2. TODO:user input (3개의 값 취득.)
		
			while(true){
				w = 0;
				while(w < 3) {
					System.out.print(( w + 1 )+ " 번째 수 = ");
					u_num[w] = sc.nextInt();
					w++;   // 1번째 - 3번째
		}
		
		//입력한 수가 중복되는 것이 있는 지 없는지 확인하는 법
		if(u_num[0] == u_num[1] ||
				u_num[0] == u_num[2] ||
					u_num[1] == u_num[2]) {
				System.out.println("같은숫자가 있습니다. 다시 입력하세요.");
				continue;
			}
			break;
		}
		
		
		// 3. finding (판정) / 정답 값 비교.
		
		strike = ball = 0;
		
		//ball
		
		for (int i = 0; i < r_num.length; i++) {
			for (int j = 0; j < r_num.length; j++) {
				if (u_num[i] == r_num[j] && i != j) { // 자리는 같지만, 숫자가 다를때 ball
					ball++;
				}
			}
			
			
		}
		
		
		//strike
		
		
		for (int i = 0; i < r_num.length; i++) {
			if (u_num[i] == r_num[i]) {    //자리도 같고 숫자도 같을때
				strike++;
			}
		}
		
		
		///////////////////// loop
		
		if (strike == 3) {
			clear = true;
			break;
		}
		
		// 4. 메세지 출력. (판정에 대한 값으로)(아웃, 스크라이크, 볼 등등)
		
		System.out.println( strike + "스트라이크" + ball + "볼 입니다.");	
		
		gameloop++;
		
		}
		
		/////////////////////////////////////// loop
		
		// 5. 결과 출력.
		
		
		if(clear) {
			System.out.println("Game Clear!!");
		} else {
			System.out.println("Game over!!");
		}
		
		
		
		
		
		
	}

}

