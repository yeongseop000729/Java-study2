package class20;

/**
 * 정적 블럭이 있는 라이브러리 클래스를 사용하는 실행클래스
 */

public class TelevisionMain {

	public static void main(String[] args) {

		System.out.println(Television.company);
		System.out.println(Television.model);
		System.out.println(Television.info); // 정적 블럭으로 선언한 정적 변수 ( 필드 )

	}

}
