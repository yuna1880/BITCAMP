package util;

import java.util.ArrayList;
import java.util.List;

import dto.Human;


//직접적인 관련은 없으나, search, searchAll이 올 클래스


public class UtilityCls {
	
	//static = 어디에서나 접근할 수 있도록 만들어준다.
	//리스트로 값 받아준다.
	public static int search(String name, List<Human>list) {
		
		
		int index = -1;		
		for (int i = 0; i < list.size(); i++) {
			Human h = list.get(i);
			if(name.equals(h.getName())) {
				index = i;
				break;
			}
		}		
		return index; 
	}
	
	public static List<Integer> searchAll(String name, List<Human>list) {		
		
		List<Integer> indexList = new ArrayList<Integer>();		
		for (int i = 0; i < list.size(); i++) {
			Human h = list.get(i);
			if(name.equals(h.getName())) {
				indexList.add( i );
			}			
		}		
		return indexList;
	}
	

}
