interface Demo
{
	void abc();
	default void show()
	{
		System.out.println("i demo show");

	}
}
class DemoImp implements Demo
{
	public void abc()
	{
		System.out.println("in aaaaa");
	}
	public void show()
	{
		Demo.super.show();

		System.out.println("i new show");

	}
}
public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	DemoImp get=new DemoImp();
	get.abc();
	get.show();
		
	}
	

}
