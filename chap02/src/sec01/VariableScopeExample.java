package sec01;

/**
 * 변수의 사용 범위(scope)
 *
 */

public class VariableScopeExample {
	public static void main(String[] args) {
		int v1 = 15;
		int v2 = 0;
		if(v1>10) {
	        v2 = v1 - 10;
		}
        int v3 = v1 + v2 + 5; //v2 변수를 사용할 수 없기 떄문에 컴파일 에러 발생
		
	}

}
