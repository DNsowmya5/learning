package consumer;
import java.util.List;
import java.util.function.Consumer;
public class ConsumerPersonExample {

	static Consumer<Person> c1 = (per)-> System.out.println(per);
	static Consumer<Person> c2 = (per)-> System.out.println(per.getName().toUpperCase());
	static Consumer<Person> c3 = (per)-> System.out.println(per.getGender().toUpperCase());

	static List<Person> personList = PersonRepository.getAllPersons();
	public static void main(String[] args) {
		personList.forEach(c1);
		printWithCondition();
	}
	public static void printWithCondition() {
		personList.forEach(per ->{
			if(per.getGender() == "Male" && per.getHeight()>= 140) {
				c1.andThen(c2).accept(per);
			}
		});
	}

}

