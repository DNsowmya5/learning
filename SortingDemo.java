package collections;
import java.util.ArrayList;
import java.util.Collections;
public class SortingDemo {

	public static void main(String[] args) {
		ArrayList<Integer> myNumbers = new ArrayList<Integer>();
		myNumbers.add(33);
		myNumbers.add(15);
		myNumbers.add(20);
		myNumbers.add(34);
		myNumbers.add(8);
		myNumbers.add(12);
		myNumbers.add(12);
		myNumbers.add(102);
		myNumbers.add(512);
		myNumbers.add(192);
		myNumbers.add(712);


		Collections.sort(myNumbers);  

		for (int i : myNumbers) {
			System.out.print(" "+i);
		}
		System.out.println("    ");

		
		
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		Collections.sort(cars);  
		for (String i : cars) {
			System.out.print(" "+i);
		}
	}
}