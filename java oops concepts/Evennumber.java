
public class Evennumber {

	public static void main(String[] args) {
		
		//printing even numbers from 1 to 10
		for(int i =1; i <= 10; i ++) 
		{
			if(i %2==0) 
				System.out.println(i +" ");

		}
		
		System.out.println("  ------------------------------------------   ");
		//printing numbers from 1 to 10
		
		for(int j=1;j<=10;j++)
		{
			System.out.print(j);
			System.out.print(" ");
		}
		
		
		System.out.println("  ------------------------------------------   ");
		
		
		//printing numbers 10 to 1
		for(int k=10; k>0; k--)
		{
			System.out.print(k);
			System.out.print(" ");
		}
		System.out.println("  ------------------------------------------   ");
		
		
		//printing name
		String name="Syed Aisha // D Naga Sowmya.";
		System.out.println("My name is "+name);
		
		System.out.println("  ------------------------------------------   ");
		//printing numbers using while loop
		int num=0;
		while(num<10)
		{
			System.out.print(num);
			num++;
		}
		System.out.println("  ------------------------------------------   ");
		
		
		//printing numbers using do while
		int x =10;
		do {
		  System.out.println(x);
		  x--;
		}while(x>0); 
			
	}
	

}
