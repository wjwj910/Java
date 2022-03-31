
public class Television {
	private int channel;
	private int volume;
	private boolean onOff;

	public int c(int channel) {
		return channel;
	}
	public int v(int volume) {
		return volume;
		
	}
	public boolean o(boolean onOff) {
		return onOff;
	}
	
	void print() {
		System.out.println("채널은"+channel+"이고 볼륨은"+volume+"입니다.");
	}
	int getChannel() {
		return channel;
	}
	void setChannel(int ch1) {
		channel = ch1;
	}
}
