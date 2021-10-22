package week3.day2;

import java.util.Set;
import java.util.TreeSet;

public class MissingElementInAnArrayCollections {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 7, 6, 8 };

		Set<Integer> num = new TreeSet<Integer>();

		for (int i = 0; i < arr.length; i++) {
			num.add(arr[i]);
		}
		for (int i = 1; i <= num.size(); i++) {
			if (!num.contains(i)) {
				System.out.println("Missing Elements in Array is " + i);
			}
		}
	}
}
