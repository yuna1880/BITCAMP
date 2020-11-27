package work1127;

import java.util.Scanner;

public class workInt {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		
		// 입력을 받은 수가 정수, 소수인지를 판단하는 코드
		// 정수입니다, 소수입니다
				System.out.print("숫자 입력 = ");
				String strNum = sc.next();
				
				// '.'가 있으면 소수.  0, n-1 
				int len = strNum.length();
				int result = 0;
				for (int i = 0; i < len; i++) {
					char c = strNum.charAt(i);
					// 문자열인 경우
					if((i == 0 && c == '.') || (i == strNum.length()-1 && c == '.')) {
						result = 1;
						break;
					}
					// '.'가 있는지?
					if(c == '.') {
						result = 2;
						break;
					}			
				}
				
				switch(result) {
					case 0:
						System.out.println("이 숫자는 정수로 되어 있습니다");
						break;
					case 1:
						System.out.println("문자가 포함되어 있습니다");
						break;
					case 2:
						System.out.println("이 숫자는 소수로 되어 있습니다");
						break;
				}
		
		
		
		
		
		
		

	}

}
