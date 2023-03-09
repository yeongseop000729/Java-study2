package c2;

public class Array21SelectionSort {

	public static void main(String[] args) {

		/**
		 * [선택정렬] 내림차순 정렬
		 */
		int[] age = null;
		int small = 0;
		age = new int[] { 1, 3, 2, 5, 4 };

		for (int i = 0; i < age.length - 1; i++) {
			for (int j = i + 1; j < age.length; j++) {
				if (age[i] < age[j]) {
					small = age[i];
					age[i] = age[j];
					age[j] = small;
				}
			}
		}

		for (int i : age) {
			System.out.print(i + "\t");
		}

	}

}
