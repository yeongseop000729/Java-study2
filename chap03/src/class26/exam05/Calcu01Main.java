package class26.exam05;

public class Calcu01Main {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 20;
		double x1 = 10.5;
		double y1 = 20.0;
		
		// 계산기 객체 생성
		Calcu01 cu01 = new Calcu01();
		
		// 정수 합산
		int intSum = cu01.sum(x, y);
		
		// 실수 합산
		double doubleSum = cu01.sum(x1, y1);
		
		System.out.printf("정수 와 %d의 합산 결과는 %.1f 입니다.", intSum , doubleSum);
		System.out.println();
		System.out.printf("실수 %.1f와 %.1f의 합산 결과는 %.1f 입니다.", x1, y1, doubleSum);
	}

}
