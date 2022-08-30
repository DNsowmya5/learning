package Break;

import java.util.Scanner;

public class WeekendFinder {

	public static void main(String[] args) {
		int day;
		System.out.println("Enter day number in this nu bers 1,2,3,4,5,6,7: ");
		@SuppressWarnings({  "resource" })
		Scanner sc=new Scanner(System.in);
		day=sc.nextInt();
		switch (day) {
		case 1:
			System.out.println("This is monday and it is working day");
			break;
		case 2:
			System.out.println("This is tuesday and it is working day");
			break;
		case 3:
			System.out.println("This is wednesday and it is working day");
			break;
		case 4:
			System.out.println("This is thuresday and it is working day");
			break;
		case 5:
			System.out.println("This is friday and it is working day");
			break;
		case 6:
			System.out.println("This is saturday and it is weekend day");
			break;
		case 7:
			System.out.println("This is sunday and it is weekend day");
			break;
		default:
			System.out.println("invalid number entered enter only 1 2 3 4 5 6 7 any one of this number of days");
		}
	}
}
