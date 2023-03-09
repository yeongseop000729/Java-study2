package c2;

public class Array09Modify {

	public static void main(String[] args) {
		// 배열 변수 선언과 동시에 배열 생성
		int[] arr1 = new int[3];

		System.out.println();
		// 배열 항목의 값 변경
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;

		// 배열 항목의 값 출력
		for (int i = 0; i < 3; i++) {
			System.out.print("arr1[" + i + "] : " + arr1[i] + ", ");
		}
		System.out.println();

		// String type 배열 변수 선언과 동시에 배열 생성
		String[] arr3 = new String[3];
		System.out.println();
		// 배열 항목의 값 변경
		arr3[0] = "1월";
		arr3[1] = "2월";
		arr3[2] = "3월";

		// 배열 항목의 값 출력
		for (int i = 0; i < 3; i++) {
			System.out.print("arr3[" + i + "] : " + arr3[i] + ", ");
		}
	}
}
