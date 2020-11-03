package bit;

import java.util.Scanner;

public class mainClass2 {

	public static void main(String[] args) {
		
		
	Scanner scaner = new Scanner(System.in);
	
		
	int payment;
	int money;
	int changes;
	
	
	System.out.print("지불해야할 돈 =");
	payment = scaner.nextInt();
	
	System.out.print("자신의 돈 = ");
	money = scaner.nextInt();
	
	payment = 3230;
	money = 10000;
	
	changes = money - payment; // 6770원 % 5000 / 1770
	
	int m5000 = changes / 5000;
	int m1000 = (changes % 5000) / 1000;
	int m500 = (changes % 1000) / 500;
	int m100 = (changes % 500) / 100;
	
	
	
	
	}

}
