package week3.day2;

public class RemoveDuplicates2 {

	public static void main(String[] args) {

		String text = "We learn java basics as part of java sessions in java week1";

		int count = 0;

		String[] splitArray = text.split(" ");

		for (int i = 0; i < splitArray.length; i++) {
			count = 0;
			for (int j = i + 1; j < splitArray.length; j++) {
				if (splitArray[i].equalsIgnoreCase(splitArray[j])) {
					count++;
					if (count >= 1) {
						splitArray[j] = "";
					}
				}
			}
		}
		for (String sentence : splitArray) {
			System.out.print(sentence + " ");
		}

	}
}
