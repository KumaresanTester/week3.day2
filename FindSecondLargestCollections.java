package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargestCollections {

	public static void main(String[] args) {

		int[] data = { 3, 2, 11, 4, 6, 7 };

		List<Integer> num = new ArrayList<Integer>();

		for (int i = 0; i < data.length; i++) {
			num.add(data[i]);
		}

		Collections.sort(num);
		System.out.println("Second Largest Number is "+num.get(num.size() - 2));
	}
}
