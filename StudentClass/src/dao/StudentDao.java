package dao;

import java.util.Arrays;
import java.util.Scanner;

import Student.Student;

// Data Access Object
public class StudentDao {
	
	Scanner sc = new Scanner(System.in);
	
	Student studentArr[] = null;  //배열. 멤버변수.
	
	private int memberNum;
	
	public StudentDao(int count){
		studentArr = new Student[count]; //외부에서 들어옴.
		memberNum = 0;
		
		//sorting용 추가
		studentArr[0] = new Student(1,"홍길동", 100, 90, 80);
		studentArr[1] = new Student(1,"일지매", 100, 85, 90);
		studentArr[2] = new Student(1,"성춘향", 100, 100, 95);
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
		
		
		
	studentArr[memberNum] = new Student(number, name, language, math, english);
		
	memberNum++;
	
	}
	
	//
	
	
	public void delete() {
		
		System.out.println("삭제할 학생 명 = ");
		String name =  sc.next();
		
		int index = -1;
		for (int i = 0; i < studentArr.length; i++) {
			
			if(studentArr[i] != null) { //입력 안했을때 
				
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
		}
		
	
	}
	
	public void select() { //찾아서, 출력해주기.
		
		
		
		
	}
	
	public void update() {
		
		
		
	}
	
	public void allprint() {
		
		for (int i = 0; i < studentArr.length; i++) {
			if(studentArr[i] != null && !studentArr[i].getName().equals("")) {
			//삭제된 데이터가 나오지 않도록.
			System.out.println(studentArr[i].toString());
			}
		}
		
	}
	
	public void sorting() { 
	
			
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
 		
	}
	
	
	
	


