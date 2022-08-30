
public class ConditionDemo {

	public static void main(String[] args) {
		//Example for ternary condition if age is >18 u can vote age<18 u canot vote.
		int age=10;
		String result=(age>18)?"yes u can vote":"You can not vote";
		System.out.println(result);
		
		
		//Exam[ple for for loop to say hi team for 5 time
		for(int i=0;i<5; i++)
		{
			System.out.println("Hi team");
		}
		
		
		//Example to know how operators +,++,-,-- works
		int a=9;
		System.out.println("a value is :"+a);
		int b=(-a);
		System.out.println("-a value is :"+b);
		int d=(+a);
		System.out.println("+a value is :"+d);
		int c=a++;
		System.out.println("the value of a++ is :"+c);
		System.out.println("After a++ Present a value is "+a);
		System.out.println("the value  of a-- is :"+(a--));
		System.out.println("After a-- Present a value is "+a);
		System.out.println("the value of --a is :"+(--a));
		System.out.println("After --a Present a value is "+a);
		System.out.println("the  value of ++a is :"+(++a));
		System.out.println("After ++a Present a value is "+a);
		System.out.println("At final a value is :"+a);
		
		}
}

	
