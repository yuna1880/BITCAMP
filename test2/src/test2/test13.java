package test2;

public class test13 {

	public static void main(String[] args) {
		
	// 1 - 1000사이의 수를 전부 합친 값을 출력하라.	
	
	int sum = 0;
	for (int i = 1; i <= 1000; i++) {
		sum = sum + i;
	}
	System.out.println("sum = " + sum);
		
		
	// 2번째 방법
	
	sum = 0;
	int count = 1;
	for (int i = 0; i < 1000; i++) {
		sum = sum + count;
		count++;
	}
	
	
		
	
	
	
//	int sum = 0;
//	for (int i = 0; i < 1000; i++) {
//		sum += i;  // sum = sum + i
//	}
//	System.out.println(sum);

	
	
	
	
		}	
	}


