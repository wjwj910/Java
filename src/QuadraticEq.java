
// 2차 방정식이 주어졌을 때 근을 계산하는 프로그램
// 실수 b와 c를 입력으로 받는다.

// 여기서의 2차 방정식은 "y = x*x + b*x + c"로 정의한다.

import java.util.Scanner; // Scanner 클래스를 사용

public class QuadraticEq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in); // 입력받는 값을 input이라는 변수로 지정
		
		System.out.println("2차 방적식은 'y=x*x + b*x + c' 입니다.");
		
		System.out.print("b의 값을 입력하세요 : ");
		double b = input.nextDouble(); // 첫 번쨰 입력받은 값(=input)을 실수형 변수인 b에 저장
		
		System.out.print("c의 값을 입력하세요 : ");
		double c = input.nextDouble(); // 두 번쨰 입력받은 값(=input)을 실수형 변수인 b에 저장
		
		double result1 = ((-b + Math.sqrt(b*b-4*c))/ 2); // 근의 공식을 이용하여 첫 번째 근을 실수형 변수인 result1에 저장
		double result2 = ((-b- Math.sqrt(b*b-4*c))/ 2); // 근의 공식을 이용하여 두 번째 근을 실수형 변수인 result2에 저장
		
		System.out.println("2차 방정식의 두 근은 "+ result1 +", "+ result2 +"입니다."); // 두개의 근을 출력
		
		input.close(); // input을 닫아주어 입력받는 값 끝내기
	}

}