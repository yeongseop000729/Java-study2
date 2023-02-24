package sec07;

public class Array10MultidimTest {

	public static void main(String[] args) {
		int[][] mathScores = new int[2][3];

		mathScores[0][0] = 80;
		mathScores[0][1] = 83;
		mathScores[0][2] = 85;
		mathScores[1][0] = 86;
		mathScores[1][1] = 90;
		mathScores[1][2] = 92;

		int totalStudent = 0;
		int totalMathSum = 0;

		int count = 0;

		for (int i = 0; i < mathScores.length; i++) {
			for (int j = 0; j < mathScores[i].length; j++) {
				if (mathScores[i][j] >= 90) { // mathScores[i][j] = i와j는 점수
					count = count + 1; 
					System.out.print(mathScores[i][j] + " ");
				}
			}
			System.out.println();
			// System.out.println(); 뺴면 = 80 83 85 86 90 92
			// System.out.println(); 넣으면 = 80 83 85
			// 86 90 92
		}
		System.out.println("count : " + count);
		// System.out.println("90점이상 : " + count + "명"); 면 출력값 = 90점이상 : 2명
	}
}
