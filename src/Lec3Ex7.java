
// 문제7) 순차탐색 알고리즘 프로그램

import java.util.Scanner; // Scanner 클래스를 사용

public class Lec3Ex7 {

	public static void main(String[] args) {
		
		int s[] = {0, 11, 18, 29, 35, 49, 62, 68, 73, 88, 100}; // 배열 선언 후 주어진 값으로 초기화

		Scanner input = new Scanner(System.in); // 입력받는 값을 input이라는 변수로 지정
		
		System.out.print("정수 값을 입력하세요 : ");
		int num = input.nextInt(); // 입력받은 값(=input)을 정수형 변수인 num에 저장
		
		for(int i=0; i<s.length; i++) { // 배열의 크기보다 작을 때까지 즉, i가 0부터10까지
			if(num == s[i]) { // 입력한 값과 배열 안의 값이 일치 할 경우
				System.out.println("입력하는 값은 " + s[i] + "와 같은 값입니다.");
				break; // break문을 사용하여 조건문 빠져나오기
			}
			
			if(num < s[i]) { // 입력한 값이 배열 s[i]보다 작을 경우 실행
				if(num > s[i-1]) { // 입력한 값이 배열 s[i-1]보다 클 경우 실행
				System.out.println(num + "은 " + s[i-1] + "보다 크고 " + s[i] + "보다 작습니다.");
				break; // break문을 사용하여 조건문 빠져나오기
				}
			}
			
		}
		input.close(); // input을 닫아주어 입력받는 값 끝내기
	}

}