
// ����6) �迭�� ��� ���ڿ��� ���� ���� ���ڸ� ã�� ���α׷�

public class Lec2Ex6 {

	public static void main(String[] args) {
		
		int s[] = {12, 3, 19, 6, 18, 8, 12, 4, 1,19}; // �迭 ���� �� �־��� ������ �ʱ�ȭ
		
		int min = 0; // �ּڰ��� ������ ���� min���� ���� �� 0���� �ʱ�ȭ
		int i = 0; // �迭 �ε��� ��ȣ�� ���� ������ ���� i ���� �� 0���� �ʱ�ȭ 
		
		while(i < s.length - 1) { // 's.length-1 = 9' ��, i�� 9���� ���� ���� ����
			if(s[i] <= s[i+1]) { // �迭 ���� ���� ���� ��°�� ������ �۰ų� ���� ��
				min = s[i]; 	 // �迭 ���� min�� ����
			}
			i++; // �ε��� ��ȣ(i) ����
		}
		System.out.println("�迭 s�� �ּڰ��� " + min + "�Դϴ�."); // ����� ���
	}

}