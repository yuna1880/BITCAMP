package dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import Student.Student;

// Data Access Object
public class StudentDao {
	
	Scanner sc = new Scanner(System.in);
	
	//Student studentArr[] = null;  //배열. 멤버변수.
	private List<Student> list = null;
	
	//private int memberNum;
	
	public StudentDao(){
		//studentArr = new Student[count]; //외부에서 들어옴.
		list = new ArrayList<Student>();
		
		//memberNum = 0;
		/*
		//sorting용 추가
		studentArr[0] = new Student(1,"홍길동", 100, 90, 80);
		studentArr[1] = new Student(1,"일지매", 100, 85, 90);
		studentArr[2] = new Student(1,"성춘향", 100, 100, 95);
		*/
		
		list.add(new Student(1,"홍길동", 100, 90, 80));
		list.add(new Student(2,"일지매", 100, 85, 90));
		list.add(new Student(3,"성춘향", 100, 100, 95));
	}
	
	// CRUD
	// 추가, 삭제, 검색, 수정
	
	public void insert() { //create (학생정보 추가)
		System.out.print("number = ");
		int number = sc.nextInt();
		
		System.out.print("name = ");
		String name = sc.next();
		
		System.out.print("국어 = ");
		int language = sc.nextInt();
		
		System.out.print("수학 = ");
		int math = sc.nextInt();
		
		System.out.print("영어 = ");
		int english = sc.nextInt();
		
	//studentArr[memberNum] = new Student(number, name, language, math, english);
		
		Student student =  new Student(number, name, language, math, english);
		list.add(student);
		
	//memberNum++;
	
	}
	
	
	// 삭제
	public void delete() {
		
		System.out.println("삭제할 학생 명 = ");
		String name =  sc.next();
		
		/*
		int index = -1;
		for (int i = 0; i < studentArr.length; i++) {
			
			if(studentArr[i] != null) { //비어있지 않을때.
				
				if(name.equals(studentArr[i].getName())) {
					index = i; //이름을 찾았을때는, index값을 준다.
					break;
					
				}
			}
		
		}
		
		if(index != -1) {//찾았을때
			
			studentArr[index].setNumber(0);
			studentArr[index].setName("");
			studentArr[index].setLanguage(0);
			studentArr[index].setMath(0);
			studentArr[index].setEnglish(0);
			
			System.out.println("학생데이터를 성공적으로 삭제하였습니다.");
			
		}else {
			System.out.println("학생데이터를 찾을 수 없습니다.");
		} */
		
		
		int index = -1;
		
		for (int i = 0; i < list.size(); i++) { //이름과 동일한 데이터 찾기.
			Student s = list.get(i);
			if(name.equals(s.getName())) {
				index = i;
				break;
			}
		}
		
		if(index != -1) {
			
			list.remove(index);
			
		}else {
			
			System.out.println("학생데이터를 찾을 수 없습니다.");
			
		}
		
	}
	
	//search
	
	public void select() { //찾아서, 출력해주기.
		
		System.out.println("검색할 학생 명 = ");
		String name =  sc.next();
		
		List<Student> flist = new ArrayList<Student>();
		for (int i = 0; i < list.size(); i++) {
			Student s = list.get(i);
			
			if(name.equals(s.getName())) {
				flist.add(s); //이름 맞는 데이터 찾아서 f list에 더해준다.
			}
		}
		
		if(!flist.isEmpty()) { // flist에 정보가 있다면! ->
			System.out.println("검색된 데이터는 >> ");
			
			for (int i = 0; i < flist.size(); i++) {
				System.out.println(flist.get(i).toString()); //출력.
			}
			
		}else {
			
			System.out.println("학생데이터를 찾을 수 없습니다.");
		}
		
		
	}
	
	public void update() {
		
		System.out.print("수정할 학생명 = ");
		String name = sc.next();
		
		int index = -1;
		
		for (int i = 0; i < list.size(); i++) {
			Student s = list.get(i);
			
			if(name.equals(s.getName())) {
				index = i;
				break;
			}
			
		}
		
		if(index == -1) {
			System.out.println("학생데이터를 찾을 수 없습니다");
			return;
		}
		
		System.out.println("수정할 데이터를 입력해 주십시오 >> ");
		System.out.print("국어 점수 = ");
		int lang = sc.nextInt();
		
		System.out.print("수학 점수 = ");
		int math = sc.nextInt();
		
		System.out.print("영어 점수 = ");
		int eng = sc.nextInt();
		
		Student s = list.get(index); // 해당하는 index의 학생정보 가져오기
		s.setLanguage(lang); // 입력한 정보로 업데이트 해주기.
		s.setMath(math);
		s.setEnglish(eng);
		
		System.out.println("수정되었습니다.");
		
	}
	
	public void allprint() {
		/*
		for (int i = 0; i < studentArr.length; i++) {
			if(studentArr[i] != null && !studentArr[i].getName().equals("")) {
			//삭제된 데이터가 나오지 않도록.
			System.out.println(studentArr[i].toString());
			}
		}
		
		*/
		
		for (int i = 0; i < list.size(); i++) { //전부 get해서 출력해주기.
			Student s = list.get(i);
			System.out.println(s.toString());
		}
		
		
	}
	
	public void sorting() { 
	
		
		LinkedList<Student> sortlist = new LinkedList<Student>();
		
		
		
		for (Student s : list) {
			
			sortlist.add(s);
			
		}
		
		
		Student stu = null;
		
		for (int i = 0; i < sortlist.size() -1 ; i++) {
			for (int j = i+1; j < sortlist.size(); j++) {
				
				int num1 = sortlist.get(i).getEnglish();
				int num2 = sortlist.get(j).getEnglish();
				
				if(num1 < num2) {
					
					stu = sortlist.get(i); // stu에 i저장
					sortlist.set(i, sortlist.get(j)); // i에 j저장
					sortlist.set(j, stu); // j에 stu저장 swap이용.!
				}
				
			}
			
		}
		
		System.out.println("정렬된 영어점수 : 내림차순 >>");
		
		for (int i = 0; i < sortlist.size(); i++) {
			Student s = sortlist.get(i);
			System.out.println(s.toString());
		}
			
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
 		
	}
	
	
	
	


