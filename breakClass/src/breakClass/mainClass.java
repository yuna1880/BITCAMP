package breakClass;

public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		break: 탈출
		
		swit
		
		
		for (int i = 0; i < 10; i++){
			if(i == 5){
				break;
			}
		}
		
*/		//
		
		int n = 0;   
		for (int i = 0; i < 100; i++) {
			System.out.println("i = " + i);
			if(i == 12) {
				n = i;
				break;
			}
		}
		System.out.println("n = " + n);
		

		
		//
		
		char CharArr[] = {'A','B','C','D'};
		
		for (int i = 0; i < CharArr.length; i++) {
			System.out.println(i + ":" + CharArr[i]);
			if (CharArr[i] == 'C') {
				System.out.println("C 문자를 찾았습니다."); //c까지 출력되고 c를 찾았다고 출력된다. 그리고 끝.
				break;
			}
		}

		//
		
		System.out.println();
		
		for (int i = 0; i < 7; i++) {
			System.out.println("i = " + i);
			for (int j = 0; j < 4; j++) {
				System.out.println("j = " + j);
				if(i == 3 && j == 2) {
					break;
				}
			}
		}
		
		System.out.println();
		
		
		// 1. 탈출방법 
		
		boolean b = false;
		
		for (int i = 0; i < 7; i++) {
			System.out.println("i = " + i);
			for (int j = 0; j < 4; j++) {
				System.out.println("j = " + j);
				if(i == 3 && j == 2) {
					b = true;
					break;
				}
				if(b == true) {
					break;  //b가 true일때 탈출
				}
			}
			if(b == true) {
				break;  
			}
		}
		
		
		// 2. 탈출방법 
		
		System.out.println();
		
		
		loopout:for (int i = 0; i < 7; i++) {
			System.out.println("i = " + i);
			for (int j = 0; j < 4; j++) {
				System.out.println(" j = " + j);
				if(i == 1 && j == 2) {
					break loopout; //이 loop를 탈출하는 break (go to 문에 쓰인다.)
				}
			}
		}
		
		
		
		
		
		
	}

}
