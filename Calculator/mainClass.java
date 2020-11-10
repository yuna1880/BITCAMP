import java.util.Scanner;

public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 계산기 (ok) -> 나중에 함수로 바꿀겁니
		 
		 * 1. 첫번째 수 입력 (숫자인지 아닌지)
		
		 * 2. 연산자(정확히 연산자인지?)
		 * 
		 * 3. 두번째 수 입력 (숫자인지 아닌지)
		 * 
		 * 4. 연산처리
		 * 
		 * 5. 결과출력
		 * 
		
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int num1,num2;
		String snum1,snum2; //(숫자인지 아닌지 구별)
		
		String oper;
		int result = 0;
		
		
		// 1. 첫번째 수 입력 (숫자인지 아닌지 - > string) 
		
		int w = 0;
		
		while(true) {
		
		System.out.print("첫번째 수 = ");
		snum1 = sc.next();
		
		//숫자인지 아닌지
		
		boolean ok  = true;
		
		for (int i = 0; i < snum1.length(); i++) {
			int c = (int)snum1.charAt(i);
			int asc = (int)c;
			
			if(asc < 48 || asc > 57) {
				System.out.println("숫자가 아닙니다. 숫자를 입력하세요.");
				ok = false;
				break;
				}
			}
		
			if (ok == true) {
				break;
			}
		}
		
	
		
		// 2. 연산자(정확히 연산자인지?)
		// 선생님이 고친 버전도 보기!
		
		while(true) {
		System.out.print("연산자 입력 +,-,*,/ = "); //1글자밖에 안된다.
		oper = sc.next();
		
		if (oper.equals("+") || oper.equals("-") || 
				oper.equals("*") || oper.equals("/")) {
				break;
			} else {
				System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
			}
		}
		
		
		
		// 3. 두번째 수 입력 (숫자인지 아닌지)
		
		
		while(true) {
			
			System.out.print("두번째 수 = ");
			snum2 = sc.next();
			
			//숫자인지 아닌지
			
			boolean ok  = true;
			
			for (int i = 0; i < snum2.length(); i++) {
				int c = (int)snum2.charAt(i);
				int asc = (int)c;
				
				if(asc < 48 || asc > 57) {
					System.out.println("숫자가 아닙니다. 숫자를 입력하세요.");
					ok = false;
					break;
					}
				}
			
				if (ok == true) {
					break;
				}
			}
			
		
		
		
		
		
		// 4. 연산처리
		
		num1 = Integer.parseInt(snum1);
		num2 = Integer.parseInt(snum2);
		
		
		
		switch(oper) {
			case "+":
				result = num1 + num2;
				break;
			
			case "-":
				result = num1 - num2;
				break;
			
			case "*":
				result = num1 * num2;
				break;
				
			case "/": // 0으로 나눌때를 막아줘야한다.
				if (num2 != 0) {
				result = num1 / num2;
				break;	
			}
		}
		
		
		
		// 5. 결과출력
		
		
		System.out.println(num1+ " " + oper + " " + num2 + "=" + result);
		
		
	
		
		
	}

}
