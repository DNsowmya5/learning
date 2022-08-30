package strings;

public class CharecterCounter {
		public static void main(String[] args) {
			String name ="aishasowmya";	
			int[] count = new int[200];
			int len = name.length();
			for (int initial = 0; initial < len; initial++) 
				count[name.charAt(initial)]++;
			char ch[] = new char[name.length()];
			for (int counts = 0; counts < len; counts++) {
				ch[counts] = name.charAt(counts);
				int find = 0;
				for (int finds = 0; finds <= counts; finds++) {
					if (name.charAt(counts) == ch[finds])
						find++;
				}
				if (find == 1)
					System.out.println("Number of Occurrence's of "+ name.charAt(counts)+" is:" + count[name.charAt(counts)]);
			}
			}
}
