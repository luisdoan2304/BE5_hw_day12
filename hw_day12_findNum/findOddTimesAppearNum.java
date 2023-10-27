package hw_day12_findNum;

public class findOddTimesAppearNum {

	public static void findOddTimesAppearNum(int[] arr) {
		int[] count = new int[1001];

		// Count the occurrences of each number
		for (int i = 0; i < arr.length; i++) {
			count[arr[i]]++;
		}

		// Print numbers with odd occurrences
		for (int i = 1; i < count.length; i++) {
			if (count[i] % 2 != 0) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5, 6, 1, 2, 3, 4, 5, 100, 400, 15, 15, 15, 15, 15, 15, 15, 15 };
		findOddTimesAppearNum(numbers);
	}
}
