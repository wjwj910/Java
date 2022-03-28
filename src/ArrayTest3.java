
public class ArrayTest3 { //다시 작성

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] s = new int [10];
		for(int i = 0; i < s.length; i++) {
			s[i] = 0; // 배열 초기화
		}
		
		for(int i = 2; i < s.length;i++) {
			s[i+1] = s[i] + 10;
		}
		for(int i=0;i<s.length;i++) {
			System.out.print(s[i] + "");
		}
	}

}
