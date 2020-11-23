package main;

import java.util.ArrayList;
import java.util.List;

public class QueueClass {


	private int maxSize;

	private List<Object> list = new ArrayList<Object>();
	
	public QueueClass(){
		
		maxSize = 10;
		
	}
	
	public boolean isEmpty() {
		return(list.size() == 0);
	}
	
	
	
	public boolean isFull() {
		return (list.size() > 10);
	}
	
	
	//추가
	
	public void push(Object obj) {
		
		if(isFull()) {
			System.out.println("공간이 꽉 찼습니다.");
			return;
		}
		
		list.add(obj);
	}
	
	
	// 삭제 (빼기) !!!!
	
	public Object pop() {
		
		Object obj = peek();
		
		
		list.remove(obj);
			
			return obj;
			
		}

	public Object peek() {
		
		if(isEmpty()) {
			System.out.println("데이터가 없습니다..");
			return null;
		}
		return list.get(list.size()-1);
	}
	
	
	
	
}
