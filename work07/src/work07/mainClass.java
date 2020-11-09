package work07;

public class mainClass {

	public static void main(String[] args) {
		
		
		// 1번 과제 / 배열의 합계
		
		
		int arr[] = {10, 20, 30, 40, 50};
		int sum = 0;

		//(1) 알맞은 코드를 넣어 완성하시오.
		
		/*
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i] ;
		}
		*/
		
		// foreach 문
		
		for (int value : arr) {
			sum = sum + value;
		}
		

		System.out.println("sum = " + sum);
						
					
		//[실행결과]
		//sum=150
				
		
				//(2) 2차원 배열 arr2에 담긴 모든 값의 총합과 평균을 구하는 프로그램을 완성하시오.    
				// 선생님이 푼 것 보기
	
				int[][] arr2 = {

						{ 5, 5, 5, 5, 5},
						{10,10,10,10,10},
						{20,20,20,20,20},
						{30,30,30,30,30}

						};
						
				
						int total = 0;
						float average = 0;		
						
					
						int arr1[] = new int[ arr2.length * arr2[0].length ];  //20
						
						//(1) 알맞은 코드를 넣어 완성하시오.

						
						for (int i = 0; i < arr2.length; i++) {
							for (int j = 0; j < arr2[i].length; j++) {
								
								arr1[ arr2[0].length * i+j ] =  arr2[i][j];
								total = total + arr1[ arr2[0].length * i+j ];
								// total = total + arr[i][j]; 써도 괜찮다. (선생님풀이 참고)
							}
						}
						
						
						//??
						average = (float) total / (arr2.length * arr2[0].length);
						
						
						System.out.println("total=" + total);
						System.out.println("average=" + average);

					
						//[실행결과]
						//total=325
						//average=16.25
						
		
		
		
		

	}

}
