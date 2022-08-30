package collections;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class PrintNamesSizegrater {

	public static void main(String[] args) {
		 LinkedList<String> nameList=new LinkedList<String>();  
		 nameList.add("Syed Aisha");  
		 nameList.add("shaik Sameera");  
		 nameList.add("sai Vishal");  
		 nameList.add("Ajay");
		 List<String> outputList = nameList.stream().filter(a -> a.length()>7).map(a -> a.toUpperCase()).collect(Collectors.toList());
			System.out.println(outputList);
	}

}
