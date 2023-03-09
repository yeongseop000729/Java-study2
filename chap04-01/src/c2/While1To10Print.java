package c2;

public class While1To10Print {

	public static void main(String[] args) {
		int i = 1;
		while (i <= 10) { // while (true)
			System.out.print(i + " ");
			//  (i + " " 띄어쓰면 숫자가 1 2 3 4 5 로 나옴
			//  (i + "" 띄어쓰기를 안하면 숫자가 12345 로 나옴
			//  System.out.print를 하면 숫자가 가로로 나옴
			//  System.out.println 하면 숫자가 세로로 나옴
			i++;
		}
		
		//  위에 방법과 아래 방법중 하나 선택해서 사용 가능  //
		
		 while (true) {
			 System.out.print(i + " ");
			 i++;
			if (i>10) {
				break;
			}
		}
	}
}
