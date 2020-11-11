package funcWork;

import java.util.Arrays;

public class mainClass {

	public static void main(String[] args) {
		
		//array2toarray1
		
		
		// 2차원 배열 -> 1차원 배열
		int array2[][] = {   // 2차원 배열 생성.
				{ 1, 2, 3, 4 },
				{ 5, 6, 7, 8 },
				{ 9, 10, 11, 12 },
		};
						
		int array1[] = null; //1차원배열 바꿔준 뒤 담는 통. 일단 비워두기!
		array1 = array2ToArray1(array2);
				
		System.out.println(Arrays.toString(array1));
		
		
		
			
		// 암호화
		String originalCode = "abc012";
		//String originalCode = "hello201109";
		
		String resultCode = encoding(originalCode);
				
		System.out.println("originalCode:" + originalCode);
		System.out.println("resultCode:" + resultCode);
				
		
		
		// 복호화
		String baseCode = deciphering(resultCode);
				
		System.out.println("baseCode:" + baseCode);
		
		
	
		
		
		
		
	} //////////////////////////////////////////////////////////////////////////////
	
	
	

	
	
	// 암호화
	static String encoding(String originalCode) {
		
		// file에서 읽어 온다
		
		// 암호화 
		
		char abcCode[] = {	 // a ~ z
				'`', '~', '!', '@', '#',	
				'$', '%', '^', '&', '*',
				'(', ')', '-', '_', '+', 
				'=', '|', '[', ']', '{', 
				'}', ';', ':', ',', '.', '/'
		};
		
		char numCode[] = {	// 0 ~ 9
				'q', 'w', 'e', 'r', 't', 
				'y', 'u', 'i', 'o', 'p' 
		};		
		//
		
		
		String resultCode = "";
		
		
		for (int i = 0; i < originalCode.length(); i++) {
			char c = originalCode.charAt( i ); //들어온 코드 하나하나 변환 
			int asc = (int)c; //asc변환.
			
			// 알파벳일때! 
			if(asc >= 97 && asc <= 122) {	
				// 97 ~ 122 ->	0 ~ 25 // 받은 코드를 abc 코드로 변환해줘야하기 때문에..0-25로 바궈준다,
				asc = asc - 97;
				resultCode = resultCode + abcCode[asc];	// 하나하나씩 값 산출된것 합해주기! = resultcode가 된다.									
			}		
			// 숫자
			if(asc >= 48 && asc <= 57) {	
				// 48 ~ 57 -> 0 ~ 9
				asc = asc - 48;
				resultCode = resultCode + numCode[asc];
			}		
		}
		
		return resultCode;
	}
	
	//
	
	
	// 복호화
	
	static String deciphering(String resultCode) {
		
		//
		char abcCode[] = {	 // a ~ z
				'`', '~', '!', '@', '#',	
				'$', '%', '^', '&', '*',
				'(', ')', '-', '_', '+', 
				'=', '|', '[', ']', '{', 
				'}', ';', ':', ',', '.', '/'
		};
		
		char numCode[] = {	// 0 ~ 9
				'q', 'w', 'e', 'r', 't', 
				'y', 'u', 'i', 'o', 'p' 
		};	
		//
		
		
		String baseCode = ""; //baseCode 초기화.
		
		
		for (int i = 0; i < resultCode.length(); i++) {
			char c = resultCode.charAt( i );
			int asc = (int)c;
	
			if(asc >= 97 && asc < 122) {	// 알파벳으로 되어있을때.
				int index = 0;
				for(int j = 0;j < numCode.length; j++) {
					if(c == numCode[j]) { // numCode랑 대조했을때 맞는게 있을 경우!
						index = j; // numCode[j]
						break;
					}
				}
				// 48 ~ 57 // 다시 숫자로 바꿔줘야한다. +48
				index = index + 48;
				baseCode = baseCode + (char)index;			
				
			} else {							// 특수문자일때.
				int index = 0;
				for(int j = 0;j < abcCode.length; j++) {
					if(c == abcCode[j]) {	// 찾았다
						index = j;
						break;
					}
				}
				// 97 ~ 122
				index = index + 97;
				baseCode = baseCode + (char)index;			
			}		
		}
		return baseCode;
	}
	
	//

	
	
	
	
	// 2차원배열 -> 1차원 배열
	
	static int[] array2ToArray1(int arr[][]) {
		
		if(arr == null || arr.length == 0) return null;
		// 에러를 막기위해 .(null이 나올 경우 대비)
		
		int array[] = new int[arr.length * arr[0].length];// 통 만들어주기.
		//들어오는 arr의 개수 -> array[]
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				array[arr[0].length * i + j] = arr[i][j];
			}
		}
		
		return array;
	}
	
	
	//
	
	
	
	
	
	
	
	
	
	
}







