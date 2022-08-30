interface Abcd
{
	void show();
}
class Efgh implements Abcd
{
	public void show()
	{
		System.out.println("anythoing");
	}
}
public class InterfaceAnonymous {

	public static void main(String[] args) {
		Abcd obj = new Abcd()
				{
					public void show()
						{
						System.out.println("i am the best from interface Anonymous class");
		
						}
				};
		obj.show();
	}

}
