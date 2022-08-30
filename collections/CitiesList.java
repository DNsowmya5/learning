package collections;
import java.util.*;

public class CitiesList {
	public static void main(String[] args) {

		String[] strArray = {"Delhi", "Mumbai", "Kolkata", "Chennai","Cargo"};
		List<String> mylist = Arrays.asList(strArray);
		System.out.println("cities list:");
		for(String val : mylist){
			System.out.print(val + " ");
		}
		System.out.println("\n");
		List<String> arrayList = new ArrayList<>(Arrays.asList(strArray));
		System.out.println("new list:");
		arrayList.add("Punne");
		for(String val : arrayList){
			System.out.print(val + " ");
		}
		System.out.println("\n");
		List<String> citylist = Arrays.asList("Delhi", "Mumbai", "Kolkata", "Chennai","Cargo");
		System.out.println("Contents of citylist using streams:");
		citylist.stream().forEach(S ->System.out.print(S + " "));
	}
}
