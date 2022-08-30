package interfaceprograms;
interface Scanable{
	static void scan() {
		System.out.println("Scanning the file from the interface called by static method without obj of the cl");
	}
	default void scaner() {
		System.out.println("Scanning the page from interface by default method with obj reference of the class");
	}
	void getData();
}

public class StaticInterfaceDemo implements Scanable {

	public void getData() {
		System.out.println("This is the new feature added in  Java 8 Interface");
	}

	public static void main(String[] args){  

		StaticInterfaceDemo demo = new StaticInterfaceDemo();
		Scanable.scan();
		demo.scaner();
		demo.getData();

	}

}