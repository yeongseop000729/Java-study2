package sec07;

/**
 * 최대값 찾기 - 출력결과 : 제일 큰수는 : 50
 */

public class Array13MaxValue {

	public static void main(String[] args) {

		// 1. 배열 사용전
		int a = 10;
		int b = 20;
		int c = 30;
		int d = 40;
		int e = 50;

		int max = 0; // 임시 보관 변수
		if (a > max)
			max = a;
		if (b > max)
			max = b;
		if (c > max)
			max = c;
		if (d > max)
			max = d;
		if (e > max)
			max = e;
		System.out.println("제일 큰수는 : " + max);

		// 2. 배열 사용
		max = 0; // max 초기화
		int[] arr = new int[5];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		// max 초기화 향상된 for문
		for (int ar : arr) {
			if (ar > max) {
				max = ar;
			}
		}
		System.out.println("향상된 for문 제일 큰수는 : " + max);
		
		// max 초기화 일반 for문
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max)
				max = arr[i];
		}
		System.out.println("제일 큰수는[배열사용] : " + max);
	}
}
