package sec07;

public class Array12AdvancedFor {

	public static void main(String[] args) {
		// 배열 변수 선언과 배열 생성
		int[] scores = { 95, 71, 84, 93, 87 };
		// 배열 항목 전체 합 구하기
		int sum = 0;
		for (int score : scores) { // scores = 배열 
			sum = sum + score;
//			sum += score; <------이것도 사용하긴 함
		}
		System.out.println("점수 총합 = " + sum);
		// 배열 항목 전체 평균 구하기
		double avg = (double) sum / scores.length;
//      소숫점을 구하기 위해 형변환 (double) 캐스팅
		System.out.println("점수 평균 = " + avg);
	}
}
