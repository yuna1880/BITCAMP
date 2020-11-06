package test2;

import java.util.Scanner;

public class test16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// 임의 수를 입력받고 그 해당하는 수의 구구단을 출력하는 프로그램을 작성하라. 
		
		
		Scanner Scaner = new Scanner(System.in);	
		
		int input;
		System.out.print("input =" );
		input = Scaner.nextInt();
		
		
		for (int i = 1; i < 10; i++) { // 9번 반복된다.
			System.out.print(input + "x" + i + " = " + (input * i)+ " ");
		}
		
		
		// 내가 푼 것
		

		if (input == 1) {
			
			int num1 = 1;
			for (int n = 1; n <= 9; n++) {
				System.out.printf("%d * %d = %d \n", num1, n , num1*n );
				}
		}
		
		else if (input == 2) {
			
			int num2 = 2;
			for (int n = 1; n <= 9; n++) {
				System.out.printf("%d * %d = %d \n", num2, n , num2*n );
				}
		}
		
		else if (input == 3) {
			int num3 = 3;
			for (int n = 1; n <= 9; n++) {
				System.out.printf("%d * %d = %d \n", num3, n , num3*n );
				}
		}
		
		else if (input == 4) {
			int num4 = 4;
			for (int n = 1; n <= 9; n++) {
				System.out.printf("%d * %d = %d \n", num4, n , num4*n );
				}
		}
		
		else if (input == 5) {
			int num5 = 5;
			for (int n = 1; n <= 9; n++) {
				System.out.printf("%d * %d = %d \n", num5, n , num5*n );
				}
		}
		
		else if (input == 6) {
			int num6 = 6;
			for (int n = 1; n <= 9; n++) {
				System.out.printf("%d * %d = %d \n", num6, n , num6*n );
				}
		}
		
		else if (input == 7) {
			int num7 = 7;
			for (int n = 1; n <= 9; n++) {
				System.out.printf("%d * %d = %d \n", num7, n , num7*n );
				}
		}
		
		else if (input == 8) {
			int num8 = 8;
			for (int n = 1; n <= 9; n++) {
				System.out.printf("%d * %d = %d \n", num8, n , num8*n );
				}	
		}
		
		else if (input == 9) {
			int num9 = 9;
			for (int n = 1; n <= 9; n++) {
				System.out.printf("%d * %d = %d \n", num9, n , num9*n );
			}
		}
		
	}
	
}

		


