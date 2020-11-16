package cls;

public class myClass {

	private int number;
	private String name;
	
	
	
	public myClass() { //생성자
		
		System.out.println("myClass myClass()");
		
	}
	
	public myClass(int number) {
		
		this();
		
		this.number =  number;
		//초기화 된다.
		System.out.println("myClass myClass(int number)" + number);
	}
	
	
	public myClass(int number, String name) {
		
		this(number); //기본 생성자 myClass() 호출.
		
		this.number = number;
		this.name = name;
		
		System.out.println("myClass myClass(int, string)" + number + name);
	}
	
	
	
	
	//setter getter
	

	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	
	
	
	
}
