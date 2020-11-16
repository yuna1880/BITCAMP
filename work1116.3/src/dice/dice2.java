package dice; 

public class dice2 {
	
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
	
	private int number;
	
		
	public void diceRand() {
		
		number  = (int)(Math.random()*6) + 1; // 0-6까지 나온다.
	}

	public int getNumber() { //getter만 필요!
		return number;
	}
	
	
	
	
	
	
	

}
