
// 2�� �������� �־����� �� ���� ����ϴ� ���α׷�
// �Ǽ� b�� c�� �Է����� �޴´�.

// ���⼭�� 2�� �������� "y = x*x + b*x + c"�� �����Ѵ�.

import java.util.Scanner; // Scanner Ŭ������ ���

public class QuadraticEq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in); // �Է¹޴� ���� input�̶�� ������ ����
		
		System.out.println("2�� �������� 'y=x*x + b*x + c' �Դϴ�.");
		
		System.out.print("b�� ���� �Է��ϼ��� : ");
		double b = input.nextDouble(); // ù ���� �Է¹��� ��(=input)�� �Ǽ��� ������ b�� ����
		
		System.out.print("c�� ���� �Է��ϼ��� : ");
		double c = input.nextDouble(); // �� ���� �Է¹��� ��(=input)�� �Ǽ��� ������ b�� ����
		
		double result1 = ((-b + Math.sqrt(b*b-4*c))/ 2); // ���� ������ �̿��Ͽ� ù ��° ���� �Ǽ��� ������ result1�� ����
		double result2 = ((-b- Math.sqrt(b*b-4*c))/ 2); // ���� ������ �̿��Ͽ� �� ��° ���� �Ǽ��� ������ result2�� ����
		
		System.out.println("2�� �������� �� ���� "+ result1 +", "+ result2 +"�Դϴ�."); // �ΰ��� ���� ���
		
		input.close(); // input�� �ݾ��־� �Է¹޴� �� ������
	}

}