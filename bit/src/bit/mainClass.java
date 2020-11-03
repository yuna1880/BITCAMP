package bit;

public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * bit : 저장의 최소단위 0,1
		 * & AND
		 * | OR
		 * ^ XOR
		 * << left shift
		 * >> right shift
		 * ~ field 반전.
		 */
		
		
		int result;
		
		//AND  1011 1100 -> B C
		//     8421 8421 -> 
		//     1100 1001 -> C 9
		//     1000 1000 -> 8 8 <- 16진수 
		
		result = 0xBC & 0xC9;
		System.out.println("result = " + result);
		System.out.printf("%x\n", result); // %x 16진수로 출력
		
		
		/*
		 * 
		 * 0x5D | 0xE3
		 * 
		 * 0101   1101
		 * 8421   8421
		 * 
		 * 1110   0011
		 * 8421   8421
		 * 
		 * 1111   1111    
		 * f      f
		 */
		
		result = 0x5D | 0xE3;
		
		System.out.println("result = " + result);
		System.out.printf("%x\n", result); // %x 16진수로 출력
		
		
		
		
		// ~ 반전 0->1  1->0 (쓸일 x)
		byte by = ~0x55;  // 0101 0101
						 // 1010 1010
		                 // 8421 8421
		                 // A    A
		System.out.printf("%x \n", + by);
		
		
		
		
		/*XOR
		 * 
		 * 0x37 ^ 0xAB
		 * 
		 * 0011   0111    
		 * 8421   8421
		 * 
		 * 1010   1011
		 * 8421   8421
		 * 
		 * 1001   1100
		 * 
		 * 
		 * 9     12
		 * 9 C
		 * 
		 */
		
		result = 0x37 ^ 0xAB;
		System.out.println("result = " + result);
		System.out.printf("%x\n", result);
		
		
		
		/*
		 * left shift
		 * right shift
		 * 1010 1100 * 2
		 * 10101 1000
		 * 
		 * 1000 => 8
		 * 100 => 4
		 * 
		 */
		
		byte by1;
		
		by1 = 0x1 << 1;
		System.out.println("by1 =  " + by1);
		
		by1 <<= 1;
		System.out.println("by1 = " + by1);
		
		by1 >>= 1;
		System.out.println("by1 = " + by1);
	}

}
