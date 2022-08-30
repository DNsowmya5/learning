package collections;
import java.util.*;    

public class SortingAge {
	   
		public static void main(String args[]){    
		ArrayList<Student> al=new ArrayList<Student>();    
		al.add(new Student(101,"Vishal",23));    
		al.add(new Student(106,"Ajay",25));    
		al.add(new Student(105,"Sameera",22));    
		al.add(new Student(108,"Aisha",24));    

		    
		Collections.sort(al);    
		for(Student st:al){    
		System.out.println(st.rollno+" "+st.name+" "+st.age);    
		}    
		}    

}
