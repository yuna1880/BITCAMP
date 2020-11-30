package single;

import java.util.ArrayList;
import java.util.List;

import dto.Human;

public class SingletonCls {
	
	private static SingletonCls si = null;
	private List<Human> list = null;           //싱글톤, 리스트 선언!
	
	
	private SingletonCls() {
		
		list = new ArrayList<Human>();  //싱글턴이 만들어진 후에 호출받아서 리스트에 접근.
		
	}
	
	
	public static SingletonCls getInstance() {
		
		if(si == null) {
			
			si = new SingletonCls();
		}
		
		return si;
		
	}



	public List<Human> getList() {
		return list;
	}
	
	
	
	
	
	
	
}
