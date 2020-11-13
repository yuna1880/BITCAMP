package fileRead;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class mainClass {

public static void main(String[] args) {
		

		
		// file read
		
	    //File file = new File("D:\\tmp\\test.txt");
		
		
		File file = new File("D:\\tmp\\newfile.txt");
		
		
		// instance, object
		
		
		 //무거운 방식
		  
		 
		
		
		FileReader fr = new FileReader(file);
			
		String str = "";
		
		int c = fr.read(); //한 문자씩 읽는다.
			
		
		while(c != -1) { // -1 == 파일의 끝
			System.out.print((char)c);
			str = str + (char)c;
			c = fr.read();
		}
		
		System.out.println( str );
		
		
		
		
		
		
		
		/*
		
		// 문장으로 읽는다. buffer -> 저장공간
		
		
		String str = "";
		
		FileReader fr;
		
		try {
			
			fr = new FileReader(file);	
			BufferedReader br = new BufferedReader(fr);
						
			while( (str = br.readLine()) != null) { //파일 끝이 아닐때까지 반복!
				System.out.println(str);
				
			}			
			
			br.close();  //파일 읽은 후에는 닫아주기.
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		*/
		
		
		
		
}

}
	


