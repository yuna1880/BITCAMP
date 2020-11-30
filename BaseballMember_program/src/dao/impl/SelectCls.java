package dao.impl;

import java.util.List;
import java.util.Scanner;

import dao.MemberDao;
import dto.Human;
import single.SingletonCls;
import util.UtilityCls;

public class SelectCls implements MemberDao {

	Scanner sc = new Scanner(System.in);
	
	
	
	
	@Override
	public void proc() {
		
		SingletonCls si = SingletonCls.getInstance();
		
		System.out.print("검색하고 싶은 선수 명 = ");
		String name = sc.next();
		
		List<Integer> indexList = UtilityCls.searchAll(name,si.getList());
		
		if(indexList.size() == 0) {
			System.out.println("선수 명단에 없습니다");
			return;
		}
		
		for (int i = 0; i < indexList.size(); i++) {
			Human h = si.getList().get( indexList.get(i) );
			System.out.println(h.toString());
		}		
		
		
		

	}

}
