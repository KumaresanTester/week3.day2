package week3.day2;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {

		int[] arr = { 14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20 };

		int arrlength = arr.length;
		String duplicateNum = "";
		for (int i = 0; i < arrlength; i++) {
			for (int j = i + 1; j < arrlength; j++) {
				if (arr[i] == arr[j]) {
					duplicateNum = duplicateNum + "," + arr[i];
				}
			}
		}
		String duplicateNumbers = duplicateNum.replaceFirst(",", "");
		System.out.println("Duplicate Numbers in Array is " + duplicateNumbers);
	}
}
