package c2;

public class While1To10Sum {

	public static void main(String[] args) {
		int sum = 0;
		int i = 1;

//		while(i<=10) {
//		   if(i % 2 == 0) {
//				sum += i;
//	}
//			i++;
//		}
//		System.out.println("1~" + (i-1) + " 합 : " + sum);

//     ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ		

//	     break를 이용한 합계 계산
//       1~10 짝수의 합

		while (true) {
			if (i % 2 == 0) { // == 0 은 나머지
				sum += i;
			}
			if (i > 10) {
				break;
			}
			i++;
		}

		System.out.println("1~" + (i - 1) + " 짝수의 합 : " + sum);
	}

}
