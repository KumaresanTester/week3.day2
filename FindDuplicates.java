package week3.day2;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicates {

	public static void main(String[] args) {

		int[] num = { 10, 24, 32,32, 64, 85, 37, 12, 100 };

		boolean duplicate = false;

		Set<Integer> nums = new HashSet<Integer>();

		for (int i = 0; i < num.length; i++) {

			if (!nums.add(num[i])) {

				System.out.println("Duplicate Value is " + num[i]);
				duplicate = true;
			}
		}
		if (duplicate == true) {
			System.out.println("We have Duplicate in this Array");
		}
		else {
			System.out.println("We have Unique numbers in Array");
		}
	}
}
