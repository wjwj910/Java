
// ����1) ����ڷκ��� �� ���� ������ �Է� �޾� �� �� ū ���� ����ϴ� ���α׷�

import java.util.Scanner; // Scanner Ŭ������ ���

public class Lec2Ex1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); // �Է¹޴� ���� input�̶�� ������ ����
		
		System.out.print("ù ��° ������ �Է��ϼ��� : ");
		int input1 = input.nextInt(); // �Է¹��� ��(=input)�� ������ ������ input1�� ����
		
		System.out.print("�� ��° ������ �Է��ϼ��� : ");
		int input2 = input.nextInt(); // �Է¹��� ��(=input)�� ������ ������ input2�� ����
		
		
		if(input1 > input2) // ù ���� �Է��� ���� �� ���� �Է��� ������ Ŭ �� 
			System.out.println("�� ���� �� �� ū ���� " + input1 + "�Դϴ�.");
		else if(input1 < input2) // �� ���� �Է��� ���� ù ���� �Է��� ������ Ŭ �� 
			System.out.println("�� ���� �� �� ū ���� " + input2 + "�Դϴ�.");
		else // �Է��� �� ���� ���� ������ ��
			System.out.println("�� ������ ���� ���� �����ϴ�.");
		
		input.close(); // input�� �ݾ��־� �Է¹޴� �� ������
	}

}
