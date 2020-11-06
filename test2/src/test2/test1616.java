package test2;

import java.util.Scanner;

public class test1616 {

	public static void main(String[] args) {
		
		//사칙연산 할 수 있는 프로그램을 작성하라
		
		Scanner Scaner = new Scanner(System.in);
		
		
		int num1,num2;
		String operator;
		int result;
		
		
		result = 0; // 초기화
		
		//입력받는 부분 (선언)
		
		System.out.print("첫번째 수 = ");
		num1 = Scaner.nextInt();
		
		System.out.print("연산자 입력 +,-,*,/ = ");
		operator = Scaner.next();
		
		System.out.print("두번째 수 = ");
		num2 = Scaner.nextInt();
		
		
		// 연산처리 (processing)
		
		switch(operator) {
			case "+":
				// System.out.print(num1 + "+" + num2 + "=" + (num1+num2));
				result = num1 + num2;
				break;
				
			case "-":
				
				result = num1 - num2;
				break;
				
			case "*":
				
				result = num1 * num2;
				break;
				
			case "/":
				
				result = num1 + num2;
				break;
		
		}
		
		//printing
		
		System.out.println (num1+ "" + operator + num2 + "=" + result);
		
		
		
		
		
		
		// 내가 푼 것
		
		/*
	
		Scanner Scaner = new Scanner(System.in);
		
		int a,b;
		char operator;
		System.out.print("첫번째 수 = ");
		a = Scaner.nextInt();
		System.out.print("두번째 수 = ");
		b = Scaner.nextInt();
		System.out.print("연산자 입력 +,-,*,/ = ");
		operator = Scaner.next().charAt(0);
		
		double add = a+b;
		double sub = a-b;
		double multi = a*b;
		double div = a/b;
		
		switch(operator) {
		
		case '+' :
			System.out.print("더하기 결과는 " +  add);
			break;
			
		case '-' :
			System.out.print("빼기 결과는 " +  sub);
			break;
			
		case '*' :
			System.out.print("곱하기 결과는 " +  multi);
			break;	
			
		case '/' :
			System.out.print("나누기 결과는 " +  div);
			break;	
			
			default:
				System.out.print("잘못된 입력입니다.");
				break;
			
		}
		
		*/
		

		
		
		
		
	}

}
