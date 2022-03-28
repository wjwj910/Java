
// 문제2) 양의 정수를 입력 받아서 그 정수의 모든 약수를 출력하는 프로그램

import java.util.Scanner; // Scanner 클래스를 사용

public class Lec3Ex2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); // 입력받는 값을 input이라는 변수로 지정
		
		System.out.print("양의 정수를 입력하시오: ");
		int num = input.nextInt(); // 입력받은 값(=input)을 정수형 변수인 num에 저장
		
		System.out.println(num + "의 약수는 다음과 같습니다.");
		
		for(int i=1; i<=num; i++) {
			if((num%i) == 0) { // 입력한 값을 1부터 나누었을 때 0이라면 약수
				System.out.print(i + " "); // 약수 출력하기
			}			
		}
		
		input.close(); // input을 닫아주어 입력받는 값 끝내기
	}
}
