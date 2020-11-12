package overload;

public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*   (오버로드)
		  	 Over Load : 함수(메소드) 명은 같고
		  				  매개변수의 자료형이나 개수가 다른 것으로 분류하는 것을 의미.
		 
		 ex) image draw
		 	 RGB   -> 배경
		 	 RGBA  -> 캐릭터

		 	 imageDraw(int x, int y, int a)
		 	 imageDraw(int x, int y)
		 
		 */
	
		funcName();
		funcName(123);
		funcName('A');
		funcName('B',234);
		funcName(234, 'C');
		
		
	}//////////////////////////////
	
	// *** 함수 명은 같으나, 매개변수가 다른 것 ! ***
	
	
	static void funcName() {
		System.out.println("fancName() 호출");
		
	}
	
	
	static void funcName(int i) {
		System.out.println("fancName(int i) 호출");
	}
	
	static void funcName(char c) {
		System.out.println("fancName(char c) 호출");
		
	}
	
	// *** 함수 명은 같으나, 매개변수의 갯수 가 다른 것 ! ***
	
	static void funcName(char c, int i) {
		System.out.println("fancName(char c, int i) 호출");
	}
	
	static void funcName(int i, char c) {
		System.out.println("fancName(int i, char c) 호출");
	}
	
	
	// 안되는것 !?
	// *** 함수 명은 같으나, 매개변수의 가인수가 다른 것. ! ***
	
	/*
	static void funcName(char c11) {
	
		}
		*/
	
	// 함수명은 같으나 리턴값이 다른것.  구분 불가능 !
	/*
	static int funcNume() {
		return 1;
	}
	*/
	

}
