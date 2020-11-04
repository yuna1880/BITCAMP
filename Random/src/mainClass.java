
public class mainClass {

	public static void main(String[] args) {
		/*
		 * random : 난수, 무작위  <--> pattern
		 * 
		 *      
		 * 
		 * 
		 */

		
		int randNum;
		
		randNum = (int)(Math.random() * 10); // 0-9숫자가 랜덤으로 뽑힌다.
		System.out.println("randNum =" + randNum); //랜덤넘버가 0-9사이 숫자가 나온다.
		
		// 10 - 19
		randNum = (int)(Math.random()*10) + 10; // 0 - 19
		System.out.println("randNum =" + randNum);
		
		
		// 10 20 30 40 50
		
		randNum = ((int)(Math.random()*5) + 1) * 10;
				 //     0 - 4 까지 뽑힌다  -> 1 - 5
		System.out.println("randNum =" + randNum);
		
		// -1 0 1
		
		randNum = (int)(Math.random()*3) -1;
				//  0-2         -> -1 0 1
		System.out.println("randNum =" + randNum);
		
		
		// !!! 11 23 14 56 78 (정의해주면 되서 숫자가 일률적일 필요가 없다) !!!
		int rArrNum[] = {11,23,14,56,78}; // 배열 초기화
		randNum = (int)(Math.random()*5);
						// 0-4번째까지 나온다.
		System.out.println(rArrNum[randNum]);
		
		
		
		
		
	}

}
