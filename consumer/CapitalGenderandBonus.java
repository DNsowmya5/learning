package consumer;
import java.util.List;
//change gender of each person to upper case
//2. give 1000rupee bonus to each person as new year bonus 
import java.util.function.Consumer;
public class CapitalGenderandBonus {

	public static void main(String[] args) {
		Consumer<List<Person>> printConsumer = list -> list.forEach(System.out::println);
	//accept(printConsumer);

		Consumer <Person> c1=(per)->System.out.println(per);
		Consumer <Person> c2=(per)->System.out.println(per.getGender().toUpperCase());

	}

}
