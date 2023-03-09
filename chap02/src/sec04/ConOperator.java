package sec04;

public class ConOperator {
	public static void main(String[] args) {
		int score = 85;
		String str = (score >= 80) ? "80점이상" : "80점 미만";
		// ? 오른쪽 첫번쨰꺼 실행 만약 첫번째가 false일떄 오른쪽 두번째꺼 실행
		// 삼항 연자는 한줄로 해결
		System.out.println(str);
	}
}
