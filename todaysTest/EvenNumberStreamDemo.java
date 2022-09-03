package onlineprograms;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumberStreamDemo {
	public static void main(String[] args) {
		System.out.println("list using arraylist");
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(0);
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(5);
		arrayList.add(15);
		arrayList.add(23);
		arrayList.add(57);
		arrayList.add(25);
		arrayList.add(24);
		arrayList.add(29);
		System.out.println(arrayList);
		System.out.println(" using streams finding even no");
		List<Integer> nuberlist = arrayList.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(nuberlist);
		
		List<Integer> sortedList = arrayList.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList);

	}

}
