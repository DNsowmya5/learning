interface Abc
{
	void show();
}
class Implentor implements Abc
{
	public void show()
	{
		System.out.println("anythoing");
	}
}
public class InterfaceDemos {

	public static void main(String[] args) {
		
		Abc obj= new Implentor();
		obj.show();

	}

}
