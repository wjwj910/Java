
//�Է¹��� �ذ� �������� Ȯ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

import java.util.Scanner; // Scanner Ŭ������ ���

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in); // �Է¹޴� ���� input�̶�� ������ ����
		
		System.out.print("�⵵�� �Է��ϼ��� : ");
		int year = input.nextInt(); // �Է¹��� ��(=input)�� ������ ������ year�� ����
		
		boolean result = ((year % 4) == 0); // year�� 4�� ������ �������� 0 �� ���(=������ ���) result ���� "true"
											// �������� 0 �� �ƴ� ���(=������ �ƴ� ���) result ���� "false"
		System.out.println(result); // ��� �� ���
		
		input.close(); // input�� �ݾ��־� �Է¹޴� �� ������
	}
}