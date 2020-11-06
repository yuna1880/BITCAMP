package work06;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// 내가 푼것....
		
		
		//입력된 문자열이 모두 숫자인지 확인? 하는 코드
		
		/*
		 * 
		 * string "12345" 모두 숫자입니다.
		 * 			"123a34" 숫자가 아닙니다.
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		

		char tmp;
		
		System.out.println("확인하고 싶은 숫자 입력 = ");
		String input = sc.nextLine(); // String 타입의 변수 input에 저장!
		System.out.println("확인할 값 = " + input);
		
	
		// 비교
		
		boolean output = false;
		
		for (int i = 0; i < input.length(); i++) { //입력받은 input의 길이만큼 진행.
			tmp = input.charAt(i); //한글자씩 검사.
			
			if(!('0' <= tmp && tmp <= '9')) { //문자가 0-9사이가 아닐경우! 숫자 하나씩 검사하는 것이므로..범위는 0-9 
				output = false;
			}  
		}
		
		output = true;
		
		//결과
		
		
		if(output) {
			System.out.println(input + " 은 모두 숫자입니다.");
		} else {
			System.out.println(input + " 은 모두 숫자가 아닙니다.");
		}
		

		
		//2번 문제 ) 입력을 받은 수가 정수인지, 소수인지 판별! (.)이 있는지 없는지 확인.
		
		
		//선언
		
		
		boolean output1;
	
		
		// 입력받는 
		
		
		
		
		System.out.println("확인하고 싶은 숫자 입력 = ");
		String input1 = sc.next();
		
		output1 = false;
		
		int len = input1.length();
		
		for (int i = 0; i < len; i++) {
			char c = input1.charAt(i);
			
			if(input.contains(".")) {
				output1 = true;
				break;
			} 
			
			
		}
		
		if (output1 = true) {
			System.out.println(input1 + "는 소수입니다.");
		} else {
			System.out.println(input1 + "는 정수입니다.");
		}
		
		
		
		
		
		//3번 문제 ) 입력된 알파벳 문자열을 모두 대문자로 변경하는 코드
		
		
		
		System.out.println("확인하고 싶은 문자 입력 = ");
		String input3 = sc.next(); 
		
		String output3 = input3.toUpperCase();
		System.out.println(output3);
			
		
		
		
		
	}

}
