
// 문제4) 사각형 모양 출력하는 프로그램

public class Lec2Ex4 {

	public static void main(String[] args) {
		
		for(int i=0; i<=5; i++) { // 세로 5줄 만들기
			for(int j=0; j<=10; j++) { // 가로 10줄 만들기
				System.out.print("*"); // 별 찍기
			}
			System.out.println(); // 별이 10개 찍히면 다음 줄로 넘기기 위해 작성
		}
	}

}
