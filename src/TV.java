public class TV {
	private int channel;
	private int volume;
	private boolean power;
	
	public TV() {		}
	public TV(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}
	public int getChannel() {
		return channel;
	} 
	public int getVolume() {
		return volume;
	}
	public boolean isPower() {
		return power;
	}
	
	public void power(boolean on) {
		power = on;
	}
	public void channel(int channel) {
		if(isChannel(channel)) {
			this.channel = channel;
		}
	}
	public void channel(boolean up) {
		if(up) {
			if (channel < 255) {
				channel++;
				return;
			} 
		}
//		if (channel >1) {
////			System.out.println("설마 여기도 들어가니?");
//			//와 나 진짜 들어가넼ㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋ
//			channel -= 1;
//		} //분명 재용오빠가 짜면 더 짧은 코드가 나올텐데..ㅜㅠㅜㅠㅜ
		if(channel>1) {
				channel--;
		}
	}
	public void volume(int volume) {
		if(isVolume(volume)) {
			this.volume = volume;			
		}
	}
	public void volume(boolean up) {
		if(up) {
			if (volume < 100) {
				volume++;
				return;
			} 
		}
		if(volume>0) {
			channel--;
		}
	}
	public void status() {
		System.out.println("현재 전원 : "+power);
		if(power) {
			System.out.println("현재 채널 : "+channel);
			System.out.println("현재 음량 : "+volume);			
		}
		System.out.println("");
	}
	public boolean  isChannel(int c) {
		if(c>0 && c<256) {
			return true;
		}
		return false;
	}
	public boolean isVolume(int v) {
		if(v>=0 && v<101) {
			return true;
		}
		return false;
	}
}
