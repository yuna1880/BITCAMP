package ifClass;

public class mainClass {

	public static void main(String[] args) {
		
		/*
		 * (제어문)
		 * - 조건 제어문
		 *   if 
		 *   else
		 *   if
		 *   else if
		 *   
		 *   < > <= >= == !=  부등호 기호와 같이 쓴다.
		 *   && || ! 논리연산자와도 같이 쓸 수 있다.
		 *   
		 *   switch문 (처리속도가 빠르다)
		 *   	case 와 함께 사용
		 *   		break
		 *   
		 *   형식 : if(조건식(논리)){ 조건식 = true / false
		 *         처리 
		 *   }
		 *   
		 *   if(number > 0){
		 *   
		 *   }
		 *   
		 *   if(number > 0 && number <=10 && number !=5){
		 *   
		 *   }
		 *   
		 *   if(조건식) {
		 *       처리1 
		 *   }
		 *   else {
		 *   	 처리2
		 *   }
		 *   
		 *   
		 *   if(조건식1){
		 *       처리1
		 *   }
		 *   
		 *   else if (조건식2){
		 *   
		 *    처리2 else if (조건식3){
		 *    
		 *    }
		 *    else {
		 *       처리4
		 *    }
		 *  
		 *  
		 *  
		 *   }
		 *   
		 *   
		 *   
		 *   
		 *   
		 * - 순환 if - else if - else if
		 * - 
		 * 
		 * 
		 * 
		 */

		
		int number = 6;
		if (number > 5) {
			
			System.out.println("number는 5보다 크다");
			
			
		}
		
		if(number >= 6) {
			
			System.out.println("number는 6보다 크거나 같다");
			
		}
		
		
		if(number == 6) {
			
			System.out.println("number는 6이다.");
		}
		
		
		if(number != 5) {
			
			System.out.println("number는 5가 아니다.");
		}
		
		if(number >= 0 && number > 10 ) {
			
			System.out.println("number는 0과 9 사이의 값이다.");
		}
		
		if(number > 5 || number > 10 ) {
			
			System.out.println("number는 5보다 크거나 작거나 또는 10보다 크다.");
		}
		
		if(number > 10 ) {
			
			System.out.println("number는 10보다 크다.");
		}
			else {
				
				System.out.println("number는 10보다 작거나 같다.");
			}
		
		
		number = 85;
		if(number == 100) {
			System.out.println("A++입니다"); 
			
		}
			
			else if (number >= 90 && number < 100) {
				
				System.out.println("A입니다.");
			}
			else if (number >= 80 && number < 90) {
				
				System.out.println("B입니다.");
			}
			
			else {
				System.out.println("80점 미만입니다.");
			}
			
		
		
			
			if(number == 100) System.out.println("A++입니다."); // 이렇게 쓸수도 있다.
		
			
			
			// 조건문 안의 조건문 (섞어서 사용이 가능하다.)
			
			number = 75;
			if (number > 95) {
				
				
			}
			
			else if (number > 80) {
				
				
			}
			else if (number > 70)	{
				
				if (number >= 75) {
					System.out.println("합격입니다.");
				}
				else {
					System.out.println("다시 한번 도전하십시오.");
					
				}
				
			}
				
			
			
			
			
			boolean b; // true / false
			
			b = false;
			
			if (b == false) {
				
				System.out.println("b는 false입니다.");
			}
			
			
			if (!b) {
				
				System.out.println("b는 !b입니다.");  // b가 false일때. 위에 보면 b가 false로 정의되어 있다. 그러므로 false
			}
			
			b = true;
			if (b) {
				
				System.out.println("b는 true입니다.");
			}
			
			// int i = 1; (int는 조건문 사용 불가능!!!!!!)
			
			//if(i) {
			//	
			//	
			// }
			
			
			
	}	
			
}


