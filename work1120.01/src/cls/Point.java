package cls;

public class Point {
	
	int x, y;
	
	
	public Point() {
		
		this(0,0);
	
	}
	
	
	//생성자 2
	Point(int x, int y) { //->
		
		this.x = x;
		this.y = y;
	
	}

	
	public String toString() {
		
	return "Point = [x =" + x +", y = "+ y +"]";
	
	}
	
}
