
	public class Pizza extends Food
	{
		int codeofpizza;
		int cost;
		String typeofpizza;
		boolean status;
		public void vegPizza(int code, String type, int cost, boolean a) {
			System.out.println("....................................................");
		
			System.out.println("It is a VEG PIZZA counter");
				System.out.println("code of the veg pizza is:"+code);
				System.out.println("Here the type of the food is:"+type);
				System.out.println("Cost of the food is:"+cost);
				System.out.println("Does the counter is available yes or no"+a);			
				System.out.println("....................................................");

		}
		
		public void nonVegPizza(int code, String type, int cost, boolean a) {
			System.out.println("....................................................");

			System.out.println("It is a NONVEG PIZZA counter");
			System.out.println("code of the non veg pizza is:"+code);
			System.out.println("Here the type of the food is:"+type);
			System.out.println("Cost of the food is:"+cost);
			System.out.println("Does the counter is available yes or no"+a);
			System.out.println("....................................................");
		}

		
		
		
	}
	


