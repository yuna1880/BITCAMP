package work07;

public class mainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//선생님
		//3 - 암호화프로그램 
		
				/*
						
				다음은 알파벳과 숫자를 아래에 주어진 암호표로 암호화하는 프로그램이다.
				(1)에 알맞은 코드를 넣어서 완성하시오.

				a b c d e f g h i j k l m n o p q r s t u v w x y z
				` ~ ! @ # $ % ^ & * ( ) - _ + = | [ ] { } ; : , . /


				0 1 2 3 4 5 6 7 8 9
				q w e r t y u i o p
				
				
				*/
		
				
		
				// abcdefghijklmnopqrstuvwxyz
				
				char[] abcCode ={
						
						'`','~','!','@','#','$','%','^','&','*',
				'(',')','-','_','+','=','|','[',']','{',
				'}',';',':',',','.','/'
				
				
				}; 						// 알파벳도 아니고 숫자도 아님.

				// 0 1 2 3 4 5 6 7 8 9
				char[] numCode = {'q','w','e','r','t','y','u','i','o','p'};		
											//소문자
				
				
				// 두개 다 !!!
				
				
				// 암호화
				
				
				String originalCode = "abc012"; //오리지널 코드

				String resultCode = "";
				
				
				
				for (int i = 0; i < originalCode.length(); i++) {
					
				
				char c = originalCode.charAt(i); //-> for문 돌리자 (i) 한문자씩 변환, 비교
				int asc = (int)c; // a -> 97
				
				// 알파벳일때! 비교
				if(asc >= 97 && asc <= 122) { 
				// 97 - 122 -> 0 ~ 25 으로 바꿔놓자!! (편리성을 위해)abc코드랑 바꾸기위해
				
				asc = asc - 97; //(0-25로 바뀐다)
				resultCode =  resultCode + abcCode[asc]; // 번지수 찾아서 변환.
					// result에 축적해주기.
				}
				
				
				// 숫자일때 ! 비교
				if(asc >= 48 && asc <= 57) { // 0 -> 48
					// 48 - 57 -> 0 - 9  
					asc = asc - 48;
					resultCode = resultCode + numCode[asc];
				}		// result에 축적해주기.
				
				}
				
				
				
				System.out.println("originalCode:"+ originalCode);
				System.out.println("resultCode:"+ resultCode); //암호화된 코드
			
				// [실행결과]
				// src:abc123
				// result:`~!wer
				
				
				
				
				// 복호화 
				
				String baseCode = "";
				
				
				
				for (int i = 0; i < resultCode.length(); i++) {
					
					
				
				char c = resultCode.charAt(i);
				
				int _asc = (int)c;
				
				
				if (_asc >= 97 && _asc < 122) { // 암호화된 숫자.
					int index = 0;
					for (int j = 0; j < numCode.length; j++) { //숫자 , 번지수 비교
						if(c == numCode[j]) { //찾았을 때!
							index = j;
							break;
						}
					}
					// (다시 숫자로) 48 - 57까지로 바꿔줘야한다.
					
					index = index + 48;
					baseCode = baseCode + (char)index;
				
				}else {  // 암호화된 알파벳
					
					int index = 0;
					for (int j = 0; j < abcCode.length; j++) { // abc코드랑 비교,
						if(c == abcCode[j]) { // 찾았을때!
							index = j;
							break; 
						}
					}
					// 97 - 122
					index = index + 97;
					baseCode = baseCode + (char)index;
					
				}
				
				}
				
				System.out.println("baseCode:"+ baseCode);
				
				
				
				// [실행결과]
				// src:abc123
				// result:`~!wer
				
		
		
		
	}

}
