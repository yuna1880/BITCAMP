package test2;

import java.util.Scanner;

public class test14 {

	public static void main(String[] args) {
		
		
	//하나의 수를 입력받고 	10의 배수로 입력받은 수는 어느 범위에 있는지 출력되는 프로그램을 작성하라.
		
	
	Scanner Scaner = new Scanner(System.in);	
		
	int input;
	System.out.print("숫자입력 =" );
	input = Scaner.nextInt();
	

	if(input > 90 && input <= 100 ) {
		System.out.println("입력한 수는 90보다 크고 100보다 작거나 같습니다.");
	}
	
	else if (input > 80 && input <= 90) {
		System.out.println("입력한 수는 90보다 작고 80보다 큽니다.");
	}
	
	else if (input > 70 && input <= 80) {
		System.out.println("입력한 수는 80보다 작고 70보다 큽니다.");
	}
	
	else if (input > 60 && input <= 70) {
		System.out.println("입력한 수는 70보다 작고 60보다 큽니다.");
	}
	
	else if (input > 50 && input <= 60) {
		System.out.println("입력한 수는 60보다 작고 50보다 큽니다.");
	}
	
	else if (input > 40 && input <= 50) {
		System.out.println("입력한 수는 50보다 작고 40보다 큽니다.");
	}
	
	else if (input > 30 && input <= 40) {
		System.out.println("입력한 수는 40보다 작고 30보다 큽니다.");
	}
	
	else if (input > 20 && input <= 30) {
		System.out.println("입력한 수는 30보다 작고 20보다 큽니다.");
	}
	
	else if (input > 10 && input <= 20) {
		System.out.println("입력한 수는 10보다 작고 20보다 큽니다.");
	}
	
	else if (input > 0 && input <= 10) {
		System.out.println("입력한 수는 0보다 작고 10보다 큽니다.");
	}
	
	else {
		System.out.println("입력한 값을 알 수 없습니다.");
	}
	
	
	// 다른방법 (숫자가 1000까지 있을때...?)
	
	
	System.out.print("숫자입력 =" );
	input = Scaner.nextInt();
	
	int n = 0;   
	for (int i = 0; i<1000; i++) {
		n = i * 10; // 0 10 20 30 
		
		if (input > n && input <= (n + 10)) {
			System.out.println("입력한 수는" + n + "보다 작고"  + (n + 10) + "보다 큽니다.");
		}
	}
	
	

	}

}
