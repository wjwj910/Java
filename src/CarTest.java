
public class CarTest {

	public static void main(String[] args) {
		
		car myCar = new car(); //myCar��� ��ü�� ����
		
		myCar.color = "red"; // ������ red
		myCar.speed = 0; // ���� �ӵ��� 0
		myCar.gear = 1; // ���� ��� �� ���� 1
		
		System.out.println(myCar.toString()); // ���� ����, �ӵ�, ��� �ܼ� ���
		
		myCar.speedUp(60);					  // ���� �ӵ��� 60��ŭ �ø���.
		System.out.println(myCar.toString()); // ���� ����, �ӵ�, ��� �ܼ� ���
		
		myCar.speedDown(30);				  // ���� �ӵ��� 30��ŭ �����Ѵ�.
		System.out.println(myCar.toString()); // ���� ����, �ӵ�, ��� �ܼ� ���
		
		myCar.changeGear(2);				  // ���� ��� �� ���� 2�� �����Ѵ�.
		System.out.println(myCar.toString()); // ���� ����, �ӵ�, ��� �ܼ� ���
	}

}
