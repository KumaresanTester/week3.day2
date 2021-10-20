package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String companyName = "PayPal India";
		char[] charArray = companyName.toCharArray();
		Set<Character> charSet = new LinkedHashSet<Character>();
		Set<Character> dupCharSet = new LinkedHashSet<Character>();
		for (int i = 0; i < charArray.length; i++) {
			if (!charSet.contains(charArray[i])) {
				charSet.add(charArray[i]);
			} else {
				dupCharSet.add(charArray[i]);
			}
		}
		charSet.removeAll(dupCharSet);
		for (Character characters : charSet) {
			if (characters != ' ') {
				System.out.println(characters);
			}
		}
	}
}
