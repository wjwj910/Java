import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		Scanner input = new Scanner(System.in);
		System.out.print("������ �Է��Ͻÿ� : ");
		number = input.nextInt();
		
		if (number % 2 == 0)
			System.out.println("�Էµ� ������ ¦���Դϴ�.");
		else
			System.out.println("�Էµ� ������ Ȧ���Դϴ�.");
		
		System.out.println("���α׷��� ����Ǿ����ϴ�.");
	}

}
