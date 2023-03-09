package sec07;

public class Array14StringPrint {

	public static void main(String[] args) {
		String[] members = { "최진형", "이성준", "최기선" };
		// 일반 for문
		for (int i = 0; i < members.length; i++) {
			System.out.printf("%s 님이 상담을 받았습니다. \n", members[i]);
		}
		System.out.println();

		// 향상된 for문  // * 개발자하면서 제일 많이 사용 *
		for (String string : members) {
			System.out.printf("%s 님이 상담을 받았습니다. \n", string);
		}
	}
}
