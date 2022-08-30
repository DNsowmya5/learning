class Anony 
{
	public void show()
	{
		System.out.println(" in Anony show");
	}
}
public class AnonymousExample {

	public static void main(String[] args) {
		
		Anony obj = new Anony()
				{
					public void show()
					{
						System.out.println("i am the best from Anonymous class");
				
					}
				};
				obj.show();
	}

}
