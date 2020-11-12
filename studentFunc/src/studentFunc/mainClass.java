package studentFunc; // 나 +선생님 해설

import java.util.Arrays;

import java.util.Scanner;

public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		/*
		성적관리 프로그램
		*/	
	
		String student[][] = null; //통 비워두기.
		
		//1. 몇명의 학생의 통계?
		
		int count = studentCountInput();
		
		
		//2. 입력(입력체크)
		
		student = studentInput(count);
		
		for (int i = 0; i < student.length; i++) {
			System.out.println(Arrays.toString(student[i]));
		}
		
		// 3. 각 학생들의 총점

		
		studentAllNum(student);

		
		// 4. 총점의 1등
		studentAllNumOn(student);
		
		// 5. 과목의 1등
		
		studentTitlOne(student);
		
		// 6. 과목의 최하점
		
		
		// 7. 총점의 평균
		
		sumOfAvg(student);
		
		// 8. 이름 입력시, 그 학생의 성적 출력
		
		
		
	}////////////////////////////////

	/*
	 * TODO 
	 * 함수명 : studentCountInput
	 * 매개변수 : 없음.
	 * return값 : int
	 * 내용: 학생수를 입력받는다.
	 * 
	 */
	
	
	static int studentCountInput() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("학생의 수 입력 = ");
		
		int count = sc.nextInt();
		
		return count;
		
	}
	
	//2. 입력(입력체크)
	
	static String[][] studentInput(int count) {
		
		if(count > 0) {
		
		} // 입력 수가 0이 넘을때 !
		
		Scanner sc = new Scanner(System.in);
		
		String student[][] = new String[count][4];
										//학생수 //가로
		int w = 0;
		while(w < student.length) { //학생수만큼 반복
			
			System.out.println((w+1)+"번째 정보 입력 = ");	
			
			System.out.print("이름 입력 = ");
			String name = sc.next();
			// name = stdent[w][0]
			
			if(name.trim().equals("")) { //이름이 비어있을때!
				System.out.println("error. 이름을 다시 입력해 주십시오.");
				continue;
			}
			
			
			System.out.print("국어점수 입력 = ");
			String lang = sc.next();
			
			if(isNumber(lang) == false) {
				System.out.println("error. 국어점수에 오류가 있습니다.");
				continue;
			}
			
			System.out.print("영어점수 입력 = ");
			String eng = sc.next();	
			
			if(isNumber(eng) == false) {
				System.out.println("error. 영어점수에 오류가 있습니다.");
				continue;
			}
				
			System.out.print("수학점수 입력 = ");
			String math = sc.next();
			
			if(isNumber(math) == false) {
				System.out.println("error. 수학점수에 오류가 있습니다.");
				continue;
			}
			
			/*
			 * 
			String title[] = { "국어", "수학", "영어" };
			String language[] = new String[3];
			boolean b = true;
			int index = 0;
			for (int i = 0; i < language.length; i++) {
				System.out.print(title[i] + " = ");
				language[i] = sc.next();		
				b = isNumber(language[i]);
				if(b == false) {
					index = i;
					break;
				}
			}
			if(b == false) {
				System.out.println(title[index] + " 점수의 오류가 있습니다");
				continue;
			}	
			*/
			
			
			student[w][0] = name;
			student[w][1] = lang;
			student[w][2] = math;
			student[w][3] = eng;
			
			w++;
	}
		return student;

}
	// 3. 각 학생들의 총점
	static void studentAllNum(String student[][]) {
		
		if(student == null || student.length == 0) {
			
			System.out.println("학생데이터 오류");
			return; //continue의 대신!
		}
		
		/*
		int st_sum[] = new int[student.length];
		
		for (int i = 0; i < student.length; i++) {
			int lang = Integer.parseInt(student[i][1]);
			int math = Integer.parseInt(student[i][2]);
			int eng = Integer.parseInt(student[i][3]);
			
			st_sum[i] = lang + math + eng;
		}
		*/
		
		int st_sum[] =  strArrToIntegerArr(student);
		
		
		for (int i = 0; i < st_sum.length; i++) {
		
			System.out.print(student[i][0] + "의 총점.");
			System.out.println(st_sum[i]);
		}
		
		
	}
	
	//4. 총점 중 1등. (max)
	
	static void studentAllNumOn(String student[][]) {
		
		/*
		int st_sum[] = new int[student.length];
		
		for (int i = 0; i < student.length; i++) {
			int lang = Integer.parseInt(student[i][1]);
			int eng = Integer.parseInt(student[i][2]);
			int math = Integer.parseInt(student[i][3]);
			
			st_sum[i] = lang + math + eng;
		}
		*/
		
		int st_sum[] = strArrToIntegerArr(student);
	
	
		int max = st_sum[0];
		
		for (int i = 0; i < st_sum.length; i++) {
			if( max < st_sum[i]) {
				max = st_sum[i];
			}
			
			System.out.println("총점의 1등 = "+ max);
		}
		
	}
	
	
	static int[] strArrToIntegerArr(String student[][]) { //문자->인티저로
		int st_sum[] = new int[student.length];
		
		for (int i = 0; i < student.length; i++) {
			int lang = Integer.parseInt(student[i][1]);
			int eng = Integer.parseInt(student[i][2]);
			int math = Integer.parseInt(student[i][3]);
			
			st_sum[i] = lang + math + eng;
		
		}
		return st_sum;
	}
	
	
	
	
	
	//숫자 or 문자?
		static boolean isNumber(String str) {
			
			boolean b = true;
			
			for (int i = 0; i < str.length(); i++) {
				int asc = (int) str.charAt(i); // asc로 변환
				
				if(asc < 48 || asc > 57) { //문자일때(숫자가 아닐때) ->오류
					b = false;
					break;
				}
			}
			return b;
		}
		
	
	
	
	
	//5. 과목의 1등. 
	
	static void studentTitlOne(String student[][]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("과목을 입력 : 국어(1) 영어(2) 수학(3) = ");
		int title = sc.nextInt();
		
		int titleNum[][] = new int[student.length][3];
		for (int i = 0; i < titleNum.length; i++) {
			for (int j = 0; j < titleNum[i].length; j++) {
				titleNum[i][j] = Integer.parseInt(student[i][j+1]);
			} 		    //학생 : 0 1 2   과목: 1 , 2 ,3
		}
		
		/*
		for (int i = 0; i < titleNum.length; i++) {
			System.out.println(Arrays.toString(titleNum[i]));
		}*/
		
		int number[] = new int[student.length];
		
		for (int i = 0; i < number.length; i++) {
			 number[i] = titleNum[i][title - 1]; // 1,2,3 -> 0,1,2
			 
		}
		
		//최대값 구하기.
		int max = number[0];
		for (int i = 0; i < number.length; i++) {
			if(max < number[i]) {
				max = number[i];
			}
		}
		
		String titleName = "";
		if(title == 1) titleName = "국어";
		else if (title == 2) titleName = "영어";
		else if (title == 3) titleName = "수학";
		
		System.out.print(titleName + "의 최고점수는" +  max + "입니다." );
		
	}
	
	//7. 총점의 평균 (합계부터 구해야한다)???
	
	static void sumOfAvg(String student[][]) {
		
		
		int sum[] = strArrToIntegerArr(student);
		int allSum = 0;
		
		for (int i = 0; i < sum.length; i++) {
			allSum = allSum + sum[i];
		}
		
		double avg = allSum / sum.length;
		
		System.out.println("총점의 평균은 = "+ avg+ "점 입니다.");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
