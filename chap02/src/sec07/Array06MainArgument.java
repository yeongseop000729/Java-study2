package sec07;

/**
 * main메소드에 인자 전달해서 실행하기 
 * - 1. 본 프로그램을 그냥 실행한다. 
 * - 2. 좌측 project explorer 창에서 해당
                파일을 우클릭하여 [Run Configuration] 메뉴로 들어간다. 
 * - 3. 새로 뜬 창의 좌측 창에서 본 프로그램이 선택되어 있는지 확인한다. 
 * - 4. [Arguments] 탭의 Program arguments에 10 20 을 입력한후 
        [run] 버튼 클릭
 */

public class Array06MainArgument {

	public static void main(String[] args) {
		if (args.length != 2) {
			System.out.println("프로그램 입력값이 부족");
			System.exit(0);
		}

		String strNum1 = args[0];
		String strNum2 = args[1];

		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);

		int result = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + result);
	}

}
