package encasulation;

public class CollegeDetails {

	public static void main(String args[]) {
		
		Student aisha=new Student();
		aisha.setName("Aisha");
		aisha.setId(530);
		aisha.setClassStudy("ECE");
		Student sameera=new Student();
		sameera.setClassStudy("CSE");
		sameera.setId(528);
		sameera.setName("sameera");
		Student vishal=new Student();
		vishal.setClassStudy("EEE");
		vishal.setId(521);
		vishal.setName("vishal");
		Student ajay=new Student();
		ajay.setClassStudy("MECH");
		ajay.setId(520);
		ajay.setName("ajay");
		System.out.println(aisha.getClassStudy()+" "+aisha.getId()+" "+aisha.getName()+" "+Student.collegeName);
		System.out.println(sameera.getClassStudy()+" "+sameera.getId()+" "+sameera.getName()+" "+Student.collegeName);

		System.out.println(vishal.getClassStudy()+" "+vishal.getId()+" "+vishal.getName()+" "+Student.collegeName);
		System.out.println(ajay.getClassStudy()+" "+ajay.getId()+" "+ajay.getName()+" "+Student.collegeName);

			
	}
}
