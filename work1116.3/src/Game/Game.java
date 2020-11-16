package Game;

import java.util.Scanner;

import dice.dice2;

public class Game {
	
	Scanner sc = new Scanner(System.in);
	
	/*
	
	두개의 주사위 합을 맞히는 게임 제작 
	코인: 20개
	합을 맞추면 제시한 숫자에 따라서 배당금이 달라집니다.
	
	2, 12 : 제시할 수없음
	3, 11 : 18 배
	4, 10 : 12 배
	5, 9 : 9 배
	6, 8 : 7 배
	7 : 6 배
	
	
	*/
	
	private int coin; //총 자산
	
	private int batting; //배팅금액
	
	private int inputNum; // 주사위의 합 저장.
	
	dice2 dice11 = new dice2(); // 주사위 1
	dice2 dice22 = new dice2(); //주사위 2
	
	
	public Game() {
	
		coin = 20; //초기화 -> 생성자에서!
		
	}
	
	
	public void init() {
		
		dice11.diceRand(); // 주사위 1 랜덤값.
		dice22.diceRand(); // 주사위 2 랜덤값.
		
		System.out.println("주사위1 = " + dice11.getNumber());
		System.out.println("주사위2 = " + dice22.getNumber());
	}
	
	public void userInput() { 
		
		
		
		while(true) {
			
			System.out.print(" batting money = ");
			batting = sc.nextInt(); //배팅금액 입력받기
			
			System.out.print(" 주사위의 합 = ");
			inputNum = sc.nextInt();
			
			if(inputNum != 2 && inputNum != 12) { //2,12가 아니면 ok
				
				coin = coin - batting;
				
				break;
			}
			
			System.out.println("주사위 수를 잘못 입력했습니다."); // 2, 12입력시 다시 while로
		}
		
	}
	
	
	public void finding() {
		
		int dnum1 = dice11.getNumber();
		int dnum2 = dice22.getNumber();
		
		
		int diceSum = dnum1 + dnum2;
		
		if(inputNum == diceSum) {
			
			if(diceSum == 3 || diceSum == 11) {
			
				batting = batting * 18;
			}
			
			else if(diceSum == 4 || diceSum == 10) {
				batting = batting * 12;
			}
			
			else if(diceSum == 5 || diceSum == 9) {
				batting = batting * 9;
			}
			
			else if(diceSum == 6 || diceSum == 8) {
				batting = batting * 7;
			}
			
			else if(diceSum == 7) {
				batting = batting * 6;
			}
			
			
			System.out.println("축하합니다.");
			coin = coin + batting; //나중에 넣어도 ok
			
			
		} else {
			
			System.out.println("아쉽습니다. 다시 도전하세요.");
		}
		
		
		
		
	}
	
	//출력
	public void result() {
		
		System.out.println("주사위 1 = " + dice11.getNumber() + "주사위2 = " + dice22.getNumber());
		
		System.out.println("주사위 수 합계  = " + (dice11.getNumber() + dice22.getNumber()));
		
		System.out.println(" 현재 금액  = " + coin);
	}
	
	
	public void gameplay() { 
		
		while(true) {
			
		init();
		userInput();
		finding();
		result();
		
		System.out.println("다시 도전? (y/n) = ");
		String yes = sc.next();
		
		if(yes.equals("n") || yes.equals("N")) {
			System.out.println("안녕히 가십시오");
			break;
		}
		System.out.println("행운을 빕니다!");
		}
		
		
	}
	
	
	

}
