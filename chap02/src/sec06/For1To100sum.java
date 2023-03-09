package sec06;

public class For1To100sum {

	public static void main(String[] args) {
		int sum = 0;
		int i;  // int i를 사용하면 아래서 i=1로 사용해야됌
		
		for (i=1; i<=100; i++) {
			//sum += i; <-- 되도록이면 이걸로 사용하기
			sum = sum + i;
		}
			
			
			System.out.println("1~" + (i-1) + "합 : " + sum);
		}
	}

