package main;

import dao.MemberDao;

public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberDao dao = new MemberDao();

		// 메뉴
		dao.insert();
		
		dao.allprint();
		
		dao.insert();
		
		dao.allprint();
		
	}

}




