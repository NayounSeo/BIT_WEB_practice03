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
////			System.out.println("���� ���⵵ ����?");
//			//�� �� ��¥ ������������������������
//			channel -= 1;
//		} //�и� �������� ¥�� �� ª�� �ڵ尡 �����ٵ�..�̤Ф̤Ф�
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
		System.out.println("���� ���� : "+power);
		if(power) {
			System.out.println("���� ä�� : "+channel);
			System.out.println("���� ���� : "+volume);			
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
