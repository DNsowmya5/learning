
public class InheritanceDemo {

	public static void main(String[] args) {
		
		Pizza menu=new Pizza();
		menu.vegFood(1, "VEG", 100, false);
		menu.nonVegFood(2, "NonVEG", 500, true);
		menu.zunkFood(3, "ZUNK", 150, true);
		menu.solidFood(4, "SOLID", 200, false);
		menu.vegPizza(5, "VEG PIZZA", 300, true);
		menu.nonVegPizza(6, "NON VEG PIZZA", 500,true);


	}

}
