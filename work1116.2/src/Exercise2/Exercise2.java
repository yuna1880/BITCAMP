package Exercise2;

import MyTv2.MyTv2;

public class Exercise2 {

	public static void main(String[] args) {
		
	
		MyTv2 t = new MyTv2();
		
		/*
		t.setChannel(10);
		System.out.println("CH:"+t.getChannel());
		t.setVolume(20);
		System.out.println("VOL:"+t.getVolume());
		*/

		
		t.setChannel(10);
		System.out.println("CH:"+t.getChannel());
		// preChannel = 0
		// this.channel = 10
		
		t.setChannel(20);
		System.out.println("CH:"+t.getChannel());
		// preChannel = 10
		// this.channel = 20
				
		
		
		t.gotoPrevChannel();
		System.out.println("CH:"+t.getChannel());
		// preChannel = 10
		// this.channel = 10
		
		t.gotoPrevChannel();
		System.out.println("CH:"+t.getChannel());
		// preChannel = 20
		// this.channel = 20
		
		
	}

}
