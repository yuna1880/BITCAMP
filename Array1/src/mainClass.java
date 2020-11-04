
public class mainClass {

	public static void main(String[] args) {
		
		/*
		 * Array : 배열
		 * 			변수의 확장 기능.
		 * 			정의 : 같은 자료형 변수의 묶음
		 * 			!!! 관리의 목적을 취한다.!!!
		 * 			
		 * 			int number;
		 * 			int CharPosNum;
		 * 
		 * 			!! 관리 요소 : index.number == 숫자
		 * 					   0 ~ (n - 1)개까지 (n은 배열의 개수)
		 * 
		 * 			int num1, num2, num3, num4, num5; 			
		 * 			int num[] = new int[5]; //배열의 개수
		 * 
		 * 			형식 : 자료형 배열변수명[] = new 자료형[배열의 총수];
		 * 				 int array[] = new int[10]; // new -> 나왔으면 동적할당을 하는 것.(개수 마음대로 지정 가능 - 동적)
		 * 								delete[] array 가비지 콜렉터
		 * 
		 * 			/stack/    heap           static        sys
		 * 			array[]    new int[10]
		 * 
		 * 			정적 (static) - 정해진 만큼
		 * 			동적 (dynamic) - 원하는 만큼
		 * 			
		 * 			array[ 번지 ]
		 * 			array[0] -> 인덱스 넘버
		 * 			array[1]
		 * 			array[2]
		 * 			  .
		 * 			  .
		 * 			array[9]
		 * 
		 * 			배열은 초기화가 가능하다.
		 * 			int array[] = {1,2,3};
		 * 
		 * 			int array[];
		 * 			array = {1,2,3}; (실행불가)
		 * 
		 * 			CRUD
		 * 			Create + read + update + delete
		 * 			배열생성       읽기        수정가능(값바꾸기가능)  지우기 가능.
		 * 
		 * 			
		 * 
		 * 
		 */
		
		
//		int []array = new int[3];
//		int[] array = new int[3]; 세가지 다 표현 가능.
		int array[] = new int[3]; // 0 - 2 까지
		
		array[0] = 11;
		array[1] = 22;
		array[2] = 33;
		
		array[2] = array[0] + array[1]; //연산도 가능.
		
		int array1[] = {111,222,333};
		
		
		int array2[];
		array2 = new int[5]; // 5 할당
		array2[0] = 1;
		System.out.println(array2[1]); //동적 할당시 자동으로 0으로 셋팅
		
		
		
		int num = -1;
		int array3[] = null; //배열은 null로 초기화한다.
		
		
		char charArr[] = {'A','B','C'};
		
		System.out.println(charArr.length);
		System.out.println(array2.length);
		System.out.println(charArr[1]);
		
		char charArr1[] = new char[5];
		charArr1[0] = 'h';
		charArr1[1] = 'e';
		charArr1[2] = 'l';
		charArr1[3] = 'l';
		charArr1[4] = 'o';
		
		System.out.println(charArr1);
		System.out.println(charArr1[0]);
		System.out.println((int)charArr1[0]);  //캐스팅 변환시 ASCII 코드값이 나온다.
		
	}

}
