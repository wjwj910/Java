
// 문제1) 사용자로부터 두 개의 정수를 입력 받아 둘 중 큰 수를 출력하는 프로그램

import java.util.Scanner; // Scanner 클래스를 사용

public class Lec2Ex1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); // 입력받는 값을 input이라는 변수로 지정
		
		System.out.print("첫 번째 정수를 입력하세요 : ");
		int input1 = input.nextInt(); // 입력받은 값(=input)을 정수형 변수인 input1에 저장
		
		System.out.print("두 번째 정수를 입력하세요 : ");
		int input2 = input.nextInt(); // 입력받은 값(=input)을 정수형 변수인 input2에 저장
		
		
		if(input1 > input2) // 첫 번쨰 입력한 값이 두 번쨰 입력한 값보다 클 때 
			System.out.println("두 정수 중 더 큰 값은 " + input1 + "입니다.");
		else if(input1 < input2) // 두 번쨰 입력한 값이 첫 번쨰 입력한 값보다 클 때 
			System.out.println("두 정수 중 더 큰 값은 " + input2 + "입니다.");
		else // 입력한 두 값이 서로 동일할 때
			System.out.println("두 정수는 서로 값이 같습니다.");
		
		input.close(); // input을 닫아주어 입력받는 값 끝내기
	}

}
