import java.util.Arrays;
import java.util.Scanner;

public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 
		 * Sorting 
		 * 
		 * java < oracle
		 * 
		 * Sorting : 정렬 /  숫자의 크기에 따라서 순번대로 배치하는 처리.
		 * 
		 * 1 5 2 4 3 -> 1 2 3 4 5 (오름차순)
		 * 
		 *           -> 5 4 3 2 1 (내림차순)
		 * 
		 * 선택정렬, 버블정렬, 합병정렬, 퀵 정렬
		 * 
		 * 정렬, 셔플, (트리, 탐색) -> 자주나옴,
		 * 
		 */
		
		
		
		 int number[] = {1,5,2,4,3};
		
		/*	
		 * 1)  1 5 비교 
		 *     1   2 비교
		 *     1     4 비교
		 *     1       3 비교
		 *     
		 * 2)     5   2 비교 -> 2 5
		 *        2   4 비교    
		 *        2   3 비교
		 *        
		 * 3)     5   4 비교 - > 4 5       
		 *        4   3 비교 ->  3 4
		 *        
		 * 4)            
		 * 
		 */
		
		// i-> 앞의 숫자 j-> 뒤에 숫자
		
		
		int temp;
		
		
		for (int i = 0; i < number.length; i++) {  //0   // 1  // 2
			for (int j = i + 1; j < number.length; j++) { // 1-4 // 2-4 // 3-4
				//오름차순
				if(number[i] > number[j]) {
					//swap
					temp = number[i];
					number[i] = number[j];
					number[j] = temp; //  앞의 숫자가 뒷숫자보다 크면 뒤에숫자랑 바꿔준다.			
				} 
			}
		}
		
		
		for (int i = 0; i < number.length; i++) {
			System.out.print(number[i]+" ");
		}
		
		
		
		
		System.out.println(Arrays.toString(number));
		
		
		
		
		
		
		
		// !!!! quick sort 찾아보기.
		
		
		// 과 제 1 
		
		Scanner sc = new Scanner(System.in);
		
		
		
		int number[] = null; // 초기화
		boolean updown = false; // 올림, 내림
		
		
		// user 몇개 정렬할것이냐 ? 입력받기
		
		System.out.print(" 정렬하고 싶은 숫자의 개수 입력  = ");         
		int count = sc.nextInt();  // 5
		
		// 배열 확보
		
		number = new int[count]; // 배열 5
		String strNum[] = new String[count]; 5
		
		// user 숫자들 입력받기 (잘못 입력시 다시 입력?)
		
		int w = 0;
		
		while(w < number.length) { //5번 반복
			
			System.out.print((w + 1)+"번째 수 = ");
			strNum[w] = sc.next();
			
			
			
			// check 문자인지 숫자인지
			
			boolean b = false;
			for (int i = 0; i < strNum[w].length(); i++) { // 글자의 길이만큼!
				int asc = (int)strNum[w].charAt(i);
				
				if(asc < 48 || asc > 57) { // 문자일때 true
					b = true;
					break;
				}
			}
			
			if(b == true) {
				System.out.println("error. 잘못 입력하셨습니다. 다시 입력하세요.");
				continue;
			}
			
			w++;
		}
		
		// user 올림/ 내림 ? 입력받기
		
		
		System.out.print("오름차순(1)  or 내림차순(2) = ");
		int ud = sc.nextInt();
		
		if(ud == 1) updown = true;
		else updown = false;
		
		
		// string -> integer
		
		for (int i = 0; i < strNum.length; i++) {
			number[i] = Integer.parseInt(strNum[i]); //
		}
		
		
		//정렬 
		
		for (int i = 0; i < number.length - 1; i++) {
			for (int j = i+1; j < number.length; j++) {
				
				if(updown == true) {
					if(number[i] > number[j]) {//오름
					
					int temp1 = number[i];
					number[i] = number[j];
					number[j] = temp1;
					
				} else {
					if(number[i] < number[j]) {
						
						int temp1 = number[i];
						number[i] = number[j];
						number[j] = temp1;
						}
					}
				
				}
		
			}
		}
		
		
		for (int n : number) {
			System.out.println(n+" ");
			
		}
		
		
		
		
		
		
		
	}

}
