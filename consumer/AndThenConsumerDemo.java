package consumer;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;


public class AndThenConsumerDemo {

	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student(1, 20, "Ajay"));
		studentList.add(new Student(2, 30, "Vishal"));
		studentList.add(new Student(3, 45, "Sowmya"));
		studentList.add(new Student(4, 60, "Sameera"));
		Consumer<List<Student>> addMarksConsumer = list ->{
			for (int i = 0; i < list.size(); i++)
				list.get(i).setMark(list.get(i).getMark() + 20);
		};
		Consumer<List<Student>> printConsumer = list -> list.forEach(System.out::println);
		addMarksConsumer.andThen(printConsumer).accept(studentList);
	}
}