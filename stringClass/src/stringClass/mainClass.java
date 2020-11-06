package stringClass;

public class mainClass {

	public static void main(String[] args) {
		
		/*
		 * String : wrapper class
		 * 			문자열 저장, 편집 , 정보취득
		 * 
		 */
		
		//String str = ""; // 둘 다 동일한 코드, new string으로 안해도 쓸 수 있다.
		
		
		String str = new String(); //선언
		
		
		
		// string : 클래스 명
		// str : Object(객체) == class의 변수
		
		//str = "안녕하세요"; 
		
		
		str = new String("반갑습니다.");
		System.out.println("str:" + str);
		
		char strChar[] = {'안','녕'};  
		System.out.println(strChar);
		
		
		String str1 = new String("하이");
		String str2 = "바이";
		
		
		// 문자열의 결합
		
		String str3;
		
		
		str3 = str1 + str2;
		str3 = str1.concat(str2);  //두개의 결과는 동일.
		
		System.out.println("str3:" + str3);
		
		
		// 비교함수
		
		
		String str4 = "hello";
		String str5 = "hell";
		
		str5 = str5 + "o";  //2번방법에 작동. 1번방법으로는 다른 문자열이라고 뜬다.
	
		//1번 방법
		/*
		if(str4 == str5){    
			System.out.println("같은 문자열 입니다.");
		} else {
			System.out.println("다른 문자열 입니다.");
		}
		*/
		
		//2번 방법.
		
		boolean b = str4.equals(str5); //문자열 비교 함수 equals
		if(b == true) {
			
		} else {
			System.out.println("다른 문자열 입니다.");
		}
		
		
		// 지정문자의 위치 찾을 수  있는 함수.
		
		char CarArr[] = {'a','b','c'};
		
		String str6 = "abcdabcdabcd"; // 0 부터 번수 시작.
		int n;
		
		n = str6.indexOf("c");
		
		System.out.println("n = "+ n);
		
		n = str6.lastIndexOf("c"); // last는 제일 끝부터 세면서 찾는다.
		
		System.out.println("n = "+ n);
		
		// 문자열의 길이? length()
		
		System.out.println(str6.length()); // 문자열의 길이 구하는 함수!!!
		
		str6 = "I can do it";
		
		System.out.println(str6.length()); // 빈 문자 (null) 까지 세준다.
		
		
		
		
		///replace (수정) (문자열을 바꿀 수 있다.)
		
		String str7 = "A*B**C"; //*가 필요없는 문자일때?
		
		String str8 = str7.replace("B**", "B*"); 
		System.out.println("str8 =" + str8);
		
		
		// Split !!!!!!!!!!!! 
		
		/*
		 * 
		 * split : token 을 활용해서 문자열을 자른다.
		 * 
		 * hello-world-java		'-' token
		 * 
		 * 
		 */
		
		
		String str9 = "홍길동-24-2001/12/21-180.1";
		String splitArr[] = str9.split("-"); // - 를 경계로 해서 자르라는 말.
		for (int i = 0; i < splitArr.length; i++) {
			System.out.println(splitArr[i]);
		}		
		
		
		
		
		// 범위를 통해서 문자열을 취득.
		
		String str10 = "abcdefg";
	//	String substr = str10.substring(2, 5); //2번째부터 5번째 전까지 취득.
		
		String substr = str10.substring(4);
		System.out.println("substr = "+ substr);
		
		
		
		// 모든 문자열을 대문자, 소문자로 변경
		
		// Abcd -> ABCD
		// Abcd -> abcd
		
		String str11 = "abcDEF";
		
		String upstr = str11.toUpperCase(); // 전부 대문자로 바뀐다.
		System.out.println(upstr);
		String lowstr = str11.toLowerCase();
		System.out.println(lowstr);
		
		
		//앞뒤의 공백을 제거해주는 함수
		
		String str12 = "        java c언어  python       ";
		
		String trimstr = str12.trim();
		System.out.println("trimstr:" + trimstr);
		
		
		// 숫자 - > 문자열 (많이 안쓰인다.)
		
		
		// valueOf
		
		int num = 123;
		long lo = 1234L;
		double d = 123.4567;
		
		
		String s1 = num + ""; //차라리 이 방법을 써라!
		String s2 = String.valueOf(num);
		
		
		// 탐색 : 지정 문자열을 포함하는지?
		
		String str13 = "서울시 강남구";
		boolean b1 = str13.contains("서울"); //띄어쓰기 같은 공백이 있으면 못찾는다..
		System.out.println("b1:"+b1);
		
		// String을 배열처럼 쓰는 법?
		
		
		
		String str14 = "가나다라마"; // char c[] = {'가','나','다','라','마'}
		
		char c = str14.charAt(2); 
		System.out.println("c = "+ c);
	
		
	}

}
