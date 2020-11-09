package array2Toarray1;

public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2차원 배열 -> 1차원 배열 변환 2*3 ->6
		
		/* 
		 * 
		 *    [][][]
		 *    [][][]    -> [][][][][][]
		 * 
		 * 
		 */
		
		int array2[][] = {  //2차원배열 생성
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				
		};
		
		//1차원 변환
		
		int array1[] = new int[ array2.length * array2[0].length]; // 큰묶음이니 length = 3
		/*
		 * 							3				4 => int array1[12] 이다.

		 * array2[0][0]   array2[0].length == 4 * 0 + 0
		 * array2[0][1]	  array2[0].length == 4 * 0 + 1
		 * array2[0][2]	  array2[0].length == 4 * 0 + 2
		 * array2[0][3]	  array2[0].length == 4 * 0 + 3
		 * 
		 * array2[1][0]	  array2[0].length == 4 * 1 + 0
		 * array2[1][1]	  array2[0].length == 4 * 1 + 1
		 * array2[1][2]	  array2[0].length == 4 * 1 + 2
		 * array2[1][3]	  array2[0].length == 4 * 1 + 3
		 
		 */
		
		//!!!!!!!!!!!!
		
		for (int i = 0; i < array2.length; i++) { // 0 1 2 (3 개)
			for (int j = 0; j < array2[0].length; j++) { //0 1 2 3 (4개)
				array1[array2[0].length * i+j] = array2[i][j];
			}
		}
		
		for(int i = 0; i < array1.length; i++) {
			System.out.println("array1[" + i + "] = " + array1[i]);
			
		} //12개 나온 배열을 반복하면 array1[i] i=0-11까지 반복해서 출력
		
		
		
	}

}
