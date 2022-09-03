package onlineprograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//String  languages = "marati hindi english telugu hindi japanese  telugu"; Find the count of each words
public class CountingStrings {
	public static void main(String args[]) {
		//String languages = "marati hindi english telugu hindi japanese telugu";
		List<String> languages = new ArrayList<String>();
		languages.add("marati");
		languages.add("hindi");
		languages.add("english");
		languages.add("telugu");
		languages.add("hindi");
		languages.add("japanese");
		languages.add("telugu");
		Set<String> unique = new HashSet<String>(languages);
		for (String key : unique) {
		    System.out.println(key + ": " + Collections.frequency(languages, key));
	}
	}
}
