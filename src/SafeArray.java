
public class SafeArray {
	
	private int a[];
	public int length;
	public SafeArray(int size) {
		a = new int[size]; //new�� ����Ͽ� ���� Ȯ��
		length = size;
	}
	
	public int get(int index) {
		if(index>=0 && index<length) {
			return a[index];
		}
		return -1;
	}
	
	public void put(int index, int value) {
		if(index>=0 && index<length) {
			a[index] = value;
		}else
			System.out.println("�߸��� �ε��� " + index);
	}

}
