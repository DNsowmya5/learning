package Training_Programs;


public class EncapsulationDemo {

	public static void main(String[] args) {
		
		Student s1=new Student();
		s1.setRollno(211);;
		s1.setName("naveen");

		Student s2=new Student();
		s2.setRollno(422);;
		s2.setName("Naresh");
		System.out.println(s1.getRollno());
		System.out.println(s1.getName());
		System.out.println(s2.getRollno());
		System.out.println(s2.getName());

	}

}
