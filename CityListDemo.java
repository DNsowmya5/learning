package collections;
import java.util.*;  

public class CityListDemo {

	public static void main(String args[]){  
		ArrayList<String> cityList=new ArrayList<String>();   
		cityList.add("GUNTUR");    
		cityList.add("VIJAYAWADA");    
		cityList.add("ONGOLE");    
		cityList.add("NELLUR"); 
		cityList.add("VISHAKAPATNAM");    
		cityList.add("KARNOOL");    
		cityList.add("NARASARAOPET");    


		System.out.println(cityList);  
		cityList.add(2,"CHILAKALURIPET");
		System.out.println(cityList);  
		cityList.set(0, "HYDERABAD");
		cityList.add(1, "VIJAYAWADA");
		cityList.add(4, "VIJAYAWADA");

		cityList.set(2,"GUNTUR");
		System.out.println(cityList);  
		System.out.println(cityList.contains("nandhayla"));
		cityList.remove("GUNTUR");
		System.out.println(cityList);  
		System.out.println(cityList.indexOf("GUNTUR"));
		System.out.println(cityList.lastIndexOf("VIJAYAWADA"));



		System.out.println(cityList.size());
		System.out.println(cityList.isEmpty());
		ArrayList<String> districtName= new ArrayList<String>();
		districtName.add("HYD");
		districtName.add("NTR");
		districtName.add("PALNADU");
		districtName.add("PRASAM");
		districtName.add("SPSR NELLOR");
		districtName.add("VISHAKAPATNAM");
		districtName.add("KARNOOL");
		districtName.add("PALNADU");
		System.out.println(districtName);  
		cityList.addAll(1, districtName);
		System.out.println(cityList);  

}  
} 
