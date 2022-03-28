
// 문제5) 파이 구하는 프로그램

import java.util.Scanner; // Scanner 클래스를 사용

public class Lec2Ex5 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); // 입력받는 값을 input이라는 변수로 지정

		
		System.out.println("파이 값 구하는 프로그램\n");
		System.out.print("반복할 횟수를 입력하세요 : ");
		int num = input.nextInt(); // 입력받은 값(=input)을 정수형 변수인 num에 저장
		double pi = 0; //실수형 변수 pi로 지정하고, 0으로 초기화 선언
		int sw = 1; // 부호 변환을 위해 정수형 변수 sw 선언
		
		for(int i=1; i<=num; i++) { // 반복한 횟수 만큼 실행
			pi = pi + (double)(4 / ((double)(2*i)-1) * (sw)); // pi값에 무한수열 공식을 대입하여 누적으로 더하기
			sw = -sw; // 부호 변환하여 짝수번째 항마다 음수로 변환
		}
		
		System.out.println("원주율 : " + pi); // 최종 값 출력
		
		input.close(); // input을 닫아주어 입력받는 값 끝내기

	}

}
