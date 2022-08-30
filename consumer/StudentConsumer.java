package consumer;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class StudentConsumer {

	public static void main(String[] args) {

		      List<Student> studentList = new ArrayList<Student>();
		      studentList.add(new Student(1, 45, "Ajay"));
		      studentList.add(new Student(2, 65, "Vishal"));
		      studentList.add(new Student(3, 80, "Sowmya"));
		      studentList.add(new Student(4, 20, "Sameera"));
		      Consumer<String> capsConsumer = name -> System.out.println(" "+name.toUpperCase());
		      studentList.stream().map(Student -> ((consumer.Student) Student).getName()).forEach(capsConsumer);
		   }
	}