package dao;

import java.util.ArrayList;
import java.util.List;

import dto.Batter;
import dto.Human;
import dto.Pitcher;

public class MemberDao {

	
	private List<Human> list;
	private int memberNum;
	
	
	public MemberDao() {
		
		
		list = new ArrayList<Human>();
		
	//	memberNum = list.get(list.size()-1).getNumber();
		
		memberNum = 1000; //(임시로)
		
		if(memberNum >= 2000) {      //2004
			
			memberNum = memberNum - 1000;  // 1004
		}
		memberNum = memberNum + 1;

	}
	
	
	public boolean insert(Human h) { 
		
		if(h instanceof Pitcher) {
			
			h.setNumber(memberNum);
			
		}else if(h instanceof Batter) {
			
			h.setNumber(memberNum + 1000);
			
		}
		
		
		boolean b = list.add(h); // human 리스트에 Human h넘겨온 값 저장.
		
		/*
		for (Human hu: list) {
			System.out.println(hu.toString());
		} //확인용!
		*/
		
		memberNum++;
		
		return b; // 리스트 저장되었으면 b 로 리턴.
		
	}
	
	
	
	public boolean search(String m) {
		
		return true;
	}
	


	public void delete(int num) {
		
		
		
		
	}
	
	
	
	public List<Human> getList() {
		return list;
	}
	
	
}
