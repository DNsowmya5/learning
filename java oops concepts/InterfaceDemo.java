interface Writer
{
	void write();
}
class Pen implements Writer
{
	public void write()
	{
		System.out.println("Im a pen");
	}
}
class Pencile implements Writer
{
	public void write()
	{
		System.out.println("Im a pencile");
	}
}
class kit
{
	public void doSomthing(Writer p)
	{
		p.write();
	}
}
public class InterfaceDemo {

	public static void main(String[] args) {
		
		//Kit k=new Kit();
		Writer p=new Pen();
		//Writer pc= new Pencile();
		//k.doSomthing(pc);
		p.write();
	}

}
