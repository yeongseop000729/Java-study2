package sec07;

/**
 * NullPointerException - 메모리에 공간이 안만들어진 상태에서 특정 요소의 값에 접근할 경우 발생 - 참조하는 메모리 공간이
 * 없는 상태
 */

public class Array00NullPointerException {
	public static void main(String[] args) {
		int[] intArray = null;
		intArray = new int[3]; // new int [3]으로 intArray에게 3을 부여함
		intArray[0] = 10; // NullPointerException
		System.out.println(intArray[0]);

		String str = null;
		str = "안녕하세요.";
		// (예) str = "안녕하세요 저는 심영섭입니다." 라는 이름을 줌 ( 띄어쓰기도 숫자에 포함 )
		// 그러면 str.length() 를 출력하면 16이 나온다
		// NullPointerException
		System.out.println("총 문자 수: " + str.length());
		// 위에서 str에게 값을줘서 str.length() 문자 수를 출력함
	}

}
