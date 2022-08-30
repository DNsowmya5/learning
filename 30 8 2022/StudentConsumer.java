package consumer;
import java.util.ArrayList;
 
   
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;


public class StudentConsumer {
	static void ShowDetails(Map<Integer, String> studentList, String mapName){  
        System.out.println("----------"+mapName+" records-----------");  
        studentList.forEach((key, val)->System.out.println(key+" "+val));  
	}

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		      List<Student> studentList = new ArrayList<Student>();
		      studentList.add(new Student(1, 45, "Ajay"));
		      studentList.add(new Student(2, 65, "Vishal"));
		      studentList.add(new Student(3, 80, "Sowmya"));
		      studentList.add(new Student(4, 20, "Sameera"));
		      Consumer<Integer> capsConsumer = id -> System.out.println(" "+id);
		      studentList.stream().map(Student -> ((consumer.Student) Student).getId()).forEach(capsConsumer);
		      BiConsumer<Map<Integer, String>, String> biCon = StudentConsumer::ShowDetails;  
		        //biCon.accept((Map<Integer.gertId(), String.getName()>) studentList, "Student");  		     

	}
	}