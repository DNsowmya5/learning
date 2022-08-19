//certain frame works thay work only with wrraper classes
//api 
public class WrraperDemo {

	public static void main(String[] args) {
		
		int i=5;// primitive datatype
		Integer ii=new Integer(i);// boxing wrraping
		int j=ii.intValue();// unboxing un wrraping
		Integer value=i;// Auto boxing
		int k=value;// Auto un boxing
		String str="123";
		int n= Integer.parseInt(str);
		System.out.println(n);

	}

}
