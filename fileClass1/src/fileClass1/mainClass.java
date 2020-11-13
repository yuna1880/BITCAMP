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
		
		String fileStr = "D:\\tmp\\newfile.txt"; //D드라이브안에 파일 생성.
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
			
			
			
			// 1.파일의 존재여부 
			

			if(newfile.exists()) { //파일이 존재할때
				System.out.println("파일이 존재합니다.");
				
			}else {
				System.out.println("파일이 존재하지 않습니다.");
				
			}
			
		
			// 2. 파일 삭제
			
			/*
			
			if(newfile.delete()){ //파일 삭제 성공시
				System.out.println("파일을 삭제하였습니다.");
	
			}else {
				System.out.println("파일을 삭제하지 못했습니다.");
				
			}
			
			*/
			
			// 3. 파일 읽기 가능?
			
			if(newfile.canRead()) {
				System.out.println("파일 읽기가 가능합니다.");
				
			}else {
				System.out.println("파일을 읽을 수 없습니다.");
				
			}
			
			
			// 3-1. 읽기 전용 옵션 설정.
			
			//newfile.setReadOnly(); //쓰기 불가능해진다.
			
			
			// 4. 쓰기 가능한지?
			
			if(newfile.canWrite()) {
				System.out.println("파일 쓰기 가능합니다..");
				
			}else {
				System.out.println("파일 쓰기 불가능합니다..");
				
			}
		
			
			
			
			
			
			
			
			
	}


}
