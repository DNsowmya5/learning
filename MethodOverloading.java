
class A{
	void add()
		{
			int a=10,b=20;
			 int c=a+b;
			System.out.println("Sum="+c);
		}
		void add(int x, int y)
		{
			int z=x+y;
			System.out.println("sum="+z);
		}
}
public class MethodOverloading 
{

	public static void main(String[] args) 
	{
			A method=new A();
			method.add();
			method.add(100,200);
	}

}


