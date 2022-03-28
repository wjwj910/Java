
// 문제3) 1에서 1000 사이의 정수 중 소수를 출력하는 프로그램

public class Lec3Ex3 {

	public static void main(String[] args) {
		
		System.out.println("1에서 1000 사이의 정수 중 소수를 출력합니다.");
		int count = 0; // 카운트하기 위해 정수형 변수로 count 선언 후 0으로 초기화
		
		for(int i=2; i<=1000; i++) { // 1은 소수가 아니므로 2부터 선언, 1000까지 실행
			for(int j=2; j<=1000; j++) { // 나누기 위해 j를 선언 후, 2로 초기화
				if(i%j == 0) // 나누어진다면 소수가 아니므로
					count++; // 카운트 증가
			}
			
			if(count==1) { // 소수는 1과 자기자신으로만 나눠지므로 자기자신으로 한번만 나눠질때 소수
				System.out.print(i + " "); // 출력
			}
			count = 0; // 다시 카운트 하기위해 0으로 초기화
		}			
	}

}
