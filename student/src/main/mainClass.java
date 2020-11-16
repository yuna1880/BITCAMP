package main; //나

import student.student;

public class mainClass {

	public static void main(String[] args) {
		

		student stu = new student();
		
		stu.setNumber(1);
		stu.setName("홍길동");
		stu.setLanguage(95);
		stu.setNumber(100);
		stu.setNumber(85);
		
		String name = stu.getName();
		System.out.println("name:" + name);
		
		String student[][] = {
				
				{"aaa", "90", "80", "85"}
		};
		
		
		student students[] = new student[3];
		// =  student student1,student2,student3
		
		students[0] = new student();
		students[1] = new student();
		students[2] = new student();
		
		
		students[0].setName("aaa");
		students[0].setNumber(1);
		students[0].setLanguage(90);
		students[0].setMath(100);
		students[0].setEnglish(95);
		
		
	}

}
