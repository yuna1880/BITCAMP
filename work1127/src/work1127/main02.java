package work1127;

public class main02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//피보나치수열
		
		
		int a1 = 1;
		int a2 = 1;
		int a3;
		
		System.out.println(a1);
		System.out.println(a2);
		
		for (int i = 1; i <= 18; i++) {
			
			a3=a1+a2;
			System.out.println(a3);
			
			a1=a2;
			a2=a3;

	}

	}
}