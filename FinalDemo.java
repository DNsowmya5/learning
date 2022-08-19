final class Ai// no one can Extend
{
	final int DAY;//constant  no one can change
	public Ai()
	{
		DAY=10;
	}
	final public void Show()//no one can over ride
	{
		System.out.println("in show");
	}
}
class B extends Ai
{
	public void Show()
	{
		System.out.println("in B show");
	}
}
public class FinalDemo {

	public static void main(String[] args) {
		
		Ai obj =new Ai();
		System.out.println(obj.DAY);
	}

}
