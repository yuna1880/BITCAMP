package fileProc; //선생님버전

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class mainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String filename = "hello";
		
		
		createFile(filename);
		
		File f = createFile(filename);
		
		
		// 파일 쓰기 
		
		String str[] = {"안녕하세요","건강하세요","성공하세요"};
		
		boolean b = dataSave(f, str);
		
		if(b) {
			System.out.println("파일에 저장하였습니다.");
		}else {
			System.out.println("파일에 저장하지 못했습니다.");
		}
		
		
		
		
	}  ////////////////////////////////////////////////
	
	
	// 파일 생성 -> 파일명 
	
	static File createFile(String filename) {
		
		File f = new File("D:\\tmp\\" + filename + ".txt");
		
		if(f.exists()) {
			System.out.println(filename + ".txt 파일이 존재합니다.");
			
			
		}else {
		
		try {
			f.createNewFile();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		System.out.println(filename + ".txt 파일을 생성했습니다.");
		
	}
		
		return f;
		
	}
	
	
	//파일 쓰기, 추가쓰기 -> input
	
	static boolean dataSave(File f, String datas[]) {
		
		try {
		
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter pw = new PrintWriter(bw);
	
		
		
		for (int i = 0; i < datas.length; i++) {
			pw.println(datas[i]);
		}
		pw.close();
		
		}catch(Exception e) {
			return false;
		}
		
		return true;
	}
	
		
	
		// 파일 읽기 -> output
		
	
	
		// 파일에 모든 데이터를 String[]
	
		static String[] dataLoad(File f) {
			
			
			String datas[] = null;
			
			try {
				FileReader fr = new FileReader(f);
				String datas[] = null;
				
				// 데이터의 수 취득
				
				
				fr = new FileReader(f);
				int count = 0;
				String str;
				BufferedReader br = new BufferedReader(fr);
				
				try {
					while((str = br.readLine()) != null) {
						count++;
					}
				 br.close();
				
				 //데이터의 수에 맞게 할당
				 datas = new String[count];
				 
				 //데이터의 취득
				 br = new BufferedReader(fr); // 파일포인터의 초기화
				
				 int i = 0;
				 
				 while( ( str = br.readLine()) != null ) {
					 
					 datas[i] = str;
					 i++;
				 
				 }
				 br.close();
				 
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return datas;
			
		
			}
	

}
