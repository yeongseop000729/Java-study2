package c2;

public class Array19StudentOfMax {

	public static void main(String[] args) {

		//// 기본 데이터를 저장하고 있는 배열
		// 1. 학생명 배열
		String[] names = { "최태원", "이경선", "배준섭", "홍원표", "김성현", "우상현", "심미안" };
		// 2. 성적 배열
		int[] scores = new int[] { 87, 95, 100, 65, 70, 84, 69 };

		int sum = 0; // 총점
		double avg = 0.0; // 평균

		// 총점구함
		for (int i = 0; i < scores.length; i++) {
			sum = sum + scores[i];
		}

		// 평균구함
		avg = (sum * 1.0) / scores.length;

		int max = 0; // 큰수 임시 저장 변수
		String maxName = ""; // 최고 점수의 학생 저장 변수

		// 최고 점수와 최고 점수 학생명 구함
		for (int i = 0; i < scores.length; i++) {
			if (max < scores[i]) { // 임의의 수와 모든 요소를 비교해가면서 큰수 찾기
				max = scores[i];
				maxName = names[i];
			}
		}

		System.out.printf("평균점수는 \" %4.1f점\" \n", avg);
		System.out.printf("최고점은 \"%2d점\" 입니다. \n", max);
		System.out.println("최고 성적은 " + maxName + "님 입니다.");

	}

}
