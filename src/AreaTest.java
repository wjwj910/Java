// 반지름을 입력받아 원의 면적으로 계산하는 프로그램

import java.util.Scanner; // Scanner 클래스를 사용

public class AreaTest
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in); // 입력받는 값을 input이라는 변수로 지정
		
		double radius; // 실수형 변수 선언
		final double PI = 3.141592; //상수 값인 PI 를 실수형 변수로 선언하고 값 대입
		
		System.out.print("원의 반지름을 입력하시오 : ");
		radius = input.nextDouble(); // 입력받는 값(=input)을 radius라는 실수형 변수에 저장
		
		double area = PI * radius * radius; // 면적을 area 로 선언하고 원의 면적 공식을 대입
		System.out.println("반지름이"+radius+"인 원의 면적은"+area+"입니다.");
		
		input.close(); // input을 닫아주어 입력받는 값 끝내기
	}
}
