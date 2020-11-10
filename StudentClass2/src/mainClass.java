import java.util.Arrays;
import java.util.Scanner;

public class mainClass {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*
			성적관리 프로그램
		*/	
				
		String student[][] = null;
		/*		= {
				{"홍길동", "90", "100", "85"}	,
				{"홍길동", "90", "100", "85"}	,
				{"홍길동", "90", "100", "85"}	
		};*/
		int sum;
		double avg;
		int max, min;
		
		// init
		sum = 0;
		
		//	1. 몇명의 학생의 통계?
		System.out.print("학생의 수를 입력 = ");
		int count = sc.nextInt();
		
		student = new String[count][4];
			
		//	2. 입력(입력첵크)				CRUD
		//		이름, 국어, 수학, 영어		Create, Read, Update, Delete
		/*
		for (int i = 0; i < student.length; i++) {
					
		}*/
		
		int w = 0;
		while(w < student.length) {
			
			System.out.println((w + 1) + "번째 학생의 정보>>");
			
			System.out.print("이름 = ");
			String name = sc.next();
			
			System.out.print("국어 = ");
			String lang = sc.next();
			
			System.out.print("수학 = ");
			String math = sc.next();
			
			System.out.print("영어 = ");
			String eng = sc.next();	
			
			if(name.trim().equals("")) {
				System.out.println("이름을 입력해 주십시오");
				continue;
			}
			
			// 국어 첵크(숫자or문자)
			boolean nogood = false;
			for (int i = 0; i < lang.length(); i++) {
				int asc = (int)lang.charAt(i);
				if(asc < 48 || asc > 57) {
					nogood = true;
					break;
				}
			}
			if(nogood == true) {
				System.out.println("국어 점수의 오류가 있습니다");
				continue;
			}
			
			// 수학
			nogood = false;
			for (int i = 0; i < math.length(); i++) {
				int asc = (int)math.charAt(i);
				if(asc < 48 || asc > 57) {
					nogood = true;
					break;
				}
			}
			if(nogood == true) {
				System.out.println("수학 점수의 오류가 있습니다");
				continue;
			}
			
			nogood = false;
			for (int i = 0; i < eng.length(); i++) {
				int asc = (int)eng.charAt(i);
				if(asc < 48 || asc > 57) {
					nogood = true;
					break;
				}
			}
			if(nogood == true) {
				System.out.println("영어 점수의 오류가 있습니다");
				continue;
			}
			
			// 정상적으로 입력한 경우
			student[w][0] = name;
			student[w][1] = lang;
			student[w][2] = math;
			student[w][3] = eng;			
			
			w++;
		}		
		
		for (int i = 0; i < student.length; i++) {
			System.out.println(Arrays.toString(student[i]));
		}
					
		//	3. 각 학생들의 총점
		// System.out.println(Integer.parseInt(student[i][1]) + Integer.parseInt(student[i][2] + Integer.parseInt(student[i][3])));
		
		int st_sum[] = new int[student.length]; 
		for (int i = 0; i < student.length; i++) {
			int lang = Integer.parseInt(student[i][1]);
			int math = Integer.parseInt(student[i][2]);
			int eng = Integer.parseInt(student[i][3]);
			st_sum[i] = lang + math + eng;
		}
		
		for (int i = 0; i < st_sum.length; i++) {
			System.out.print(student[i][0] + "의 총점:");
			System.out.println(st_sum[i]);
		}
					
		//	4. 총점의 1등
		max = st_sum[0];
		for (int i = 0; i < st_sum.length; i++) {
			if(max < st_sum[i]) {
				max = st_sum[i];
			}
		}	
		System.out.println("총점의 최고점:" + max);
					
		//	5. 과목의 1등
		int lang_num[] = new int[student.length];
		for (int i = 0; i < lang_num.length; i++) {
			lang_num[i] = Integer.parseInt( student[i][1] );
		}
		
		max = lang_num[0];
		for (int i = 0; i < lang_num.length; i++) {
			if(max < lang_num[i]) {
				max = lang_num[i];
			}
		}
		System.out.println("국어의 최고 점수:" + max);
					
		//	6. 과목의 최하점	
		int math_num[] = new int[student.length];
		for (int i = 0; i < math_num.length; i++) {
			math_num[i] = Integer.parseInt( student[i][2] );			
		}
		min = math_num[0];
		for (int i = 0; i < math_num.length; i++) {
			if(min > math_num[i]) {
				min = math_num[i];
			}
		}
		System.out.println("수학의 최저점수:" + min);
		
		//	7. 총점의 평균
		for (int i = 0; i < st_sum.length; i++) {
			sum = sum + st_sum[i];
		}
		avg = (double)sum / student.length;
		System.out.println("총점의 합계:" + sum);
		System.out.println("총점의 평균:" + avg);
			
		//	8. 이름을 입력하면, 그 학생의 성적 출력
		System.out.print("이름 = ");
		String name = sc.next();
		int findIndex = -1;
		for (int i = 0; i < student.length; i++) {
			if(name.equals(student[i][0])) {	// 찾았다
				findIndex = i;
				break;
			}				
		}
		
		if(findIndex != -1) {
			// System.out.println( Arrays.toString(student[findIndex]) );
			System.out.println("이름:" + student[findIndex][0]);
			System.out.println("국어:" + student[findIndex][1]);
			System.out.println("수학:" + student[findIndex][2]);
			System.out.println("영어:" + student[findIndex][3]);			
		}else {
			System.out.println("학생명단에 없습니다");
		}
		 
		 
	}
}



