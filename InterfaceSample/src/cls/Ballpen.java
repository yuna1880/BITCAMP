package cls;

import inter.Writemode;

public class Ballpen implements Writemode {

	@Override
	public void write() {
		System.out.println("Ballpen 볼펜으로 기입합니다.");
		
		erase();
	}

	
	public void erase() {
		
		System.out.println("화이트를 사용합니다.");
	}
	
	
	
}
