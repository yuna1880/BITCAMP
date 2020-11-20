package cls;

public class Rectagle extends Shape {

	int width;
	int height;
	
	public Rectagle() {
		this(0,0);
	}
	
	public Rectagle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	
	@Override
	public double calcArea() {
		
		return width * height;
	}
	
	
	public Boolean isSquare() { //정사각형일때 true
		
		if(width == height) {
			
			return true;
		}
		return false;
	}
	
	
	
}
