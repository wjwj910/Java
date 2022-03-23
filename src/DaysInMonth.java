import java.util.Scanner;

public class DaysInMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month;
		int days = 0;
		
		System.out.print("일 수를 알고 싶은 월을 입력하세요 : ");
		Scanner input = new Scanner(System.in);
		
		month = input.nextInt();
		
		switch (month) {
		case 4:
		case 6:
		case 9:
		case 11:
			days = 30;
			break;
		case 2:
			days = 28;
			break;
		default:
			days = 31;
			break;
		}
		System.out.println(month + "월의 일 수는 " + days + "일 입니다.");
	}

}
