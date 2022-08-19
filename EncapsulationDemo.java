class Student
{
	private int rollno;
	private String name;
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
public class EncapsulationDemo {

	public static void main(String[] args) {
		
		Student s1=new Student();
		s1.setRollno(2);;
		s1.setName("naveen");

		Student s2=new Student();
		s2.setRollno(4);;
		s2.setName("Narewsh");
		System.out.println(s1.getRollno());
		System.out.println(s1.getName());
		System.out.println(s2.getRollno());
		System.out.println(s2.getName());

	}

}
