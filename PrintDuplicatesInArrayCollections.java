package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintDuplicatesInArrayCollections {

	public static void main(String[] args) {
		int[] arr = { 14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20 };
		Set<Integer> dup = new LinkedHashSet<Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (!dup.add(arr[i])) {
				System.out.println("Duplicate Arrays are " + arr[i]);
			}
		}
	}
}
