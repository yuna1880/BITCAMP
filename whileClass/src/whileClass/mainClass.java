package whileClass;

public class mainClass {

	public static void main(String[] args) {
		
		/*
		 * while (순환문)
		 * do while (거의 사용x)
		 * 
		 * 형식: 
		 * 		변수선언
		 * 		변수 초기화
		 * 		
		 * 		while(조건식){
		 * 			처리
		 * 			연산식
		 * 		}
		 * 
		 * 		변수선언
		 * 		변수 초기화
		 * 
		 * 		do{
		 * 			처리
		 * 			연산식			
		 * 			} while(조건식);   
		 * 
		 *     조건의 위치가 다르다
		 * 		for ( 초기화; 조건식; 연산식) {
		 * 				처리
		 * 		}
		 * 
		 * 
		 */
		
		//while 은 무한루프로 빠질 가능성이 높다. but, 매우 간결하다.
		
		int w;
		w = 0;
		while(w < 10) {
			System.out.println("w:"+w);
			w++; //연산식은 아래에
		}
		
	
		
		System.out.println();
		/*
		 * 
		 * 
		 * 
		 * init (초기화)
		 * 
		 * loop - while 
		 * 
		 * release - 
		 * 
		 * 
		 * 
		 * 
		 */
		
		// 조건이 맞던 안맞던 일단은 값이 들어온다.  (무조건 한번은 실행된다)
		
		int w1;
		w1 = 0; // 조건 안맞음
		
		do {
			System.out.println("w1:"+w1);
			w1++;
		} while(w1<10); // 그래도 출력!
			
		
		System.out.println();
		
		
		//구구단 출력 
		// 2중 while문 사용 (중간에 초기화 필수!!)
		
		
		int w2, w3;
		w2 = 0;
		w3 = 0;
		
		while (w2 < 10) {
			System.out.println("w2 ="+w2);
			w3 = 0;  //!!! 초기화를 밖에서 해줘야한다. 안그러면 w3는 5(마지막 값)에서 멈춰있다.
			while(w3 < 5) {
				System.out.println("w3 =" +w3);
				w3++;
			}
			w2++;
		}
		
		for (int j = 0; j < 10; j++) {
			for (int n = 1; n <= 9; n++) {
				System.out.print( j + "x" + n + " = " + (j*n) + " " );
				}
			System.out.println();
		}
		
		//???? 이중 while문으로 구구단하기
		
		int w4,w5;
		w4 = 0;
		w5 = 0;
		
		
		while(w4 < 10);{
			while(w5 <= 9) {
				System.out.println(w4 + "x" + w5 + "=" + (w4*w5));
				w5++;
			}
			w4++;
		}
		
		
		
		
	}

}
