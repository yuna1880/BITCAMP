package studentClass;

import java.util.Scanner;

public class mainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 
		  2차원배열
		  (성적관리 프로그램)
		 
		    내가 푼 것 + 선생님 설명
		 
		 */
		
		Scanner sc = new Scanner(System.in);
	
		
		
		String student[][] = null; //통 비워두기!
		
		int sum;
		double average;
		int max, min;
		
		
		sum = 0; 
		
		// 1. 몇명의 학생?
		
		System.out.print("학생 수를 입력하시오  = ");
		int count = sc.nextInt();
		
		// 배열확보 (동적할당)
		
		student = new String[count][4];
		
		//2. 입력 (이름, 국어점수, 수학점수, 영어점수) (총4개) 
		//-> 잘못입력시 check 
		
		int w = 0;
		
		while(w < student.length){
			
		System.out.println((w+1)+"번째 정보 입력 = ");	
		
		System.out.print("이름 입력 = ");
		String name = sc.next();
		// name = stdent[w][0]
		
		System.out.print("국어점수 입력 = ");
		String lang = sc.next();
			
		System.out.print("영어점수 입력 = ");
		String eng = sc.next();	
			
		System.out.print("수학점수 입력 = ");
		String math = sc.next();		
		
		if(name.trim().equals("")) { //이름이 비어있을때!
			System.out.println("error. 이름을 다시 입력해 주십시오.");
			continue;
		}
		
		//국어(숫자 or 문자) check.
		boolean nogood = false;
		
		for (int i = 0; i < lang.length(); i++) {
			int asc = (int)lang.charAt(i); // asc로 변환
			
			if(asc < 48 || asc > 57) { //문자일때. ->오류
				nogood = true;
				break;
			}
		}
		
		if(nogood = true) {
			System.out.println("error. 국어점수에 오류가 있습니다.");
			continue;
		}
		
		
		// 수학
		nogood = false; //재활용
		
		for (int i = 0; i < math.length(); i++) {
			int asc = (int)math.charAt(i); // asc로 변환
			
			if(asc < 48 || asc > 57) { //문자일때. ->오류
				nogood = true;
				break;
			}
		}
		
		if(nogood = true) {
			System.out.println("error. 수학점수에 오류가 있습니다.");
			continue;
		}
		
		
		//영어
		nogood = false; //재활용
		
		for (int i = 0; i < eng.length(); i++) {
			int asc = (int)eng.charAt(i); // asc로 변환
			
			if(asc < 48 || asc > 57) { //문자일때. ->오류
				nogood = true;
				break;
			}
		}
		
		if(nogood = true) {
			System.out.println("error. 영어점수에 오류가 있습니다.");
			continue;
		}
		
		
		// 배열에 넣어주기
		
		student[w][0] = name;
		student[w][1] = lang;
		student[w][2] = math;
		student[w][3] = eng;
		
		w++;
		
		}
	
		//3. 각 학생들의 총점들. /  출력
		
		// st_sum[] = 학생의 점수들이 있는 각 배열선언
		
		int st_sum[] = new int[student.length];
		
		for (int i = 0; i < student.length; i++) {
			int lang = Integer.parseInt(student[i][1]);
			int math = Integer.parseInt(student[i][2]);
			int eng = Integer.parseInt(student[i][3]);
			
			st_sum[i] = lang + math + eng;
		}
		
		
		//4. 총점 중 1등. (max)
		 
		max = 0;
		
		for (int i = 0; i < st_sum.length; i++) {
			if( max < st_sum[i]) {
				max = st_sum[i];
			}
		}
		
		System.out.println("총점의 1등 = "+ max);
		 
		 
		//5. 과목의 1등. 
		 
		int lang_num[] = new int[student.length]; /
		
		for (int i = 0; i < lang_num.length; i++) {
			lang_num[i] = Integer.parseInt(student[i][1]);
		}    // student클래스는 string 이므로, int로 변경 후 lang_num에 저장
	 
		 //국어의 1등?
		
		max = lang_num[0]; // 초기화..
		
		for (int j = 0; j < lang_num.length; j++) {
			if( max < lang_num[j]) {
				max = lang_num[j];
			}
		}
		
		System.out.println("국어의 최고점수 :" + max);
		
		//6. 과목의 꼴등.(최하점) // 수학으로 구하자.
		 
		int math_num[] = new int[student.length];
		
		for (int k = 0; k < math_num.length; k++) {
			math_num[k] = Integer.parseInt(student[k][2]);
		}
		
		min = math_num[0]; //초기화 해주기
		
		for (int j = 0; j < math_num.length; j++) {
			if( min > lang_num[j]) {
				min = lang_num[j];
			}
		}
		
		System.out.println("수학의 최저점수 :" + min);
		
		//7. 총점의 평균 (합계부터 구해야한다) 
		
		for (int i = 0; i < st_sum.length; i++) { 
			sum = sum + st_sum[i];
		}
		 	
		average = (double)sum / student.length;
		
		System.out.println("총점의 합계 : " + sum);
		System.out.println("총점의 평균 : " + average); 		
		 		
		//8. 이름 입력시, 그 학생의 성적 출력.
		
		System.out.print("이름  = ");
		String name = sc.next();
		
		int findIndex = -1; // 값이 없다는 뜻-> 못찾았다고 설정해놓기
		
		for (int i = 0; i < student.length; i++) {
			if(name.equals(student[i][0])) {
				findIndex = i;
				break;
			}
		}
		
		if(findIndex != -1) {
			
		System.out.println ("이름 = " + student[findIndex][0]);	
		System.out.println ("국어 = " + student[findIndex][0]);	
		System.out.println ("수학 = " + student[findIndex][0]);	
		System.out.println ("영어 = " + student[findIndex][0]);	
			
		}else
		
		
		
		
	}
}
