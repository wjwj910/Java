
// 실습2번) 문자열이 "www"로 시작하는지 검사하는 프로그램(문자열 비교)

import java.util.Scanner; // Scanner 클래스를 사용

public class StringCompare {
	public static void main(String arg[]) {
		
		String str; // 문자열 변수 str 선언
		Scanner input = new Scanner(System.in); // 입력받는 값을 input이라는 변수로 지정
		
		
		while(true) { // 무한루프문 선언
			System.out.print("문자열을 입력하세요> ");
			str = input.next(); // // 입력받은 값(=input)을 문자열 변수인 str에 저장
			
			if(str.equals("quit") == true) // 입력받은 값이 "quit" 일때
				break;					   // break문 실행하여 빠져나오기

			if(str.startsWith("www")) { 						 // 특정문자로 시작할때 true 값인 startsWith 함수를 사용해 "www"로 시작한다면
				System.out.println(str + " 은 'www'로 시작합니다."); // "www"로 시작한다고 출력
			}
			else {
				System.out.println(str + " 은 'www'로 시작하지 않습니다."); // 그렇지 않을 경우 "www"로 시작하지 않는다고 출력
			}
		}		
		input.close(); // input을 닫아주어 입력받는 값 끝내기
	}
}
