package sec07;

public class Array03Param {

	public static void main(String[] args) {

		int[] intArr = { 80, 75, 90 };

		// 평균을 구해주는 메소드 호출
		double avg = getSum(intArr); // 인자(argument)로 배열을 전달
		System.out.printf("avg : %.2f", avg);

	}

	// 평균을 구해주는 메소드 ( double : 반환 타입 )
	public static double getSum(int[] arr) {// 매개변수가 배열타입
		// arr만 적어서 사용할수없음 무조건 ( int[] arr ) 사용
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
			System.out.println(arr[i]);
		}
		double avg = (double) sum / arr.length;
		// double avg = avg는 double 타입
		return avg; // return = 값을 반환 ( ) avg;
	}
}
