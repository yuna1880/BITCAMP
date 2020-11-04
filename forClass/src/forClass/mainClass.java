package forClass;

public class mainClass {

	public static void main(String[] args) {
		/*
		 * 
		 * loop 문, 순환문 
		 * 지정된 횟수만큼 반복을 처리하는 제어문이다.
		 * 
		 * for((선언)초기화; 조건식; 연산식){
		 * 		처리
		 * }
		 * 
		 * int num = 0;
		 * 
		 * num = num + 1;
		 * num = num + 1;
		 * num = num + 1;
		 * num = num + 1;
		 * 
		 * -> 이것들을 한꺼번에 만들기 위해 만든게 for문
		 * 
		 * for (초기화(1); 조건식(2)(5)(8); 연산식(4)(7)){
		 * 		처리(3)참이면(6)
		 * }
		 * 
		 * 거짓일시 (9)
		 * 
		 */
		
		
		int n;
		for (n = 0; n < 10; n++) {
			System.out.println("n = "+ n ); // n= 0-9 까지 출력.
		} 
		System.out.println("n = "+ n ); //조건에 맞지 않아서 탈출된 10

		
		
		
		// 1 - 10 
		
		int num1 = 0;
		for(n =1; n <= 10; n++) {   // n <= 10; 값만 바꾸면 된다.
			num1 = num1 + n;
			System.out.println("n = "+ n );
		}
		
		System.out.println("n = "+ n ); //조건에 맞지 않아서 탈출된 11
		
		
		
		
		for(int i = 0; i <10; i++) {
			System.out.println("i = "+ i );
		}
		
		for (int i = 10; i > 0; i-- ) {
			
		}
		
		for (int i = 0; i < 10; i = i + 2) {
			System.out.println("i = "+ i );
		}
		
		int _num = 0;
		for(   ;_num < 10;  ) {  //초기화 부분 비고, 연산자 비어있다. 위. 아래로 가도 작동 가능.
			System.out.println("_num = "+ _num );
			_num++;
		}
		
		for(int i = 0, j = 0; i < 10; i++, j++) {
			System.out.println("i = "+ i );
			System.out.println("j = "+ j );
	}
	
	int n1, n2;
	for (int i = 0; i<10; i++) {
		
		n1 = 0;
		n2 = 0;
		System.out.println("n1 = "+ n1 );
		System.out.println("n2 = "+ n2 );
		n1++;
		n2++;
		
	}
		
		
		// 2중 for문!!!!!!!!!!!
		
		for(int i = 0; i < 10; i++) { // 0-9 까지 돌아간다
				System.out.println("i = "+ i );
			for(int j = 0; j<5; j++) { //5번 돌아간다 01234
				System.out.println("  j = "+ j );
			}
			
		}
		
		
		
	}
	
	

}
