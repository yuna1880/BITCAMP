package main;

public class StackClass {
	
	
	private int top; // (실린더)그림 통에서 제일 상위에 있는 공. 
	private int maxSize; // 최대 들어갈 수 있는 사이즈
	
	private Object stackArray[]; // 통. 오브젝트로 담는 이유 =  모든 것을 담을 수 있어서

	
	public StackClass(int maxSize) {
		
		this.maxSize = maxSize; // 10이면 10개 담을 수 있다.
		this.top = -1; //일단 공이 없도록 셋팅!
		
		stackArray = new Object[maxSize]; //통 지정. //5
		
	}
	
	//통이 비어있느냐??
	public boolean isEmpty() {
		
		return (top == -1); //비어있다!
		
	}
	// 통이 가득 차 있는지?
	public boolean isFull() {
		
		return(top == maxSize -1); //배열 5에서 4번지일때 full
	}
	
	//통에 공을 추가!
	public void push(Object obj) {
		if(isFull()) {
			System.out.println("통이 가득 차 있습니다.");
			return;
		}
		
		top++;
		stackArray[top] = obj;
		//값이 새로 들어올때마다, 그 값이 top이 된다.
	}
	
	
	//통에 공을 뺀다.
	public Object pop() {
		
		Object obj = peek(); //제일 윗쪽 공을 뺀다.
		
		if(top <= -1) {//공이 비었을때.
			System.out.println("통이 비어있습니다.");
			return null;
		}
		
		top--; // top의 공을 하나씩 뺀다.
		
		return obj; // peek의 stackArray[top] 을 하나씩 빼주면서, top은 --;되어 줄어든다.
		
	}
	
	
	// 제일 윗쪽의 공의 값을 구할 수 있다.
	public Object peek() {
		
		if(isEmpty()) {
			System.out.println("통이 비어있습니다.");
			return null;
		}
		
		return stackArray[top];
	}
	
}
