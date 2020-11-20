package cls;

public abstract class Shape {
	
	
	Point p;
	
	
	public Shape() {
	
		this(new Point(0,0)); //객체 호출->
	}
	
	
	public Shape(Point p) {
	
		this.p = p;
	}

	
	public abstract double calcArea(); // 도형의 면적을 계산해서 반환하는 메서드
	
	//세터, 게터
	Point getP() { //객체 받아서 객체로 셋팅.
		
		return p;
		
		}
	
	void setP(Point p) {
		
		this.p = p;
		
	}
		
}
