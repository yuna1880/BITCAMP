package test2;

public class test17 {

	public static void main(String[] args) {
		
	// 1-100사이에 짝수의 합과 홀수의 합을 각각 출력하도록 작성하라.
		
	int sum1,sum2;
	sum1 = sum2 = 0;    // sum1 (홀) , sum2 (짝) 초기화
	
	
	for (int i = 1; i <= 100; i++) {
		if ( i % 2 == 1) { //홀수
			sum1 = sum1 + i;
		} else {
			sum2 = sum2 + i;
		}
	}
	
	System.out.println("1-100사이 홀수의 합은 :" + sum1);
	System.out.println("1-100사이 짝수의 합은 :" + sum2);
	
	
	
	
	
	
	/*
	 * 
	for (int i = 0; i <= 100; i=i+2) {
		sum1 += i;
	}
	System.out.println("1-100사이 짝수의 합은 :" + sum1);
	
	
	
	for (int i = 0; i <= 100; i=i+1) {
		sum1 += i;
	}
	System.out.println("1-100사이 홀수의 합은 :" + sum1);
	
	*/
	
	
	}

}
