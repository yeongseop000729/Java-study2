package sec07;

public class Array0101d {

	public static void main(String[] args) {
		int a = 80;
		int b = 75;
		int c = 90;

		int sum = 0;
		sum = a + b + c;
		// 정수간 나눗셈은 몫이 정수(소숫점 버림) 예방 차원에서 3 -> 3.0으로 double
		double avg = sum / 3.0;
		// double avg = (double)sum / 3;

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

		// 총점
		System.out.println("총점 : " + sum);

		// 평균(81.66666666666667)
		System.out.println("1. 평균 : " + avg);
		System.out.printf("2. 평균 : %.2f \n", avg); // 81.67 ( %.(여기에 숫자를 넣으면 소숫점 몇까지 남기겠다)f) 
		System.out.printf("3. 평균 : " + Math.round(avg * 100) / 100.0); // 81.67
		System.out.println();
		System.out.println(String.format("4. 평균 : %.2f", avg)); // 81.67
		/**
		  81.66666666666667 * 100 
		  Math.round(8166.666666666667) 
		  8167 / 100.0 
		  81.67
		 */

	}
}