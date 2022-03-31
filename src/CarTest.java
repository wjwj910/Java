
public class CarTest {

	public static void main(String[] args) {
	/*	
		car myCar = new car(); //myCar라는 객체를 생성
		
		myCar.color = "red"; // 색상은 red
		myCar.speed = 0; // 현재 속도는 0
		myCar.gear = 1; // 현재 기어 단 수는 1
		
		System.out.println(myCar.toString()); // 현재 색상, 속도, 기어 단수 출력
		
		myCar.speedUp(60);					  // 현재 속도를 60만큼 올린다.
		System.out.println(myCar.toString()); // 현재 색상, 속도, 기어 단수 출력
		
		myCar.speedDown(30);				  // 현재 속도를 30만큼 감속한다.
		System.out.println(myCar.toString()); // 현재 색상, 속도, 기어 단수 출력
		
		myCar.changeGear(2);				  // 현재 기어 단 수를 2로 변경한다.
		System.out.println(myCar.toString()); // 현재 색상, 속도, 기어 단수 출력
		*/
		
		car c1 = new car("S600","white",80);
		car c2 = new car("E500","blue",20);
		int n = car.getNumberOfCars();
		System.out.println("지금까지 생성된 자동차 수 = " + n);
	}

}
