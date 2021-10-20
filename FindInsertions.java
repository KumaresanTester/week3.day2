package week3.day2;


import java.util.Map;
import java.util.TreeMap;

public class FindInsertions {

	public static void main(String[] args) {
		
		String word = "India is My Country";
		
		String lowerCase = word.toLowerCase();
		
		char[] charArray = lowerCase.toCharArray();

		
		Map<Character, Integer> insertion = new TreeMap<Character, Integer>();
		
		for (int i = 0; i < charArray.length; i++) {
			
		if (insertion.containsKey(charArray[i])) {
			insertion.put(charArray[i], insertion.get(charArray[i])+1);
			
		}	
		else {
			insertion.put(charArray[i], 1);
		}
			
		}
		System.out.println(insertion);
				
				
	}

}
