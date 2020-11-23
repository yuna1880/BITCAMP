package main;

import jdk.internal.org.objectweb.asm.tree.analysis.Value;

public class mainClass {

	public static void main(String[] args) {
/*
		
		Generic == template (형태)
				  : 자료형의 변수
				  : 같은 클래스에서 다양한 자료형을 사용하고 싶은 경우 사용한다.
				  
					-> 자료형을 나중에 정한다. 어떤 오브젝트가 들어올 지 모르기 때문에!
					-> 개수는 계속 사용 가능. 그러나 2개 이상 사용하는 경우 드물다.
					-> 클래스도 넣어놓고 사용 가능하다.
		*/
		
		//Box box = new Box(111);
		
		Box<Integer> box = new Box<Integer>(111);
		//일반 배열에서 자료형을 추가한것이다.
		System.out.println(box.getTemp() + 1);
		
		Box<String> str = new Box<String>("my world");
		System.out.println(str.getTemp() );
		
		BoxMap<Integer, String> bmap = new BoxMap<Integer, String>(1001,"hello");
		System.out.println(bmap.getKey());
		
		
		
		BoxMap<String, Object> boxM = new BoxMap<String, Object>(new String ("world"), new Integer(235));
		System.out.println(boxM.getKey());
		System.out.println(boxM.getValue());
		
	}

}

class Box<T>{
	
	T temp;

	public Box(T temp) {
		
		this.temp = temp;
	}

	public T getTemp() {
		return temp;
	}

	public void setTemp(T temp) {
		this.temp = temp;
	}
	
}



class BoxMap<Key, Value>{ //hashmap
	
	Key key;
	Value value;
	
	
	public BoxMap(Key key, Value value) {
		super();
		this.key = key;
		this.value = value;
	}


	public Key getKey() {
		return key;
	}


	public void setKey(Key key) {
		this.key = key;
	}


	public Value getValue() {
		return value;
	}


	public void setValue(Value value) {
		this.value = value;
	}
	
	public void method() {
		int result;
		
		//result = key + value; //연산 불가능.
		
		
	}
	
	
	
	
	
	
	
}