
// ����2) ���� ������ �Է� �޾Ƽ� �� ������ ��� ����� ����ϴ� ���α׷�

import java.util.Scanner; // Scanner Ŭ������ ���

public class Lec3Ex2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); // �Է¹޴� ���� input�̶�� ������ ����
		
		System.out.print("���� ������ �Է��Ͻÿ�: ");
		int num = input.nextInt(); // �Է¹��� ��(=input)�� ������ ������ num�� ����
		
		System.out.println(num + "�� ����� ������ �����ϴ�.");
		
		for(int i=1; i<=num; i++) {
			if((num%i) == 0) { // �Է��� ���� 1���� �������� �� 0�̶�� ���
				System.out.print(i + " "); // ��� ����ϱ�
			}			
		}
		
		input.close(); // input�� �ݾ��־� �Է¹޴� �� ������
	}
}
