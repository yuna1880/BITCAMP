package main;

public class mainClass {

	public static void main(String[] args) {
		
		
		/*
		
		Stack : First In Last Out (처음 들어간게 나중에 나온다)
		
		
		*/
		
		
		StackClass stack = new StackClass(5); // 통 사이즈는 5
		
		
		
		String str = "one";
		stack.push(str); //str넣어주기!
		
		//제일 윗쪽 공 꺼내주기.
		String peekStr = (String)stack.peek();
		System.out.println("top object = " + peekStr); 
		
		// two를 넣어주기.
		str = "two";
		stack.push(str);
		peekStr = (String)stack.peek();
		System.out.println("top object : " + peekStr);
		
		
		//제일 윗 쪽 공을(peek)으로! 빼기. 
		String popStr = (String)stack.pop();
		System.out.println("삭제된 객체  = " + popStr);
		
		// 윗쪽 공을 빼서, top은 one으로 바뀐다.
		peekStr = (String)stack.peek();
		System.out.println("top object : " + peekStr);
		
		
		Integer i = 111;
		stack.push(i);
		
		Integer t = (Integer)stack.peek();
		System.out.println("top object = " + t);
		
		
		
		
		
		
		
	}

}
