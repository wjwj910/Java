
// 문제6) 배열에 담긴 숫자에서 가장 작은 숫자를 찾는 프로그램

public class Lec2Ex6 {

	public static void main(String[] args) {
		
		int s[] = {12, 3, 19, 6, 18, 8, 12, 4, 1,19}; // 배열 선언 후 주어진 값으로 초기화
		
		int min = 0; // 최솟값을 정수형 변수 min으로 선언 후 0으로 초기화
		int i = 0; // 배열 인덱스 번호를 위해 정수형 변수 i 선언 후 0으로 초기화 
		
		while(i < s.length - 1) { // 's.length-1 = 9' 즉, i가 9보다 작을 동안 실행
			if(s[i] <= s[i+1]) { // 배열 안의 값이 다음 번째의 값보다 작거나 같을 때
				min = s[i]; 	 // 배열 값을 min에 저장
			}
			i++; // 인덱스 번호(i) 증가
		}
		System.out.println("배열 s의 최솟값은 " + min + "입니다."); // 결과값 출력
	}

}