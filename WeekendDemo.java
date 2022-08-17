import java.util.Scanner;

public class WeekendDemo {

	public static void main(String[] args) {
		// if it's saturday or sunday, i have to print it's weekend
    // if it's other days, i have to print, it's weekday 
		
		int day;
		System.out.println("Enter code of the day from 1 to 7 1:Monday 2:Tuesday 3:Wednesday 4:Thrusday 5:Friday 6:Saturday 7:sunday1");
		Scanner read=new Scanner(System.in);
		day=read.nextInt();
		switch(day)
		{
		case 7:
			System.out.println("Sunday is weekend day");
			break;
		case 1:
			System.out.println("Monday is working day");
			break;
		case 2:
			System.out.println("Tuesday is working day");
			break;
		case 3:
			System.out.println("Wednesday is working day");
			break;
		case 4:
			System.out.println("Thrusday is working day");
			break;
		case 5:
			System.out.println("Friday is working day");
			break;
		case 6:
			System.out.println("Saturday is weekend day");
			break;
		default:
			System.out.println("Entered number is wrong code of day");
			break;
			
	}

	}

}
