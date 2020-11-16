package MyTv2;

public class MyTv2 {
	
	
	/*
	
	MyTv2클래스의 멤버변수 isPowerOn, channel, volume을 클래스 외부에서 접근할
	수 없도록 제어자를 붙이고 대신 이 멤버변수들의 값을 어디서나 읽고 변경할 수 있도록
	getter와 setter메소드를 추가하라.
	
	*/
	
	
	private boolean isPowerOn;
	private int channel;
	private int volume; //외부에서 접근 불가능하도록 만들기.
	
	private int preChannel; // 이전 채널 저장하는 공간.
	
	//생성자
	public MyTv2() {
		
	}
	
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	

	public boolean isPowerOn() {
		return isPowerOn;
	}

	public void setPowerOn(boolean isPowerOn) {
		this.isPowerOn = isPowerOn;
	}


	public int getChannel() {
		return channel;
	}


	public void setChannel(int channel) { 
		
		preChannel = this.channel; // 먼저 기존에 셋팅된 채널을 prev에!
		
		this.channel = channel; // 여기서 int channel으로 멤버변수 바뀐다.
	}


	public int getVolume() {
		return volume;
	}


	public void setVolume(int volume) {
		this.volume = volume;
	}

	
	
	public void gotoPrevChannel() {
		
		
		setChannel(preChannel);
		
		
	}
	
	
	
	

}
