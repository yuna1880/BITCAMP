package wrapperClass;

public class mainClass {

	public static void main(String[] args) {
		
		
		/*
		
		class -  묶음
		wrapper class
		일반 자료형을 클래스화 한것.
		Integer int n, parseInt() 포함!
		
		
		클래스 : 묶음 (저장요소, 함수)
		
		일반 자료형 					wrapper class
		boolean 				Boolean
		
		byte					Byte
		short					Short
		int						Integer (o)
		long					Long
		
		float					Float
		double 					Double (o)
		
		char					Character
		char[]					String (o)

		class (변수, 함수) 포함!!
		
		
		*/

		// 숫자 -> 문자열
		
		String str = 123 + ""; // 
		
		
		
		// 문자열 -> 숫자
		int number = Integer.parseInt("123") + 1;  // 123이라는 문자열을 123으로 바꾼다음에, +1을 한 결과
		System.out.println(number);
		
		
		double dnumber = Double.parseDouble("123.4567");
		System.out.println(dnumber);
		
		
		
		// 숫자 -> 문자열 toString(), valueOf()   
		
		Integer in = new Integer(23); // int n = 23;
		
		String tostr = in.toString();
	//	String tostr = in + "";
	//	String tostr = String.copyValueOf(in);
		
		System.out.println("tostr = " + tostr);
		
		
		
		
		
		
		
		
		
		
		
	}

}
