package collections;
import java.util.ArrayList;


public class ArrayListDemo {


	public static void main(String[] args){
		ArrayList<String> foodList = new ArrayList<String>();
		
		foodList.add("dosa");
		foodList.add("vada");
		foodList.add("idli");
		foodList.add("poori");
		foodList.add("bonda");
		foodList.add("idli");
		
		foodList.add(null);
		foodList.add("idli");
		foodList.iterator();
		System.out.println(foodList);
		foodList.remove("bonda");
		System.out.println(foodList.size());
		
		System.out.println(foodList.contains("coffee"));
//		foodList.clear();
		System.out.println(foodList.isEmpty());
		foodList.add(2,"coffee");
		
		System.out.println(foodList);
		System.out.println(foodList.get(3));
		System.out.println(foodList.indexOf("idli"));
		System.out.println(foodList.lastIndexOf("idli"));
		
		
		System.out.println(foodList);

		System.out.println(foodList.subList(2, 5));
		foodList.set(0, "masala dosa");
		
		System.out.println(foodList);
		ArrayList<String> snackList = new ArrayList<String>();
		snackList.add("pizza");
		snackList.add("puthraikalu");
		snackList.add("burger");
		snackList.add("punugulu");
		
		foodList.addAll(2, snackList);
		
		System.out.println(foodList);
	}

}