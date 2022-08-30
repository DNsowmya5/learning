package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class streamsDemo {
    public static void main(String[] args) {
    	System.out.println("list using arraylist");

ArrayList<Integer> arrayList = new ArrayList<Integer>();
arrayList.add(0);
arrayList.add(10);
arrayList.add(20);
arrayList.add(5);
arrayList.add(15);
arrayList.add(25);
arrayList.add(57);

System.out.println(arrayList);
System.out.println(" using list finding even no");

List<Integer> list = new ArrayList<Integer>();
for(Integer i:arrayList){
	if(i%2 == 0)
	list.add(i);
}
		System.out.println(list);
		System.out.println("finding even no by using streams");

		List<Integer> lists = arrayList.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(lists);
		List<Integer> incList = arrayList.stream().map(i-> i+5).collect(Collectors.toList());
		System.out.println(incList);
		
		long noOfEvenInteger = arrayList.stream().filter(i-> i%2==0).count();
		System.out.println(noOfEvenInteger);


    }
}