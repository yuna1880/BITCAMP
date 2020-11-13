package fileProc;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class mainClass {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		
		
		
		createFile();
		
		try {
			inputFile();
		} catch (IOException e) {

			e.printStackTrace();
		} 
		
		
		
		
	}	////////////////////////////////////////
		
		// 파일 생성 -> 파일명
		
	
		static void createFile() {
			
			String fileyuna = "D:\\tmp\\yunafile.txt";
			File file = new File(fileyuna);
			
			
			try {
				if(file.createNewFile()) {
					System.out.println("파일 생성 성공");
					
					
				}else {
					System.out.println("파일 생성 실패");
					
				}
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
		}
	
		
		// 파일 쓰기 -> input
	
		static void inputFile() throws IOException{
			
			String fileyuna = "D:\\tmp\\yunafile.txt";
			File file = new File(fileyuna);
			FileWriter fw = new FileWriter(file);
			fw.write("Hello" + "\n");
			fw.close();
		
		
		}
	
		
		
		// 파일 읽기 -> output
		
		static void outputFile() {
			
			String fileyuna = "D:\\tmp\\yunafile.txt";
			FileReader fr = new FileReader(fileyuna);
			
			String str = "";
			
			int c = fr.read();
			
			
			
		}
		
		
		
		//  파일에 있는 모든 데이터를 String[]
		
		
		
		
		
		
		
		
		// 파일 추가 쓰기 
		
		
		
		
		
		
		
	
	
	
	

	}


