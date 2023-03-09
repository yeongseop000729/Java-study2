package c2;

public class Array02New {

	public static void main(String[] args) {
		// 합계 변수
		int sum = 0;
		// 배열 변수를 선언과 동시에 초기화함
		int intArr[] = {80, 75, 90};
		// 이런 형태로 초기화 할수도 있음
		intArr[0] = 80;
		intArr[1] = 75;
		intArr[2] = 90;
		
		for (int i = 0; i < intArr.length; i++) {
			sum = sum + intArr[i];
			System.out.println(intArr[i]);

		}
		
		double avg = (double)sum / intArr.length;
		System.out.printf("avg : %.2f", avg);
	}
}
