package sec07;

public class Array14Copy {

	public static void main(String[] args) {
		// 길이 3인 배열
		int[] arr1 = { 1, 2, 3, 4, 5 };

		// 길이 5인 배열을 새로 생성
		int[] arr2 = new int[5];

		// 배열 항목 복사
		// arr1 -> arr2 복사
		for (int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}

		// 배열 항목 출력
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i] + ", ");
		}
	}

}
