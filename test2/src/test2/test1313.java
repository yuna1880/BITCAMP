package test2;

import java.util.Scanner;

public class test1313 {

	public static void main(String[] args) {
		
		Scanner Scaner = new Scanner(System.in);  // 1. 입력받아야하니 스캐너 준비!
		
		// 유저로부터 입력 받은 수들의 합계와 평균을 구하는 프로그램을 작성하라.
		
		// 선언
		int numArr[] = null; 
		int sum;	// 합계 값		
		double avg; // 평균 (sum이 구해진 다음에 구해져서, 초기화 필요 x)
		int count; // 입력받은 변수
		
		// 초기화
		sum = 0;
		
		// 입력 
		// 1. 몇개?
		System.out.print(" 연산하고 싶은 숫자의 개수 입력  = ");
		count = Scaner.nextInt();
				
		// 2. 동적할당 (배열의 갯수 지정) // 입력한 값이 동적할당이 된다.
		numArr = new int[count];		
				
		// 3. 숫자의 갯수만큼 입력
		
		for (int i = 0; i < numArr.length; i++) {
			System.out.print(( i + 1 )+"번째 수 = ");
			numArr [i] = Scaner.nextInt();
		}
		
		// 합계 산출
		for (int i = 0; i < numArr.length; i++) {
			sum = sum + numArr [i];
		}
		
		// 평균 산출
		avg = sum / numArr.length;
		
		// 결과 출력
		System.out.println("합계:" + sum);
		System.out.println("평균:" + avg);
		
		
		
		
		
	}

}
