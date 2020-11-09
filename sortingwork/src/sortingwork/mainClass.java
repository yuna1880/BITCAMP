package sortingwork;

import java.util.Arrays;
import java.util.Scanner;

public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//내가 푼것 
		
		Scanner sc = new Scanner(System.in);
		
		int u_count;
		
		int array[];
		
		
		// user 몇개 정렬할것이냐 ? 입력받기
		
		
		System.out.print(" 정렬하고 싶은 숫자의 개수 입력  = ");       
		u_count = sc.nextInt();
		
		// 배열 확보
		
		array = new int[u_count];  // 배열  확보 [ 0, 0, 0, 0 ]
	
		
		// user 숫자들 입력받기 (잘못 입력시 다시 입력?)
	
		
		for (int i = 0; i < array.length; i++) {
			System.out.print( i+1 +"번째 숫자 입력  = "); 
			array[i] = sc.nextInt();
			
			while (array[i] < 0) {
				System.out.print("error. 0보다 큰 값을 입력하세요.");
				System.out.print( i+1 +"번째 숫자 입력  = ");
				array[i] = sc.nextInt();
			}
		}
		
		System.out.println(Arrays.toString(array));
		
		// user 올림/ 내림 ? 입력받기
		
		String sort;
		
		System.out.println(" 오름차순  or 내림차순 ? = ");
		sort = sc.next();
		
		
		
		// 정렬 오름차순
		
		switch(sort) {
			case "오름차순":
				int temp;
				
				for (int i = 0; i < array.length; i++) { //1
					for (int j = i+1; j < array.length; j++) { // 5
						if(array[i] > array[j]) {
							temp = array[i];
							array[i] = array[j];
							array[j] = temp;
						}
					}
				}
				break;
				
			case "내림차순":
				
				int temp1;
				
				for (int i = 0; i < array.length; i++) { //1
					for (int j = i+1; j < array.length; j++) { // 5
						if(array[i] < array[j]) {
							temp1 = array[i];
							array[i] = array[j];
							array[j] = temp1;
						}
					}
				}
				break;
			}
		
		
		// 결과 출력
		
		System.out.println(Arrays.toString(array));
		
		
		
		
		
		
	}

}
