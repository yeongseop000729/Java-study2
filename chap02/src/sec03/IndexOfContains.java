package sec03;

public class IndexOfContains {
	public static void main(String[] args) {
		String subject = "자바 프로그램밍";
		
		int location = subject.indexOf("프로그래밍");  // indexOf = 어디서부터 시작할건지
		System.out.println(location);
		String subString = subject.substring(location);
		System.out.println(subString);
		
		location = subject.indexOf("자바");
		if(location != -1) {
			System.out.println("자바와 관련된 책이군요.");
		} else {
			System.out.println("자바와 관련 없는 책이군요.");
		}
		
		boolean result = subject.contains("자바"); // contains * 시험에서 자주 나옴 *
		if(result) {
			System.out.println("자바와 관련된 책이군요.");
		} else {
			System.out.println("자바와 관련 없는 책이군요.");
		}
	}
}

