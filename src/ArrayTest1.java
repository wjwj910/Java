
public class ArrayTest1 { //예제를 변형하여 감소식으로 만듦

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]s = new int [10];
		
		for(int i = 0; i < s.length; i++) {
			s[i] = 9 - i;
		}
		for(int i=0;i<s.length;i++) {
			System.out.print(s[i] + "");
		}
	}

}