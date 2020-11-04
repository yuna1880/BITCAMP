package test2;

import java.util.Scanner;

public class test14 {

	public static void main(String[] args) {
		
	Scanner Scaner = new Scanner(System.in);	
		
	int input;
	System.out.print("input =" );
	input = Scaner.nextInt();
	
	if(input > 100 ) {
		System.out.println("입력한 수는 100보다 큽니다.");
	}
	
	else if (input > 80 && input < 90) {
		System.out.println("입력한 수는 90보다 작고 80보다 큽니다.");
	}
	
	else if (input > 70 && input < 80) {
		System.out.println("입력한 수는 80보다 작고 70보다 큽니다.");
	}
	
	else if (input > 60 && input < 70) {
		System.out.println("입력한 수는 70보다 작고 60보다 큽니다.");
	}
	
	else if (input > 50 && input < 60) {
		System.out.println("입력한 수는 60보다 작고 50보다 큽니다.");
	}
	
	else if (input > 40 && input < 50) {
		System.out.println("입력한 수는 50보다 작고 40보다 큽니다.");
	}
	
	else if (input > 30 && input < 40) {
		System.out.println("입력한 수는 40보다 작고 30보다 큽니다.");
	}
	
	else if (input > 20 && input < 30) {
		System.out.println("입력한 수는 30보다 작고 20보다 큽니다.");
	}
	
	else if (input > 10 && input < 0) {
		System.out.println("입력한 수는 10보다 작고 0보다 큽니다.");
	}
	else {
		System.out.println("입력한 값을 알 수 없습니다.");
	}
	
	
			

	}

}
