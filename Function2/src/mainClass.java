
public class mainClass {

	public static void main(String[] args) {
		
		//Function2
		// 가변인수 (인수의 개수가 바뀔 수 있다.)
		 
		
		allocParam(12,23,45);
		
		allocParam(12,22,3,1,3,199); // 인수 들어가는 개수가 아무렇게나 가능.
		
		
		allocFunc("world",2,5,6,8,7,43,2);
	}

	static void allocParam(int...num) { 			// printf("%d",,,)
		
		int sum = 0;
		
		for (int i = 0; i < num.length; i++) {
			sum = sum + num[i];
		}
		
		System.out.println("sum = "+sum);
		
	}
	
	// 일반인수와 사용시 가변인수는 반드시 뒤에 위치하도록 한다.!!
	// 어디까지 가변인수인지 모르기 때문에!
	
	static void allocFunc(String str, int...num) {
		System.out.println("str = "+ str);
		for (int i = 0; i < num.length; i++) {
			System.out.println("num[i] = "+ num[i]);
		}
	}
	
	
	
	
}
