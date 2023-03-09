package c2;

public class GuguDan {

	public static void main(String[] args) {
		
		//          이중 표문

		// 구구단 세로 * 면접에서 자주 나온다 외우기 *
		for (int i = 2; i <= 9; i++) { // 2단 ~ 9단
			System.out.println("[" + i + "]단");
			for (int j = 1; j <= 9; j++) { // 1 ~ 9 매단 마다
				System.out.println(i + "*" + j + "=" + (i * j));
			}
		}
	}
}
