
// �ǽ�1��) �ڵ��� Ŭ������ car class ����(3���� ���� / 4���� �޼ҵ� ����)

public class car { // car class ����
	
	String color; // �ڵ����� ������ ���ڿ� ���� color�� ����
	int gear; // ��� �� ���� ������ ���� gear�� ����
	int speed; // �ڵ��� �ӵ��� ������ ���� speed�� ����
	
	void changeGear(int ch){ // ������ ���� changeGear��� �޼ҵ� ���� / �Ű� ���� = ch
		gear = ch; // gear�� ���� �Ű����� ���� ch �� ����
	}
	
	void speedUp(int up) { // ������ ���� speedUp�̶�� �޼ҵ� ���� / �Ű� ���� = up
		speed = speed + up; // speed�� ���� ���� speed���� �Ű����� ���� up�� �� �Ͽ� ����
	}
	
	void speedDown(int down) { // ������ ���� speedDown�̶�� �޼ҵ� ���� / �Ű� ���� = down
		speed = speed - down;  // speed�� ���� ���� speed���� �Ű����� ���� down�� ���� ����
	}
	
	
	public String toString () { // ����� speed, gear�� Ȯ���ϱ� ���� ���ڿ� �޼ҵ� ����
	return "Car [color=" + color + ", speed=" + speed + ", gear=" + gear + "]"; // ��ȯ ���� ���ڿ��� ��ȯ
	}
}