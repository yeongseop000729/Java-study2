package c2;

public class AssignmentOperator {
	
	public static void main(String[] args) {
		int result = 0;
		result += 10;
		//result = result + 10;    // * 개발자들이 주로 이렇게 사용함 *
		System.out.println("result=" + result);
		result -= 5;
		//result = result - 5;
		System.out.println("result=" + result);
		result *= 3;
		//result = result * 3;
		System.out.println("result=" + result);
		result /= 5;
		//result = result / 3;
		System.out.println("result=" + result);
		result %= 3;
		//result = result % 3;
		System.out.println("result=" + result);
	}

}
