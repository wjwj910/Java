
// �ǽ�2��) ���ڿ��� "www"�� �����ϴ��� �˻��ϴ� ���α׷�(���ڿ� ��)

import java.util.Scanner; // Scanner Ŭ������ ���

public class StringCompare {
	public static void main(String arg[]) {
		
		String str; // ���ڿ� ���� str ����
		Scanner input = new Scanner(System.in); // �Է¹޴� ���� input�̶�� ������ ����
		
		
		while(true) { // ���ѷ����� ����
			System.out.print("���ڿ��� �Է��ϼ���> ");
			str = input.next(); // // �Է¹��� ��(=input)�� ���ڿ� ������ str�� ����
			
			if(str.equals("quit") == true) // �Է¹��� ���� "quit" �϶�
				break;					   // break�� �����Ͽ� ����������

			if(str.startsWith("www")) { 						 // Ư�����ڷ� �����Ҷ� true ���� startsWith �Լ��� ����� "www"�� �����Ѵٸ�
				System.out.println(str + " �� 'www'�� �����մϴ�."); // "www"�� �����Ѵٰ� ���
			}
			else {
				System.out.println(str + " �� 'www'�� �������� �ʽ��ϴ�."); // �׷��� ���� ��� "www"�� �������� �ʴ´ٰ� ���
			}
		}		
		input.close(); // input�� �ݾ��־� �Է¹޴� �� ������
	}
}
