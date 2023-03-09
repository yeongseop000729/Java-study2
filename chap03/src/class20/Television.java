package class20;

/**
 * 정적 블럭 사용 라이브러리 클래스
 */

public class Television {
	static String company = "MyCompany";
	static String model = "LCD";
	static String info;

	// static 블럭(정적 블럭)
	static {
		info = company + "-" + model;
	}

}
