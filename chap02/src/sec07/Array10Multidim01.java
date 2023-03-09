package sec07;

public class Array10Multidim01 {
	public static void main(String[] args) {
		// 각 반의 학생 수가 3명으로 동일할 경우 점수 저장을 위한 2차원 배열 생성
		int[][] mathScores = new int[2][3];
//                                   반  학생수
		
//        mathScore = {{1,2,3}, {4,5,6} }
//           학교                  1반             2반
//                  학생: 3명             3명

		// 배열 항목 값 변경
//	             1반
		mathScores[0][0] = 80;
		mathScores[0][1] = 83;
		mathScores[0][2] = 85;
		
//		         2반
		mathScores[1][0] = 86;
		mathScores[1][1] = 90;
		mathScores[1][2] = 92;

		// 전체 학생의 수학 평균 구하기
		int totalStudent = 0;
		int totalMathSum = 0;

		for (int i = 0; i < mathScores.length; i++) {         // 반의 수만큼 반복
//                                           i++ = 반
			totalStudent += mathScores[i].length;             // 반의 학생수 합산
//           totalStudent = 3명
			for (int k = 0; k < mathScores[i].length; k++) {  // 해당 반의 학생수만큼 반복
				totalMathSum += mathScores[i][k];             // 학생 점수 합산
			}
		}
		double totalMathAvg = (double) totalMathSum / totalStudent;
		System.out.println("전체 학생의 수학 평균 점수: " + totalMathAvg);
		System.out.println();
		
	}
}
