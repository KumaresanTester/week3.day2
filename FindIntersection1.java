package week3.day2;

public class FindIntersection1 {

	public static void main(String[] args) {

		int[] numbers = { 3, 2, 11, 4, 6, 7 };
		int[] numbers2 = { 1, 2, 8, 4, 9, 7 };
		boolean duplicate = false;
		String duplicateNumbers = "";

		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers2.length; j++) {
				if (numbers[i] == numbers2[j]) {
					duplicateNumbers = duplicateNumbers + "," + numbers[i];
					duplicate = true;
				}
			}
		}
		if (duplicate = true) {
			String replaceFirst = duplicateNumbers.replaceFirst(",", "");
			System.out.println("Numbers Available in Second Array " + replaceFirst);
		}
	}
}
