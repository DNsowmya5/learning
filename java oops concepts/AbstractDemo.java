abstract class Human
{
		public abstract void eat();

		public void walk()
		{
			
		}
}
class Man extends Human //concret class
{
	public void eat() {
		
	}
}

class Printer
{
	public void show(Number i)//super class for integer float douyble implicitly by jvm in java
	{
		System.out.println(i);
	}
}
public class AbstractDemo {

	public static void main(String[] args) {
		
		//Man obj=new Man();
		Printer obj1=new Printer();
		obj1.show(5.6);

	}

}
