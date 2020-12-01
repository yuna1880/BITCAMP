package file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class DataProc {
	
	
	private File file; //파일 일단 만들기.
	
	
	//생성자 (혹시라도 파일이 외부에서 올때를 대비)
	public DataProc(String filename) {
		
		file = new File("D:\\tmp\\" + filename + ".txt");
		
	}
	
	//파일 생성
	
	public void createFile() {
		
		try {
			
			if(file.createNewFile()) {
				
				System.out.println("파일 생성 성공!");	
	
			} else {
				
				System.out.println("파일 생성 실패");
			}
		} catch (IOException e) {
			
			System.out.println("파일 생성중 문제 발생!!");
		}
		
	}
	
	
	// 파일에 데이터 쓰기
	// 관리 
	/*
	
	1001-홍길동-24-10-2-0.2 (- token을 붙이고 잘라주자!)
	
	문자 -> 숫자 변환작업 해줘야함.
	
	들어가는 데이터 : String[]
	나오는 데이터 : X 
	
	*/
	
	public void saveData(String []datas) {
		
		try {
			
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(file)));
			
			for (int i = 0; i < datas.length; i++) {
				pw.println(datas[i]); //데이터의 수만큼 파일에 작성!
			}
			
			pw.close();
			
		} catch (IOException e) {
			
			System.out.println("파일 저장 중 문제 발생 !!");
		}
		
	}
	
	
	// 파일에서 데이터 읽기
	
/*
	
	나오는 데이터 : String[] //데이터가 여러개니까!
	
	
	*/
	
	
	
	public String[] loadData() {
		
		String datas[] = null; //리턴해줄 데이터 비워주기.
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			
			//1) data의 수를 조사 !
			int count = 0;
			String str = "";
			
			// 한줄씩 읽어오기. 
			while((str = br.readLine()) != null) { 
					count++; //읽어들인 문자열 수 만큼 카운트 더해준다.
					
			}
			br.close();
			
			if(count == 0) {
				
				System.out.println("데이터가 하나도 없습니다!");
				return null;
				
			}
			//2)동적할당 (위에서 읽어들인 줄의 수만큼 동적할당을 해준다)
			
			datas = new String[count];
			
			
			
			
			//3)data를 저장.
			
			br = new BufferedReader(new FileReader(file));
			
			int j = 0;
			while((str = br.readLine()) != null) {
				datas[j] = str;
				j++;
			}
			br.close();
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return datas;
		
	}
	
	
	
	
	
	
	
	
	

}
