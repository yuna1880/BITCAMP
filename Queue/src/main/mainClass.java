package main;

public class mainClass {

	public static void main(String[] args) {
		
		// F I F O
		//First In First Out
		
		
		QueueClass queue = new QueueClass(5);
		
		
		String str = "one";
		queue.push(str);
		
		String front = (String)queue.peek(); // objec로 들어갔으니 string으로 바꿔줘야한다.
		System.out.println("front = "+ front);
		
		
		str = "two"; //two 를 넣어줘도 첫번쨰는 one이다.
		queue.push(str);
		
		front = (String)queue.peek(); 
		System.out.println("front = "+ front);
		
		
		
		str = "three";
		queue.push(str);
		
		front = (String)queue.peek(); 
		System.out.println("front = "+ front);
		
		
		
		
		queue.pop(); // 제일 앞에 있는 공을 빼낸다.
		
		front = (String)queue.pop(); 
		System.out.println("front = "+ front);
		
		
		
	}

}
