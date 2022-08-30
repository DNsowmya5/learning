import java.util.Scanner;

public class EvenNumberCheck
{
    public static void main(String[] args)
    {
    	int num;
        @SuppressWarnings("resource")
		Scanner read = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        num = read.nextInt();
        if(isEven(num))
        {
            System.out.println("Number is even");
        }
        else
        {
            System.out.println("Number is odd");
        }    
    }

    public static boolean isEven(int number)
    {
        if(number % 2 == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
