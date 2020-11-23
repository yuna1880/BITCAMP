package main;

import java.util.ArrayList;
import java.util.List;

public class ArrayStack {
	
	
	private int maxSize;
	
	private List<Object> list = new ArrayList<Object>();
	
	
	public ArrayStack() {
		
		maxSize = 10;
		
	}
	
	public boolean isEmpty() {
		
		return(list.size() == 0);
	}
	
	public boolean isFull() {
		
		return (list.size() > 10);
	}
	
	// insert
	
	public void push(Object obj) {
		if(isFull()) {
			
			return;
		}
		
		list.add(obj);
	}
	
	// 통에 공을 빼기 pop
	
	public Object pop() {
		
		Object obj = peek(); //제일 윗쪽 공.
		list.remove(obj); //뺀다.
		
		return obj;
		
	}
	
	// peek 제일 윗쪽 공의 값 구하기
	public Object peek() {
		if(isEmpty()) {
			return null;
		}
		
		return list.get(list.size()-1);
	}
	
	
}
