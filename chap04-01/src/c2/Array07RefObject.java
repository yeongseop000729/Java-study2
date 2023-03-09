package c2;

public class Array07RefObject {

	public static void main(String[] args) {
		String[] strArray = new String[3];
		// String 타입 배열
		strArray[0] = "Java";
		strArray[1] = "Java";
		strArray[2] = new String("Java");

		System.out.println(strArray[0] == strArray[1]); // true
		System.out.println(strArray[0] == strArray[2]); // false
		System.out.println(strArray[0].equals(strArray[2])); // true
	}
}
