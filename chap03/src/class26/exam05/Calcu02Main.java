package class26.exam05;

public class Calcu02Main {

	public static void main(String[] args) {

		// 계산기 객체 생성
		Calcu02 ca = new Calcu02();

		// 오버로딩 메소드 호출
		int sum1 = ca.add(3, 4);
		long sum2 = ca.add(3, 4l);
		long sum3 = ca.add(3l, 4);
		long sum4 = ca.add(3l, 4l);

		System.out.println("add(3, 4) 결과: " + sum1);
		System.out.println("add(3, 4l) 결과: " + sum2);
		System.out.println("add(3l, 4) 결과: " + sum3);
		System.out.println("add(3l, 4l) 결과: " + sum4);
		System.out.println();
		
		// 배열 덧셈
		int[] arr = {100, 200, 300};
		int sum5 = ca.add(arr);
		
		System.out.println("ca.add(arr) 결과: " + sum5);

	}
}
