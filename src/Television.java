
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
		System.out.println("ä����"+channel+"�̰� ������"+volume+"�Դϴ�.");
	}
	int getChannel() {
		return channel;
	}
	void setChannel(int ch1) {
		channel = ch1;
	}
}
