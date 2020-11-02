package test;

public class mainClass { 

	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		System.out.println("test java"); // 콘솔에 출력해라. 라는 함수.
		
		
	
		// 절차지향, 객체지향 
		
		/*
		 *  범위주석문 -> 제외가 된다.
		 *  용도 - 1. 컴파일 되지 않도록 하는 코드.
		 *  	  2. 처리에 대한 기입. 
		 */
		
		/*
		 *  프로그램의 실행 순서.
		 *  
		 *  1.source code
		 *  2.compile (기계어로 번역해주는 부분)
		 *  	- link(외부 파일을 불러들인다.(읽기)) 
		 *  3.build (실행파일을 생성) -> *.exe
		 *  4.실행
		 *  	( console,app, web )
		 */
		
		System.out.println("hello java"); // println 줄바꿈 하는 함수.
		System.out.print("hello java");   // print 줄바꿈
		
		System.out.println();//그냥 줄바꿈 
		
		// a ab
		System.out.println("문자열");
		System.out.println('한');             //하나의 문자는 작은따옴표
		System.out.println('A');
		System.out.println(1);               // 이렇게 작성할 경우. 결국은 문자열로 바뀌어 출력됨.
		
		System.out.println(1+2);        //연산
		System.out.println("1"+2);         // 12라는 문자열이 나온다.
		
		System.out.println("1"+2+3);      //123이 나온다. (문자열임)
		System.out.println(2+3+"1");         // 51
		
		//     정수 <-123 출력하기 위해.
		System.out.printf("%d",123);       // %d는 정수의 약자 dec
		System.out.printf("%c",'a');         //charactor a
		System.out.printf("%s","hello");     //string
		
		System.out.printf("%f",123.456);        // 소수점 값. float
		
		System.out.println();
		
		// escape sequence 개행(\n),백스페이스(\b),띄어쓰기(\t)

		System.out.printf("%d\n",234);
		System.out.printf("%s\b\n","abc");
		System.out.printf("%s\t %d\t %c\n","hello",234,'a');
		System.out.printf("%s\t %d\t %c","world",12,'b');
		
		
	}

}
