
public class ArrayTest3 { //�ٽ� �ۼ�

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] s = new int [10];
		for(int i = 0; i < s.length; i++) {
			s[i] = 0; // �迭 �ʱ�ȭ
		}
		
		for(int i = 2; i < s.length;i++) {
			s[i+1] = s[i] + 10;
		}
		for(int i=0;i<s.length;i++) {
			System.out.print(s[i] + "");
		}
	}

}
