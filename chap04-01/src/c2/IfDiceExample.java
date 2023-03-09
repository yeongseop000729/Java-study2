package c2;

public class IfDiceExample {

	public static void main(String[] args) {
		// 0.0 ~ 1.0 사이의 난수 발생
		int num = (int)(Math.random()*6) + 1; // 1~6사이
		// + 1 이면 1 부터 시작
		// + 2 이면 2 부터 시작
		// (Math.random()*6) = 6 까지
		// (Math.random()*100) = 100 까지
		
		if(num==1) {
			System.out.println("1번이 나왔습니다.");
		} else if(num==2) {
			System.out.println("2번이 나왔습니다.");
		} else if(num==3) {
			System.out.println("3번이 나왔습니다.");
		} else if(num==4) {
			System.out.println("4번이 나왔습니다.");
		} else if(num==5) {
			System.out.println("5번이 나왔습니다.");
		} else {
			System.out.println("6번이 나왔습니다.");
		}
	}
}
