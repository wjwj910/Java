
// ����7) ����Ž�� �˰��� ���α׷�

import java.util.Scanner; // Scanner Ŭ������ ���

public class Lec3Ex7 {

	public static void main(String[] args) {
		
		int s[] = {0, 11, 18, 29, 35, 49, 62, 68, 73, 88, 100}; // �迭 ���� �� �־��� ������ �ʱ�ȭ

		Scanner input = new Scanner(System.in); // �Է¹޴� ���� input�̶�� ������ ����
		
		System.out.print("���� ���� �Է��ϼ��� : ");
		int num = input.nextInt(); // �Է¹��� ��(=input)�� ������ ������ num�� ����
		
		for(int i=0; i<s.length; i++) { // �迭�� ũ�⺸�� ���� ������ ��, i�� 0����10����
			if(num == s[i]) { // �Է��� ���� �迭 ���� ���� ��ġ �� ���
				System.out.println("�Է��ϴ� ���� " + s[i] + "�� ���� ���Դϴ�.");
				break; // break���� ����Ͽ� ���ǹ� ����������
			}
			
			if(num < s[i]) { // �Է��� ���� �迭 s[i]���� ���� ��� ����
				if(num > s[i-1]) { // �Է��� ���� �迭 s[i-1]���� Ŭ ��� ����
				System.out.println(num + "�� " + s[i-1] + "���� ũ�� " + s[i] + "���� �۽��ϴ�.");
				break; // break���� ����Ͽ� ���ǹ� ����������
				}
			}
			
		}
		input.close(); // input�� �ݾ��־� �Է¹޴� �� ������
	}

}