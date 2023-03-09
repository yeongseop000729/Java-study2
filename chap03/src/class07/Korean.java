package class07;

/**
 * 라이브러리 클래스
 */

public class Korean {
	// 필드
	String nation = "대한민국"; // 국적
	String name; // 성명
	String ssn; // 주민번호

	// 생성자
	public Korean(String name, String ssn) {
		this.name = name; // 이름 초기화
		this.ssn = ssn; // 주민번호 초기화
	}

	// 생성자
	public Korean(String nation, String name, String ssn) {
		this.nation = nation; // 국적 초기화
		this.name = name; // 이름 초기화
		this.ssn = ssn; // 주민번호 초기화
	}
}
