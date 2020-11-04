
public class mainClass {

	public static void main(String[] args) {
		
		/*
		 * 
		 *switch : 조건문으로 값이 명확해야 한다. 장점 - 코드가 깨끗하다.
		 *			큰 틀을 만들때 사용한다.
		 *
		 *가독성 :(可讀性) 이 더 좋다.
		 *
		 *
		 *switch (변수) {
		 *		case 값1:        if
		 *			처리
		 *			break;
		 *		case 값2:        else
		 *			처리
		 *			break;
		 *		default :        else
		 *			처리
		 *			break;
		 *
		 *> < >= <= != 부등호 사용할 수 없다.
		 *string 까지는 됩니다.
		 *소수(double) 는 사용 못함.
		 *
		 *
		 *}
		 * 
		 * 
		 */

		int num = 5;
		
		switch( num ) {
		
			case 1:     // if(num == 1)
				System.out.println("num은 1입니다.");
				break;
			case 2:       // else(num == 1)
				System.out.println("num은 2입니다.");
				break;
			case 3:
				System.out.println("num은 3입니다.");
				break;
				
				// break 를 잊었다면? - > 원하지 않는 처리까지 출력될 수도 있다.
				
				default:
					System.out.println("num은 ?입니다.");
					break;
		}
		
		char c = '가';
		switch (c) {   
		case '가':
			System.out.println("c는 가입니다.");
			break;

		default: 
			break;
		}
		
		
		String str = "hello";
		switch(str) {
			case "hello":
			System.out.println("str = hello");
			break;
		}
		
		
		
		}
		
		
		
	}


