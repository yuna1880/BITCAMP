package variable;

public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//변수의 종류
		
		//숫자형
		// 정수
		byte by; // 자료형 / 변수  /  1byte == 8 bit -> 256 숫자 표현가능. 0000 0000 ->1byte 0->+  1->-
		by= -127; // 128일시, 그릇에 용량이 안되서 실행안됨.  / 127 ~ -128까지
		System.out.println("by:"+by);
		
		short sh; // 2 byte
		sh = 1234;
		System.out.println("sh = "+sh);
		
		int i;  // 4byte
		i = 12232131;
		System.out.println("i:"+i);
		
		long l; // 8byte
		l = 123423532222222222L; // 끝에 L붙여서 출력 가능하도록
		System.out.println("ㅣ:"+l);
		
		// 소수
		
		float f; // 4byte 오차값 때문에 많이 사용 안한다.
		f = 123.456789f; //뒤에 f로 명시해주어야 한다.
		System.out.println("f:"+f);
		
		double d; // 8byte
		d = 12345.567890;
		System.out.println("d:"+d);
		
		
		// 문자형
		// 문자
		
		char c; // 2byte == character 영문 1byte 한글 2byte 하지만 모두 한글자 출력가능.
				// a ~ z, @ # & * @ ) % A ~ Z, 
		
		c = 'A';
		System.out.println("c:"+c);
		c = '+'; // 기호도 넣을수 있다.
		System.out.println("c:"+c);
		c = '한';
		System.out.println("c:"+c);
		
		
		//문자열
		//문자 + 문자 -> 문자열        Array,String
		String str;
		str = "hello";
		System.out.println("str:"+str);
		
		str = "world";
		
		
		// 논리형 (true,false)
		boolean b;  // 1byte
		b = true; // 1
		b = false; // 0
		
		System.out.println("b:"+b);
		
		
		
		
		
		
		
		
	}

}
