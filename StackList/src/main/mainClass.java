package main;

public class mainClass {

	public static void main(String[] args) {
		
		ArrayStack as = new ArrayStack();
		
		
		String str = "AAAAA";
		as.push(str);
		
		String peekStr = (String) as.peek();
		System.out.println("top object : " + peekStr);
		
		str = "BBBBB"; //추가.
		as.push(str);
		
		
		
		peekStr = (String)as.peek();
		System.out.println("top object : " + peekStr);
		
		String delStr = (String)as.pop();
		
		String peekStr1 = (String) as.peek();
		System.out.println("top object : " + peekStr1);
		
		

	}

}
