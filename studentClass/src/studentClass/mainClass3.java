package studentClass;

import java.util.Arrays;
import java.util.Scanner;

public class mainClass3 {

	public static void main(String[] args) {
		

		/*
		 
		  2차원배열
		  (성적관리 프로그램)
		 
		    선생님 버전 푼 것 + 설명
		 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		
		String student[][] = null; // 통 비워놓기!
		
		
		
		
		
		
		/* ex)
		 * 
		 * String student[?][4] = { //4가 정해져있어도 비워놔도 괜찮다.
		 * 
		 * ("홍길동", "90", "100","85") row (한명의 데이터에 대한것)
		 * ("홍길동", "90", "100","85")
		 * ("홍길동", "90", "100","85")
		 * 
		 * }
		 */
		
		int sum;
		double average; // (연산처리 해야해서 초기화 안해도 된다) 
		int max ,min; //최상, 최하 값 // 초기화가 필요없다.(값이 들어갈 거라서)
		
		
		sum = 0;
		
		// 1. 몇명의 학생? 
		
		
		System.out.print("학생 수를 입력  = ");
		int count = sc.nextInt();
		
		// 배열 확보 (동적할당)
		
		student =  new String[count][4];
		
		//2. 입력 (이름, 국어점수, 수학점수, 영어점수) (총4개) //-> 잘못입력시 check  
		//CRUD  -> creat / read / update / delete
		 		
		
		
			
			int w = 0;
			
			while(w < student.length) {
				
				System.out.println((w+1)+"번째 정보 입력 = ");
				
				System.out.print("이름 입력 = "); //비어있지만 않으면 넘어가게 로 설정
				String name = sc.next();
				student[w][0] = name;
			// String name 으로 바꾸기 가능.
				
				
				System.out.print("국어점수 입력 = ");
				student[w][1] = sc.next();
			// String lang 으로 바꾸기 가능.
				
				System.out.print("영어점수 입력 = ");
				student[w][2] = sc.next();
				
				
				System.out.print("수학점수 입력 = ");
				student[w][3] = sc.next();
				
				
				if(student[w][0].trim().equals("")) {//이름이 비어있을때
					System.out.println("error. 이름을 다시 입력해 주십시오.");
					continue;
				}
				
				//국어 (숫자 or 문자?) check
				boolean nogood = false;
				//국어점수의 길이값 이용       // 대신 lang 넣기.
				for (int i = 0; i < student[w][1].length(); i++) { 
					int asc = (int)student[w][1].charAt(i);
					
					if(asc < 48 || asc > 57) {
						nogood = true;
						break;
					}
				
				}
				if(nogood == true) {
					System.out.println("error. 국어점수에 오류가 있습니다.");
					continue;
				}
				
				//수학
				nogood = false;
				//수학점수의 길이값 이용       // 대신 math 넣기.
				for (int i = 0; i < student[w][2].length(); i++) { 
					int asc = (int)student[w][2].charAt(i);
					
					if(asc < 48 || asc > 57) { //숫자가 아닐때
						nogood = true;
						break;
					}
				
				}
				if(nogood == true) {
					System.out.println("error. 수학점수에 오류가 있습니다.");
					continue;	
				}
				
				//영어 
				nogood = false;
				//영어점수의 길이값 이용       // 대신 eng 넣기.
				for (int i = 0; i < student[w][3].length(); i++) { 
					int asc = (int)student[w][3].charAt(i);
					
					if(asc < 48 || asc > 57) {
						nogood = true;
						break;
					}
				
				}
				if(nogood == true) {
					System.out.println("error. 영어점수에 오류가 있습니다.");
					continue;
				}
				
				//정상적으로 입력한 경우
				
				/*
				student[w][0] = name;
				student[w][1] = lang;
				student[w][2] = math;
				student[w][3] = eng;
				*/
			
				w++;
			}
			
			for(int i = 0; i <student.length; i++) {
			System.out.println(Arrays.toString(student[w][0]));
			}
		
			
			
			//3. 각 학생들의 총점들.
			 // 학생수에 맞게!
			int st_sum[] = new int[student.length];
			for (int i = 0; i < student.length; i++) {
				int lang = Integer.parseInt(student[i][1]);
				int math = Integer.parseInt(student[i][2]);
				int eng = Integer.parseInt(student[i][3]);
				
				st_sum[i] = lang + math + eng; 		
				 
			}
			
			
			for(int i = 0; i <st_sum.length; i++) {
				System.out.print(student[i][0]+"의 총점:");
				System.out.println(st_sum[i]);
			}
			
		 
		//4. 총점 중 1등. (max)
		
		max = 0;
		
		for (int i = 0; i < st_sum.length; i++) {
			if(max < st_sum[i]) {
				max = st_sum[i];
			}
		}
			
		System.out.println("총점의 1등 = "+ max);
		 
		 
		//5. 과목의 1등.
		 
		int lang_num[] = new int[student.length];
		
		for (int i = 0; i < lang_num.length; i++) {
			lang_num[i] = Integer.parseInt(student[i][1]);
		}		
		
		max = lang_num[0]; //국어의  최고점수
		for (int i = 0; i < lang_num.length; i++) {
			if(max < lang_num[i]) {
				max = lang_num[i];
			}
		}
	 
		
		System.out.println("국어의 최고점수 :" + max);
		
		
		 		
		//6. 과목의 꼴등.(최하점)//수학으로 하자
		
		int math_num[] = new int[student.length];
		
		for (int i = 0; i < math_num.length; i++) {
			math_num[i] = Integer.parseInt(student[i][2]);
		}
		
		min = math_num[0]; 
		for (int j = 0; j < math_num.length; j++) {
			if(min > math_num[j]) {
				min = math_num[j];
			}
		}
		
		System.out.println("수학의 최저점수 :" + min);
		 		
		//7. 총점의 평균
		 		
		//총점의 합계
		for (int i = 0; i < st_sum.length; i++) {
			sum = sum + st_sum[i];
		}
		
		average = (double)sum / student.length;
		
		System.out.println("총점의 합계 :" + sum);
		System.out.println("총점의 평균 :" + average);
		 		
		//8. 이름 입력시, 그 학생의 성적 출력.
		
		
		System.out.print("이름  = ");
		String name = sc.next();
		
		int findIndex = -1; // 값이 없으니 -> 못찾았다 설정해놓은 것이다.
		for (int i = 0; i < student.length; i++) {
			if(name.equals(student[i][0])) { //이름 - 배열 대조 (검색중) // 찾았을때!!
				findIndex = i;
				break;
			}
		}
		
		if(findIndex != -1) { //찾았다
			
			// System.out.println(Arrays.toString(student[findIndex]));
			System.out.println ("이름 = " + student[findIndex][0]);
			System.out.println ("국어 = " + student[findIndex][1]);
			System.out.println ("수학 = " + student[findIndex][2]);
			System.out.println ("영어 = " + student[findIndex][3]);
			
		} else {
			System.out.println("찾을 수 없는 이름입니다. 명단에 없습니다.");
		}
			
	
	}

}
