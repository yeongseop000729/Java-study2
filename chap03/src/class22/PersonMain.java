package class22;

public class PersonMain {

	public static void main(String[] args) {
		Person p1 = new Person("123456-1234567", "홍길동");

		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);

		// final로 선언된 필드의 값은 변경할 수 없다.
		// p1.nation = "usa";
		// p1.ssn = "654321-7654321";

		// final이 아닌 필드는 변경 가능
		p1.name = "홍삼원";
		;

	}

}
