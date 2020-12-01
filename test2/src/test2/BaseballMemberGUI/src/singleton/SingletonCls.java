package singleton;

import dao.MemberDao;

//접근해야할 멤버다오 필요

public class SingletonCls {

	private static SingletonCls cls = null;
	public MemberDao dao = null;
	
	private SingletonCls() {
		
		dao = new MemberDao();
		//다오 접근가능하도록 설정! + 싱글톤 통해서 다오 생성 ~!
	}
	
	
	//싱글턴 1번 생성.
	public static SingletonCls getInstance() {
		
		if(cls == null) {
			
			cls = new SingletonCls();
		}
		
		return cls;
	}

}
