package com.javalab.class02;

public class ProfessorMain {

	public static void main(String[] args) {

		// 교수 객체 저장용 객체 배열 생성
		Professor[] proArray = new Professor[6];

		// raw Data 값 배열에 객체값 저장
		proArray[0] = new Professor("92001", "590327-1839240", "이태규", 920, "교수", "1997");
		proArray[1] = new Professor("92002", "690702-1350026", "고희석", 910, "부교수", "2003");
		proArray[2] = new Professor("92301", "741011-2765501", "최성희", 910, "부교수", "2005");
		proArray[3] = new Professor("92302", "750728-1102458", "김태석", 920, "교수", "1999");
		proArray[4] = new Professor("92501", "620505-1200546", "박철재", 900, "조교수", "2007");
		proArray[5] = new Professor("92502", "740101-1830264", "장민석", 910, "부교수", "2005");
		System.out.println(
				"교수ID" + "\t       " + "주민번호" + "       \t" + "성명" + "\t" + "학과" + "\t" + "grade" + "\t" + "입사일자");

		// [문제.1] 교수들의 목록을 출력해주는 메소드를 만드세요.
		printProfessor(proArray);

		// [문제.2] 910 학과 교수중 입사년도가 2005년인 교수는? (2조건)
		getHireDate2005(proArray);

		// [문제.3] 주민번호가 590327-1839240인 이태규 교수가 퇴직했다.
		// 새로 입사한 선명규 교수를 그 자리에 저장하세요.
		// (빈객체 생성후 setter 메소드로 값저장)
		// "96031", "790208-1884203", "선명규", 920, "부교수", "2021"
		for (int i = 0; i < proArray.length; i++) {
			if (proArray[i].getJumin().equals("590327-1839240")) {
				Professor newProfessor = new Professor();
				newProfessor.setId("96031");
				newProfessor.setJumin("790208-1884203");
				newProfessor.setName("선명규");
				newProfessor.setDepartment(920);
				newProfessor.setGrade("부교수");
				newProfessor.setHiredate("2021");
				proArray[i] = newProfessor;
				break;
			}
		}
		printProfessor(proArray);

	} // end main

	// [문제.1-1] 교수들의 목록 출력해주는 메소드
	private static void printProfessor(Professor[] proArray) {
		for (Professor professor : proArray) {
			System.out.println(professor.getId() + "\t" + professor.getJumin() + "\t" + professor.getName() + "\t"
					+ professor.getDepartment() + "\t" + professor.getGrade() + "\t" + professor.getHiredate());
		}
		System.out.println();
	}

	// [문제.2-1] 910 학과 교수중 입사년도가 2005년인 교수는? (2조건)
	private static void getHireDate2005(Professor[] proArray) {
		for (Professor professor : proArray) {
			if ((professor.getDepartment() == 910) && (professor.getHiredate().equals("2005"))) {
				System.out.println(professor.getId() + "\t" + professor.getJumin() + "\t" + professor.getName() + "\t"
						+ professor.getDepartment() + "\t" + professor.getGrade() + "\t" + professor.getHiredate());

			}

		}
		System.out.println();
	}
}
