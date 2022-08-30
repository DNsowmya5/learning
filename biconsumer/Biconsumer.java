package biconsumer;
import java.util.function.BiConsumer;  
import java.util.HashMap;  
import java.util.Map;  

    public class Biconsumer {
    public static void main(String[] args) {  
        Map<Integer, String> map = new HashMap<Integer,String>();  
        map.put(100, "Ajay");  
        map.put(110, "Sameera");  
        map.put(115, "Vishal");  
        map.put(120, "DNsowmya");  
        BiConsumer<Map<Integer, String>, String> biCon = BiConsumerInterfaceExample::ShowDetails;  
        biCon.accept(map, "Student");  
    }  
    public class BiConsumerInterfaceExample {  
        static void ShowDetails(Map<Integer, String> map, String mapName){  
            System.out.println("----------"+mapName+" records-----------");  
            map.forEach((key, val)->System.out.println(key+" "+val));  
        }  
    }
}