package fileWrite;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class mainClass {

	public static void main(String[] args) throws Exception{
		
		
		//file write
		File file = new File("D:/tmp/test.txt");
		
		
		//한 문자씩 기입 
		FileWriter fw = new FileWriter(file);
		fw.write("Hello" + "\n"); //(파일이 없으면 만들어주고, 써준다)(주의)!!
		fw.close(); //매우 중요 ! close를 해야 작성이 된다.
		
		
		/*
		// 추가 쓰기 (더 쓰기)
		FileWriter fw = new FileWriter(file,true); //true 달아주면 된다.
		fw.write("Hello" + "\n");
		fw.close();
		*/
		
		/*
		// 문장으로 쓰기
		FileWriter fw = new FileWriter(file,true);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter pw = new PrintWriter(bw);
		
		pw.print("안녕 ");
		pw.println("하이하이");
		pw.println("건강하세요");
		
		pw.close();
		bw.close();
		fw.close();
		
		*/
	}

}
