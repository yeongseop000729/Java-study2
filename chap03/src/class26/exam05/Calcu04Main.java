package class26.exam05;

/**
 * 실행 클래스 
 * - 배열을 오버로딩 메소드에 인자로 전달하고 있다. 배열의 주소가 복사되는 그림
 */

public class Calcu04Main {

	public static void main(String[] args) {
		int[] intArr = new int[5];
		intArr[0] = 15;
		intArr[1] = 15;
		intArr[2] = 15;
		intArr[3] = 15;
		intArr[4] = 15;

		double[] dblArr = new double[5];
		dblArr[0] = 15.5;
		dblArr[1] = 25.5;
		dblArr[2] = 35.5;
		dblArr[3] = 45.5;
		dblArr[4] = 55.5;

		// 계산기 객체 생성
		Calcu04 cal = new Calcu04();

		// 계산기 객체의 오버로딩 메소드 호출
		int[] arr2 = cal.tenPlus(intArr);
		double[] arr3 = cal.tenPlus(dblArr);

		// 두 배열의 값을 출력하세요
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		System.out.println();

		for (int i = 0; i < arr3.length; i++) {
			System.out.println(arr3[i]);
		}

	}

}
