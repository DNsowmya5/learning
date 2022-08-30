import java.util.Scanner;
public class SumOfNumbers {

	public static void main(String[] args)throws Exception {
		  
		
		int num1=111, num2=222;  
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);  
		System.out.print("Enter the first number: ");  
		num1 = scan.nextInt();  
		System.out.print("Enter the second number: ");  
		num2 = scan.nextInt(); 
		SumOfNumbers summer=new SumOfNumbers();
		summer.getTotal(num1, num2); 
		
		System.out.println("The sum of two numbers is: " + summer);  
		}  
		//method that calculates the sum  
		public  int getTotal(int a, int b)  
		{  
		int sum = a + b;  
		return sum;  
		
	}

		
}
