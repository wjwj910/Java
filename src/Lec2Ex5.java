
// ����5) ���� ���ϴ� ���α׷�

import java.util.Scanner; // Scanner Ŭ������ ���

public class Lec2Ex5 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); // �Է¹޴� ���� input�̶�� ������ ����

		
		System.out.println("���� �� ���ϴ� ���α׷�\n");
		System.out.print("�ݺ��� Ƚ���� �Է��ϼ��� : ");
		int num = input.nextInt(); // �Է¹��� ��(=input)�� ������ ������ num�� ����
		double pi = 0; //�Ǽ��� ���� pi�� �����ϰ�, 0���� �ʱ�ȭ ����
		int sw = 1; // ��ȣ ��ȯ�� ���� ������ ���� sw ����
		
		for(int i=1; i<=num; i++) { // �ݺ��� Ƚ�� ��ŭ ����
			pi = pi + (double)(4 / ((double)(2*i)-1) * (sw)); // pi���� ���Ѽ��� ������ �����Ͽ� �������� ���ϱ�
			sw = -sw; // ��ȣ ��ȯ�Ͽ� ¦����° �׸��� ������ ��ȯ
		}
		
		System.out.println("������ : " + pi); // ���� �� ���
		
		input.close(); // input�� �ݾ��־� �Է¹޴� �� ������

	}

}
