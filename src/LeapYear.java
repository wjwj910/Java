
//입력받은 해가 윤년인지 확인하는 프로그램을 작성하시오.

import java.util.Scanner; // Scanner 클래스를 사용

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in); // 입력받는 값을 input이라는 변수로 지정
		
		System.out.print("년도를 입력하세요 : ");
		int year = input.nextInt(); // 입력받은 값(=input)을 정수형 변수인 year에 저장
		
		boolean result = ((year % 4) == 0); // year를 4로 나누어 나머지가 0 인 경우(=윤달인 경우) result 값은 "true"
											// 나머지가 0 이 아닐 경우(=윤달이 아닌 경우) result 값은 "false"
		System.out.println(result); // 결과 값 출력
		
		input.close(); // input을 닫아주어 입력받는 값 끝내기
	}
}