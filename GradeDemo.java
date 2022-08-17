import java.util.Scanner;

public class GradeDemo {

	public static void main(String[] args) {
		//printing the values for grade.. suppose if grade is A, print someting like, good or above 90%, something like that.. try to have 4-5 cases and default block as well 
		
		char grade='A';
		/*System.out.println("Enter Percentage of Student from ");
		Scanner read=new Scanner(System.in);
		percentage=read.nextInt();*/
		switch(grade)
		{
		case 'A':
			System.out.println("It is grade A got 90% and above.");
			break;
		case 'B':
			System.out.println("It is grade B got 75% .");
			break;
		case 'C':
			System.out.println("It is grade A got 60% and above.");
			break;
		case 'D':
			System.out.println("It is grade A got 40% and above.");
			break;
		default:
			System.out.println("Entered wrong grade.");
			break;
		}
	}

}
