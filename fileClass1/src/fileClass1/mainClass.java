package fileClass1;

import java.io.File;
import java.io.IOException;

public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		
		source code -> 알고리즘(logic)
		
		file : 저장 매체 -> 기능 // 불러다 쓰는 것. == Database
			      데이터 저장, 불러오기의 목적 !
			      
		*.txt
		*.jpg *.dll *lib .jar *.bmp
		
		
			dll (dinamic link library)(동적파일)
			library (정적파일)
		
		*/

		//C드라이브 안의 파일 목록 불러오기
		
		/*
		File fdir = new File("C:\\");
		
		String filelist[] = fdir.list();
		
		for (int i = 0; i < filelist.length; i++) {
			System.out.println(filelist[i]);
		}
		*/
		
		// 파일인지, 폴더인지 그 외
		
		/*
		File fdir = new File("C:\\");
		File filelist[] = fdir.listFiles();
		
		for (int i = 0; i < filelist.length; i++) {
			if(filelist[i].isFile()) { //파일
				
				System.out.println("[파일]" + filelist[i].getName());
				
			}else if (filelist[i].isDirectory()) { //폴더
				
				System.out.println("[폴더]" + filelist[i].getName());
				
			} else { //?
				
				System.out.println("[?]" + filelist[i].getName());
			}
		}
		*/
		
		
		// 파일 생성
		
		String fileStr = "D:\\tmp\\newfile.txt";            //D드라이브안에 파일 생성.
		File newfile = new File(fileStr);
		
		
			try {
				
				if(newfile.createNewFile()) {
					System.out.println("파일 생성 성공");
					
				} else {
					System.out.println("파일 생성 실패");
					
				}
				
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		 
		
		
		
	}


}
