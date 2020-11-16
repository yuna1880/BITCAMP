package Student;

public class Student {

	
	//선언
	
	private String name;
	private int ban;
	private int no;
	private int kor;
	private int eng;
	private int math;
	
	
	public int total;
	
	//초기화
	
	public Student() {
		
		
		
	}
	

	//getter setter 넣어주기.
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getBan() {
		return ban;
	}

	public void setBan(int ban) {
		this.ban = ban;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}


	public void setEng(int eng) {
		this.eng = eng;
	}


	public int getMath() {
		return math;
	}


	public void setMath(int math) {
		this.math = math;
	}

	public int getTotal() {
		return total;
	}


	public void setTotal(int total) {
		this.total = total;
	}

	public int getTotal(int k, int e, int m) {
		
		int total;
		
		total  =  k + e + m;
		
		return total;
	
	}
	

	
	/* 둘 다 가능.
	
	public int getTotal(){
	total = this.kor + this.math + this.eng;
		return total;
	}
	
    */
	
	
	public double getAverage() {
		
		
		double total = getTotal(kor, eng, math); 
		
		double avg;
		
		avg = (double)total / 3;
		
		
		return avg;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
