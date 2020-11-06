package test2;

import java.util.Scanner;

public class test18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 
		 * 
		 *****
		 *****
		 ***** 
		 ***** 
		 ***** 
		 ***** 
		 ***** 
		 *****
		 *****
		 *
		 * 
		 */
		// 별모양 출력 1 (가로 5/ 세로 9)
		
		
		for (int i =1; i<=9; i++) {
			for (int j =1; j<=5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		System.out.println();
		
		
		// 별모양 출력 2 
		
		
		int n =0;
		for (int j =0; j < 9; j++) {
			if(j < 5) n++;
			else n--;
			
			for (int i =0; i< n; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		System.out.println();
		System.out.println();
		
		
		
		//내가 푼 것 2
		
		
		for (int i= 1; i<=5; i++) {
			for (int j = 0; j<i; j++) {
				System.out.print("*");
			}
				System.out.println();
		}
		
		for (int i= 10; i>=5; i--) {
			for (int j = 5; j<i; j++) {
				System.out.print("*");
			}
				System.out.println();
		}
		
		
		
		// 배열 이용해서 별그리기
		
		/* 
		 * 
		 **
		 ***** 
		 ***
		 * 
		 ****** 
		 ***** 
		 *
		 *
		 *
		 */
		System.out.println();
		System.out.println();
		
		
		int array[] = { 2, 5 ,3, 1, 6, 5 };		
		
		for (int i = 0; i < array.length; i++) { 
			for (int j = 0; j < array[i]; j++) { //array 의 0번째, 1번째...는 i가 가지고있다.
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
	}
	

}
