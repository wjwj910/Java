// �������� �Է¹޾� ���� �������� ����ϴ� ���α׷�

import java.util.Scanner; // Scanner Ŭ������ ���

public class AreaTest
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in); // �Է¹޴� ���� input�̶�� ������ ����
		
		double radius; // �Ǽ��� ���� ����
		final double PI = 3.141592; //��� ���� PI �� �Ǽ��� ������ �����ϰ� �� ����
		
		System.out.print("���� �������� �Է��Ͻÿ� : ");
		radius = input.nextDouble(); // �Է¹޴� ��(=input)�� radius��� �Ǽ��� ������ ����
		
		double area = PI * radius * radius; // ������ area �� �����ϰ� ���� ���� ������ ����
		System.out.println("��������"+radius+"�� ���� ������"+area+"�Դϴ�.");
		
		input.close(); // input�� �ݾ��־� �Է¹޴� �� ������
	}
}
