package sec06;

public class ForContinue {

	public static void main(String[] args) {
		
		// * 면접관들이 코드로 낼수도 있음 * //

		for (int i = 1; i <= 10; i++) {
			if (i%2 != 0) {
				continue;  // continue를 넣으면 다시 위로 올라감 break를 만나면 나가버림
			}
			System.out.print(i + " ");
		}
	}
}
