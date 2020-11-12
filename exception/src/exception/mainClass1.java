package exception;// exception2

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class mainClass1 {

	public static void main(String[] args) {
		
		
		
		//1. NullPointerException !!!
		
		String str = null; // 주석값이 없는것.
		
		//String str = ""; //생성이 되어있는것 
		
		try {
		
		System.out.println(str.length());
		}catch(NullPointerException e ) {
			e.printStackTrace();
		}
		//생성이 안되었다 !! 예외.
		
		
		
		//2. ArrayIndexOutOfBoundsException
		
		int arr[] = {1,2,3};
		
		try {
		System.out.println(arr[3]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 범위 초과");
		}
		
		
		
		//3. FileNotFoundException
		
		File file = new File("c:\\xxx.txt"); //파일이 없어서 못찾아 예외.
		
		FileInputStream is;
		
		try {
		is = new FileInputStream(file);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		
		//4.NumberFormatException
		
		try {
			int num = Integer.parseInt("123.456");
			
		}catch(NumberFormatException e){
			e.printStackTrace();
		}
		

		//에러 안나게 하려면?
		
		
		
		
		//5.StringIndexOutOfBoundsException
		
		String str1 = "abc";
		
		try {
		char c = str.charAt(3); //예외 발생 아래는 코드가 진행안되고 catch로 간다.
		
		}catch(StringIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
		
	
		// catch(Exception e) 로 쓰면 뭐든 다 가려낼 수 있다 !
		
		

	}

}
