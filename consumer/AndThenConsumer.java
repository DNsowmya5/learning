package consumer;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
public class AndThenConsumer {
		    public static void main(String args[]){
	        Consumer<List<Integer> > modify = list ->{for (int i = 0; i < list.size(); i++)list.set(i, 2* list.get(i));};
	        Consumer<List<Integer> > dispList = list -> list.stream().forEach(a -> System.out.println(a + " "));
	        List<Integer> list = new ArrayList<Integer>();
	        list.add(28);
	        list.add(17);
	        list.add(34);
	        modify.andThen(dispList).accept(list);
	        Consumer<List<String> > modifys = line ->line.stream().forEach(a->System.out.println(" \" "+a+" \" "));

	        List<String> line = new ArrayList<String>();
	        line.add("Ajay");
	        line.add("vishal");
	        line.add("Sameera");
	        modifys.accept(line);
	    }
}