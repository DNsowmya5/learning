package interfaceprograms;
interface interfaces{
	public void add(int a, int b);
	default void show() {
		System.out.println(" this is default Method Executed");
	}
}
public class TestInterfaceDemo implements interfaces {
	public void add(int a, int b){
		System.out.println(a+b);
	}
	public static void main(String args[]){
		TestInterfaceDemo data  = new TestInterfaceDemo();
		data.add(40,80);
		data.show();
	}
}


