package main;

public class Node {

	private Node left;
	private Node right;
	private Object data;
	
	
	
	public Node(Object data){
		left = null;
		right = null;
		this.data = data;
	}
	
	
	
	
	//왼쪽 자식 node와 연결해주는 메소드
	public void makeLeftSubTree(Node sub) {
		this.left = sub;
	}
	
	//오른쪽 자식 node와 연결해주는 메소드
	public void makeRightSubTree(Node sub) {
		this.right = sub;
	}

	
	// getter 3개 right, left
	
	public Object getData() {
		return data;
	}
	
	
	public Node getLeftSubTree() {
		
		return this.left;
		
	}
	
	public Node getRightSubTree() {
			
		return this.right;
			
		}
	
	
	
	
	
}
