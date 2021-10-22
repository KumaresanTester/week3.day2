package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDulicatesCollection {

	public static void main(String[] args) {

		String text = "We learn java basics as part of java sessions in java week1";

		String[] splitArray = text.split(" ");

		Set<String> str = new LinkedHashSet<String>();

		for (int i = 0; i < splitArray.length; i++) {
			str.add(splitArray[i]);
		}
		System.out.println(str);
	}
}
