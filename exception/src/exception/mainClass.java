package exception; //exception 1

public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 
		 Exception : 예외        != error
		 //예외가 나올 수 있는 부분에 'try, catch' or finally 붙여준다.
		 
		 
		 
		 char c = 65;   -> 'A'
		 		array index number[3] -> numebr[0 - 2] number [3]
		 		
		 class	Scanner 못찾는 경우
		 
		 file	위치에 없는 경우.
		 
		 형식:
		 try{
		 	
		 	예외1가 나올 수 있는 소스
		 	예외2가 나올 수 있는 소스
		 	
		 	}catch(예외1 클래스 e){
		 	
		 		특정 예외 메시지
		 	
		 	}catch(예외2 클래스 e){
		 	
		 		특정 예외 메세지
		 	
		 	}finally{
		 	
		 	 //생략가능
		 	 
		 	 // 무조건 실행 
		 	  
		 	 // 뒤처리 파일 -> undo  
		 	  
		 	  
		 	}
		 	
		 	void func() throws 예외1 클래스 {
		 		
		 		
		 	}
		 
		 */
		
		// 소스코드 설정했을때 !
		
		
		 
		int array[] = { 1, 2, 3 };
		
		
		try {
		
		System.out.println("프로그램 시작");
		
		for (int i = 0; i < 4; i++) {
			
			System.out.println(array[i]);
			
			}
		
			System.out.println("프로그램 실행중"); //  중간 코드는 건너뛴다.(exception 다음은 실행 x)
			
			
		} catch(ArrayIndexOutOfBoundsException e) { //인덱스 배열 범위 벗어났다.
			e.printStackTrace(); // 어떤 익셉션이 나오는지
			System.out.println("배열에서 예외 발생!!");
			
			//System.out.println("-----"+ e.getMessage());  // 진행은 되지만, 예외 발생 메세지를 보내준다.
			//return;
			
		}catch (NumberFormatException e) { 
			
		}finally{
			//무조건 실행된다. (아무리 위에 return, break가 있어도..)
			System.out.println("finally 안입니다.");
		}
		
		System.out.println("프로그램 끝");  
		
	


		
		// func1();
			
		
		
		
	}////////////////////////
	
	
	
		// Func
		/*
		static void func1() throws ArrayIndexOutOfBoundsException {
			
			int array[] = {1,2,3};
			
			
			for (int i = 0; i < 4; i++) {
				System.out.println(array[i]);
		
			}
		}

		*/
		
		
		
		
		
		
		
}
