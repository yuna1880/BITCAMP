package main;

public class QueueClass {

	private int front;
	private int rear;
	private int maxSize;
	private Object queueArray[];
	
	
	public QueueClass(int maxSize){
		
		this.maxSize = maxSize;
		
		queueArray = new Object[maxSize];
		
		front = 0;
		rear = -1; //?
		
	}
	
	public boolean isEmpty() {
		return(front == rear +1);
	}
	
	
	
	public boolean isFull() {
		return (rear == maxSize -1);
	}
	
	
	//추가
	
	public void push(Object obj) {
		
		if(isFull()) {
			System.out.println("공간이 꽉 찼습니다.");
			return;
		}
		rear++;
		queueArray[rear] = obj;
	}
	
	
	// 삭제 (빼기) !!!!
	
	public Object pop() {
		
		Object obj = peek();
		
		
		if(front > (maxSize -1)) { //!!!!
			
			return null;
			
		}
	
		
		front++; //프론트의 배열 숫자는 빼줄때마다. 증가.
		return obj;
		
	}
	
	public Object peek() {
		
		if(isEmpty()) {
			System.out.println("데이터가 없습니다..");
			return null;
		}
		return queueArray[front];
	}
	
	
	
	
}
