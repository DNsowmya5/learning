import java.util.Scanner;
public class CharVowelCheckDemo {




    public static void main(String[] args)
    {
    	int count = 0;
    	String sentence;
    	@SuppressWarnings("resource")
		Scanner read = new Scanner(System.in);       
        System.out.print("Enter the sentance: ");
        sentence = read.nextLine();      
        for(int i = 0; i < sentence.length(); i++)
        {
            if(isVowel(sentence.charAt(i)))
            {
                count++;
            }
        }
        
        System.out.println("Number of vowels in the sentance are: " + count);    
    }

    public static boolean isVowel(char letter)
    {
        switch(letter)
        {
            case 'a':
            case 'A':
            case 'e':
            case 'E':
            case 'i':
            case 'I':
            case 'o':
            case 'O':
            case 'u':
            case 'U':
                return true;
     
            default:
                return false;
        }
    }
}
