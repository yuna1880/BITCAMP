package work06;

import java.util.Scanner;

public class test11 {

	public static void main(String[] args) {
		
		//선생님 버전
		
		//입력된 문자열이 모두 숫자인지 확인? 하는 코드
		
				/*
				 * 
				 * string "12345" 모두 숫자입니다.
				 * 			"123a34" 숫자가 아닙니다.
				 * 
				 */
		
		Scanner sc = new Scanner(System.in);
		
		/*
		
		System.out.println("확인하고 싶은 숫자 입력 = ");
		String input = sc.next(); //input이 숫자인지 아닌지 !?
		
		//문자열의 길이
		
		/*
		
		int len = input.length(); //한글자씩 조사!
		
		char c = input.charAt(0); //하나씩 끄집어내는 함수
		int ascCode = (int)c;
		//System.out.print("ascCode:" + ascCode);
		for (int i = 0; i < len; i++) {
		if(ascCode > 48 && ascCode <= 57) {
			System.out.print("숫자입니다.");
		} else {
			System.out.print("숫자가 아닙니다.");
		}	
			
			
		}
		
		boolean b = false;
		
		for (int i = 0; i < len; i++) {
			char c = input1.charAt(i);
			int ascCode = (int)c;
			if(ascCode < 48 && ascCode > 57) {
				b=true;
				break;
			} //문자가 하나 껴있다는 의미
	
		} 
		
		if(b == true) {
			System.out.println(input + " 문자가 포함되어 있습니다.");
		} else {
			System.out.println(input + " 은 모두 숫자입니다.");
		}
		
		*/

		
		System.out.println("확인하고 싶은 숫자 입력 = ");
		String strNum = sc.next();
		
		// '.' 가 있으면 소수.  0(맨 앞), n-1(맨 뒤) 는 .가 나오면 안된다. / 맨뒤는 포함 x
		
		int len = strNum.length();
		int result = 0;  //계속 0이면 문자도 아니고 숫자도 아니다.
		
		
		for (int i = 0; i < len-1; i++) {
			char c = strNum.charAt(i);
			//문자열인 경우
			if((i == 0 && c == '.')||(i == strNum.length() - 1 && c == '.')) {
				result = 1;
				break;
			}
			
			// . 가 있는지?
			if (c == '.') {
				result = 2;
				break;
			}
			
		}
		
		switch(result) {
			case 0: 
				System.out.println("이 숫자는 정수로 되어있습니다.");
				break;
			case 1: 
				System.out.println("이 숫자는 문자가 포함되어있습니다.");
				break;
			case 2: 
				System.out.println("이 숫자는 소수입니다.");
				break;
		}
		
		
		
		
		
		
	}

}
