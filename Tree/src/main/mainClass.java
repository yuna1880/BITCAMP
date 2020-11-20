package main;

public class mainClass {

	public static void main(String[] args) {
	
		
		Node node1 = new Node(new Integer(111));
		
		
		Node node2 = new Node(new Integer(222));
		
		node1.makeLeftSubTree(node2);
		
		
		Node node3 = new Node(new Integer(333));
		
		node1.getLeftSubTree().makeRightSubTree(node3);
		
		
		//연결해서 계속 나갈 수 있다!
		
	}

}
