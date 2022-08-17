
public class StringDemo {

	public static void main(String[] args) {
		String message = "That was great - lol.";
		System.out.println(message);
		System.out.println(message.replace("lol", "laugh out loud"));
		
		
		String firstNameCaps = "ALEX";
		String subnme=firstNameCaps.substring(1);
        System.out.println(firstNameCaps);
        System.out.println(firstNameCaps.charAt(0)+subnme.toLowerCase());
                
        String movie = "BIMBISARA";
        String book = "JAVA";
        System.out.println("favorite movie "+movie+" and Favorite Book is "+book);
        
        String animal="CAMEL";
		String food="CHICKEN";
		System.out.println("favorite animal "+animal+" and favorite food is  "+food);
		        
        String name = "Julian";
        String color = "green";
        String food1= "pizza";
        System.out.println("\""+name+"'s favorite color is "+color+" and favorite food is "+food1+".\"");
	
	}


}
