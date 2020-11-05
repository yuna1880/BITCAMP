import java.util.Scanner;

public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * continue : skip(생략)
		 * 				다음처리를 생략시킨다.
		 * 				for, while 랑 같이 사용해야한다.
		 * 
		 * loop { -> for while
		 *     처리1 
		 *	      처리2
		 *		
		 *
		 *		if continue;    (처리 1,2 -> 다시 돌아가서 처리 1,2)
		 *	      처리3
		 * }
		 * 
		 */
		
		
		for (int i = 0; i < 5; i++) {
			System.out.println("i = " + i);
			System.out.println("for start");
			
			if(i == 3) continue; //i가 3일때는 end가 실행되지 않고 다시 위로 올라간다.
			
			
			System.out.println("for end");
		}
		
		//
		
		
		int datas[] = { 90, 85 ,-12 ,70 };
		int sum = 0;
		
		for (int i = 0; i < datas.length; i++) {
			if(datas[i] < 0) continue;
			
			sum = sum + datas[i];
		}
			System.out.println("sum = "+ sum );
		
		
		//입력 받아야 하는 경우? (for 문의 경우)
			
		Scanner sc = new Scanner(System.in);	
			
			/*
		int numArr[] = new int[5];
		int num;
		
		for (int i = 0; i < numArr.length; i++) {
			System.out.println((i + 1) + "번째 수 =");
			num = sc.nextInt();
			if(num < 0) {
				System.out.println("음수 입니다. " ); // 음수일때 skip. 0으로 표시된다.
				continue;
			}
			numArr[i] = num;
		}
			for (int i = 0; i < numArr.length; i++) {
				System.out.println("numArr[" + i + "] = " + numArr[i] );
			}
			
			*/
			
			//! //입력 받아야 하는 경우? (while 문의 경우) -> 제대로된 숫자가 입력될때까지 계속반복!!!
			
			int arrNum[] = new int[5];
			int number;
			int w = 0;
			
			while(w < 5) {
				System.out.print(( w + 1 ) + "번째 수 = "  );
				number = sc.nextInt(); // 1번째수 = 입력칸 생성 
				
				if (number < 0) {
					System.out.println("음수입니다."); //만약 음수 입력시 음수입니다 뜨고 다시 입력해야함.(continue)
					continue;
				}
				arrNum[w] = number; // 양수가 입력되었을때는 [w] 동적할당이 이루어지고, w의 값은 1 증가한다.
				w++;
			}
			
			w = 0;
			while(w < arrNum.length ) { // 배열의 수만큼 반복. (값 출력되는 부분)
				System.out.println("arrNum[" + w + "] = " + arrNum[w]);
				w++;
			}
			
			
			
			
			
		
	}

}
