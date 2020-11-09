
public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 2차원 선언 array2
		
		/*
		 * (1차원 배열)
		 * Array : 같은 자료형 변수들의 묶음.
		 * 			- index number로 관리된다.
		 * 			int arr[] = new int[배열의 총 갯수];
		 * 									ex) 5 일때, 0-5-1까지!
		 * 
		 * 			int arr[] = new int[3]; (이땐 값이 0,0,0)으로 설정.
		 * 			int arr[] = {1,2,3};
		 * 
		 * String member[] = {"권유나", "28" , "서울시"}; //string으로 일단 정의.
		 * int age = Integer.parseInt(member[1]); -> 필요한 데이터만 int로 변경.
		 * 
		 * 
		 * (2차원 배열) : 1차원 배열을 다수 관리를 할 수 있는 배열
		 * 
		 * int array2[][] = new int [3][4]; //전부 같은 방법.
		 * int []array2[] = new int [3][4];
		 * 							
		 *  //초기화 [3]-(큰묶음) [4]-(요소)
		 *  		
		 * int array2[3][4] = {
		 * 			{1,2,3,4}
		 * 			{5,6,7,8}
		 * 			{9,10,11,12}
		 * };
		 * 
		 */
		
		
		int array[][]  = new int[3][]; //2차원배열 준비 (큰 묶음만 숫자 줌.)
		int row1[] = {1,2,3}; //배열의 초기화
		int row2[] = {2,3,4,5};
		
		
		array[0] = row1; // 대입.(따로따로 대입 가능하다.) 123
		array[1] = row2; // 2345
		array[2] = row1; // 123
		
		
		
		
		for (int i = 0; i < array.length; i++) {      // 3
			for (int j = 0; j < array[i].length; j++) { // 
				System.out.print(array[i][j]+" ");
			}
				System.out.println();
		}
		
		
		
		// char **cArr 포인터, 배열 똑같다.
		// = char []cArr[]
		
		// cArr[1][1] = 
		
		
		char cArr [][] = {
				{'A','B','C'}, // cArr[0]번째 길이 값
				{'D','E','F'}, // cArr[1]번째 길이 값
				
		};
		
		
		
		
		// cArr[2][3]
		
		
		for (int i = 0; i < cArr.length; i++) { //2 (0-1)
			for (int j = 0; j < cArr[i].length; j++) { //3 (0-2)
				System.out.print(cArr[i][j]+"");
			}
			System.out.println();
		}
		
		System.out.println(cArr[1][1]); // E꺼내는 방법.
		


		
		
		int array2[][] = new int[3][2];
		
		array2[0][0] = 11;
		array2[0][1] = 12;
		array2[1][0] = 21;
		array2[1][1] = 22;
		array2[2][0] = 31;
		array2[2][1] = 32;
		
		
		
		
		// alias 엘리어스. 
		// -> 자바에서 쓸 수 있는 포인터.
		
		//int array[] = { 111,222,333 };
		//int alias[] = array;
		
		
		
		
		int array1[] = { 111,222,333 };
		int alias[] = array1; // 자기 자신이랑 똑같다. 
		// 			 {111,222,333}
		
		for (int i = 0; i < alias.length; i++) { //alias 는 3개.
			System.out.println(alias[i]); //alias[0] = 111, alias[1] = 222, alias[2] = 333
		}	
				
		alias[1] = 200;
										// array1[]
		System.out.println(array1[1]);	// alias[0] = 111 
										// alias[1] = 200
										// alias[2] = 333
		
		// foreach 문

		for( int n : array1) {
			System.out.println("n = " + n);
		}
		
		
		//****
		
		
		
		
	}

}
