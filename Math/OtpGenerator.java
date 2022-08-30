package Math;
import java.util.*;
public class OtpGenerator {
	public static void main(String[] args){
        int length = 4;
        System.out.println(OTP(length));
    }
	    static char[] OTP(int len){
	        System.out.println("It is a OTP generator by using random() : ");
	        System.out.print("Your OTP is : ");
	        String numbers = "0123456789";
	        Random rndm_method = new Random();
	        char[] otp = new char[len];
	        for (int i = 0; i < len; i++){
	            otp[i]=numbers.charAt(rndm_method.nextInt(numbers.length()));
	        }
	        return otp;
	    }
}
