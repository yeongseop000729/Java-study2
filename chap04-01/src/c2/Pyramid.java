package c2;

public class Pyramid {

	public static void main(String[] args) {

//              10층 직삼각형 피라미드 ( 별 찍기 )

		for (int i = 1; i <= 10; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
