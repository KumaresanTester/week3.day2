package week3.day2;

import java.util.Arrays;

public class MissingElementInArray {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 7, 6, 8 };

		Arrays.sort(arr);
		int numb = 1;
		for (int i = 0; i < arr.length; i++) {
			if (numb != arr[i]) {
				System.out.println("Missing Number is " + numb);
				break;
			} else {
				numb++;
			}
		}
	}
}
