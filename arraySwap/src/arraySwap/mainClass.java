package arraySwap;

public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numberOne[] = {1,2,3,4,5};
		int numberTwo[] = {11,22,33,44,55};
		
		
		int oneNum[] = numberOne; //빈 통에 값 넣음.
		int twoNum[] = numberTwo;
		
		
		//교과서대로 (정석)
		
		//swap
		
		/* 갯수만큼 바꾸기
		int temp;  
		
		for (int i = 0; i < numberOne.length; i++) {                  
			
			temp = numberOne[i];
			numberOne[i] = numberTwo[i];
			numberTwo[i] = temp;
		}
		
		for (int i = 0; i < numberOne.length; i++) {
			System.out.print(numberOne[i]+"");
		}
		*/
		
		//효율적인 처리
		
		int temp[];
		
		temp = oneNum;
		oneNum = twoNum;
		twoNum = temp;
		
		
		for (int i = 0; i < numberOne.length; i++) {
			System.out.print(numberOne[i]+"");
		}
		
		
		/*
		for (int i = 0; i < oneNum.length; i++) {
			System.out.print(oneNum[i]+" ");
		}
		*/
		
		
	}

}
