package main;

import Game.Game;
import dice.dice;

public class mainClass {

	public static void main(String[] args) {
		
		/*
		필요한 요소 (element)
		
		주사위 (dice) : 2개 
					(random 1-6) getter만 필요.
						
		Game loop 
		
		*/
		
		// 최대한 메인에 노출은 적게 !
		
		Game game = new Game();
		
		game.gameplay();
		

	}

}
