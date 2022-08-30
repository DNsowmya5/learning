package Training_Programs;

public class BestFriend extends Friend
	{
	public void toEat() {
		//super.toEat();	

		System.out.println("Which iteam is selected from BEST FRIEND class");
	}
	public void vegg() {
		//super.vegg();
		System.out.println("VEGG food is available");

	}
	public void nonvegg() {
		System.out.println("NON VEGG is available");

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BestFriend select=new BestFriend();
			select.toEat();
			select.vegg();
			select.nonvegg();
	}

}
