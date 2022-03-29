
// 실습1번) 자동차 클래스인 car class 생성(3개의 변수 / 4개의 메소드 포함)

public class car { // car class 선언
	
	String color; // 자동차의 색상을 문자열 변수 color로 선언
	int gear; // 기어 단 수를 정수형 변수 gear로 선언
	int speed; // 자동차 속도를 정수형 변수 speed로 선언
	
	void changeGear(int ch){ // 기어변속을 위해 changeGear라는 메소드 선언 / 매개 변수 = ch
		gear = ch; // gear의 값을 매개변수 값인 ch 로 변경
	}
	
	void speedUp(int up) { // 가속을 위해 speedUp이라는 메소드 선언 / 매개 변수 = up
		speed = speed + up; // speed의 값에 현재 speed값과 매개변수 값인 up을 더 하여 변경
	}
	
	void speedDown(int down) { // 감속을 위해 speedDown이라는 메소드 선언 / 매개 변수 = down
		speed = speed - down;  // speed의 값에 현재 speed값과 매개변수 값인 down을 빼서 변경
	}
	
	
	public String toString () { // 변경된 speed, gear를 확인하기 위해 문자열 메소드 선언
	return "Car [color=" + color + ", speed=" + speed + ", gear=" + gear + "]"; // 반환 값을 문자열로 반환
	}
}