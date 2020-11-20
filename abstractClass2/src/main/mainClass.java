package main;

import write.Ballpen;
import write.Pencil;
import write.Writer;

public class mainClass {

	public static void main(String[] args) {
		
		/*
		
		ballpen, pencil
		
		
		
		*/

		Writer w = new Ballpen(); //pencil로 지정!
		
		myClass cls = new myClass(w);
		
		cls.method();
		
	}

}
