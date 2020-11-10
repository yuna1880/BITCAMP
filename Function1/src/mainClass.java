
public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		/*
		
			Fuction : 함수, 독립적인 process. 
			
			method : 함수, class에 소속되어 있는 함수.
					 복잡한 처리를 간결히 정리 할 수 있다.
					 중복된 처리를 정리하고 호출 할 수 있다.
		
			형식 : 
				return값(자료형) 함수명 (인수, 인자, parameter, 가상인수, 매개변수)
				{
				
					처리
					
					return 값; <- 없을 수도 있다. /  없는 경우도 있다.
				
				}
		
					return 값 : char, int, double, String...void
					
					//돌아오는 값//    // 들어가는 값 // parameter
					int funcName(char c, double d){
					
						처리 (logic)
						
						return 정수;
					}
					
					int r;
					r = funcName('A',123.4567);
					
		
		*/
		
	
		func1(); //들어가는값 없다.
		
		
		func2("hello"); //이게 s에 대입된다.
		
		
		double d = func3();
		System.out.println("d = " + d);
		
		
		int r = func4(12.34); // 값 -> 123으로 나온다.
		System.out.println("r = " + r);
		
		
		//ASCII code 
		
		int asc = func5('A');
		System.out.println("asc = " + asc);
		
		
		//
		
		int array[] = {2,4,6};
		func6(array); //여기서 변환된 값이 저장되어
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("array[" + i + "]" + array[i]);
		}	// 여기서 출력된다.
		
		
		//
		
		
		int n;
		int arr1[] = new int[1];
		
		n = 1; // 값만 넘어간다. 
		arr1[0] = 1;
		
		      // 값만 넘어간다 , 자기자신이 넘어간다.
		func7(n, arr1);
		
		System.out.println("n = " + n); // 함수 호출 후 출력
		System.out.println("arr1[0] = " + arr1[0]);
		
		
		//
		
		//배열 리턴 1
		
		
		int r_array[];
		
		r_array = func8(2);
		for (int i : r_array) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		
		
		/*
		int re_array[] = new int[10]; //배열 10개 준비.
		func9(2, re_array);
		
		
		*/
		
		
	
		
	}
		
	
	////////////////////////
	
	
		// 그림 1
		static void func1() {
			System.out.println("func1 호출");
		}
		
		
		// 그림 2
		static void func2(String s) {
			int i;
			System.out.println("func2 호출 s = "+ s); //s = 매개변수
		}
		
		// 그림3
		
		static double func3() {
			System.out.println("func3 호출 = ");
			return 1.23; //들어오는 없지만 돌아가는 값은 있다. 
		}
	
		
		// 그림 4 
		
		static int func4(double d) {
			System.out.println("func1 호출");
			d = d*10;
			return (int)d;
		}
		
		// 아스키 코드값 넘어가도록 하는 함수.
		static int func5(char c) {
			
			return (int)c;
		}
		
		
		
		static int func6(int arr[]) {
			for (int i = 0; i < arr.length; i++) {
			//	System.out.println("arr[" + i + "]" + arr[i]); // -> 출력
				arr[i] = arr[i] / 2;
				System.out.println("arr[" + i + "]" + arr[i]); // 나누기 값 출력
			}
			return 1;
		}
		
		
		//
		
						 //들어가는 값  //  나오는 값
		static void func7(int n , int arr[]) {
			
			n = n * 2;
			arr[0] = arr[0] * 2;
			
			System.out.println("n = " + n);
			System.out.println("arr[0] = " + arr[0]); // 여기서 arr[0] -> 2가된다. / 2로 넘어감.
			
		}
		
		
		///
		

		static int[] func8(int n) {   // n = 2 ->구구단 2단
			
			int r_arr[] = new int[10];
			for (int i = 1; i <= r_arr.length; i++) {
				r_arr[i-1] = n * i;
			}
			return r_arr;
		}
		
		
		
		//
		
		/*
		
		static void func9(int n, int r_arr) {
		for (int i = 1; i <= r_arr.length; i++) {
			r_arr[i-1] = n * i;
			
		}
		
		*/

}
