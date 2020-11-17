package Student;

public class Student {

	
	private int number;
	private String name;
	private int language;
	private int math;
	private int english;
	
	
	public Student(){
		
		
	}


	// generate - > constructor using field
	public Student(int number, String name, int language, int math, int english) {
		super();
		this.number = number;
		this.name = name;
		this.language = language;
		this.math = math;
		this.english = english;
	}


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


	public int getLanguage() {
		return language;
	}


	public void setLanguage(int language) {
		this.language = language;
	}


	public int getMath() {
		return math;
	}


	public void setMath(int math) {
		this.math = math;
	}


	public int getEnglish() {
		return english;
	}


	public void setEnglish(int english) {
		this.english = english;
	}

	
	
// toString -> 확인용 (VO) (DTO) ->나중에
	
	@Override
	public String toString() {
		return "Student [number=" + number + ", name=" + name + ", language=" + language + ", math=" + math
				+ ", english=" + english + "]";
	}
	
	
	
	
	
	
}
