package test2;

import java.util.Scanner;

public class test1616 {

	public static void main(String[] args) {
		
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
		
		
		

		
		
		
		
	}

}
