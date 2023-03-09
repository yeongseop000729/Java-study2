package class26.exam05;

/**
 * 계산기 클래스
 * - 오버로딩 메소드에 파라미터로 배열을 전달받아서 +10해서 배열 반환해줌
 */

public class Calcu04 {
	
	// [오버로딩 메소드] 파라미터에 전달된 int 배열의 요소에 +10 반환
	public int[] tenPlus(int[] arr) {
		arr[0] = arr[0] + 10;
		arr[1] = arr[1] + 10;
		arr[2] = arr[2] + 10;
		arr[3] = arr[3] + 10;
		arr[4] = arr[4] + 10;
		return arr;
	}

	// [오버로딩 메소드] 파라미터에 전달된 double 배열의 요소에 +10 반환
	public double[] tenPlus(double[] arr) {
		arr[0] = arr[0] + 10;
		arr[1] = arr[1] + 10;
		arr[2] = arr[2] + 10;
		arr[3] = arr[3] + 10;
		arr[4] = arr[4] + 10;
		return arr;
	}
	
}
