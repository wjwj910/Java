
public class TelevisionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Television myTv = new Television();
		//myTv.channel = 7;
		//myTv.volume = 10;
		//myTv.onOff = true;
		
		Television yourTv =  new Television();
		//yourTv.channel = 9;
		//yourTv.volume = 12;
		//yourTv.onOff = true;
		
		
		//System.out.println("���� �ڷ������� ä���� " + myTv.channel + "�̰� ������ "
		//		+ myTv.volume + "�Դϴ�.");
		//System.out.println("���� �ڷ������� ä���� " + yourTv.channel + "�̰� ������ "
		//		+ yourTv.volume + "�Դϴ�.");
		//myTv.print();
		//yourTv.print();
		
		int ch = myTv.getChannel();
		System.out.println("���� ä���� " + ch +"�Դϴ�.");
		
		
		myTv.setChannel(11);
		int ch1 = myTv.getChannel();
		System.out.println("���� ä���� " + ch + "�Դϴ�");
	}

}
