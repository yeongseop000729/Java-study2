package class13;

/**
 * 메소드 연습용 Car 클래스
 */

public class Car {

	// 필드 선언 ( 기름 )
	int gas;

	// 주유 메소드(리턴값이 없는 메소드로 매개값을 받아서 gas 필드에 저장)
	void setGas(int gas) {
		this.gas = gas;
	}

	/**
	 * 기름이 있고 없고 여부를 반환해주는 메소드 
	 * - boolean : gas 필드값이 0 이면 false, 0이 아니면 true를 리턴
	 */
	// 물어볼떄 is를 많이 붙임 
	// is = isexist()
	boolean isLeftGas() {
		if (gas == 0) {
			System.out.println("gas가 없습니다.");
			return false; // false를 리턴하고 메소드 종료
		}
		System.out.println("gas가 있습니다.");
		return true; // true를 리턴하고 메소드 종료
	}

	/**
	 * 운행 메소드 
	 * - 기름이 0가 될떄까지 계속 운행 
	 * - gas가 0 이면 return 문으로 메소드를 종료시킴
	 */
	// void run = 반환하지 않겠다
	void run() {
		// while 문에 true를 넣으면 무한반복 멈출려면 break 또는 0 이 될떄까지 하고 else로 빠져나간다 
		while (true) {
			if (gas > 0) {
				System.out.println("달립니다.(gas잔량:" + gas + ")");
				gas -= 1;
			} else {
				System.out.println("멈춥니다.(gas잔량:" + gas + ")");
				return; // 메소드 종료
			}
		}
	}
}
