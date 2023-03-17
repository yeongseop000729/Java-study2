package com.javalab.collection.pkg10;

import java.util.ArrayList;
import java.util.List;

public class MemberMain {

	public static void main(String[] args) {

		// 기본 데이터
		String[] member = new String[10];
		member[0] = "임재,20190509,20190510,8,남,30대후반";
		member[1] = "성열,20190509,20190510,1,남,30대중반";
		member[2] = "천재,20190509,20190510,3,남,30대초반";
		member[3] = "현수,20190509,20190509,1,남,20대후반";
		member[4] = "진우,20190509,20190510,2,남,30대초반";
		member[5] = "영수,20190509,20190510,2,여,40대후반";
		member[6] = "종화,20190509,20190509,0,남,20대후반";
		member[7] = "윤정,20190509,20190510,3,여,40대후반";
		member[8] = "종호,20190509,20190510,3,남,20대중반";
		member[9] = "동현,20190509,20190510,5,남,20대중반";

		// 1. 기본 데이터를 가공하여 Member 객체로 만들고 저장할 ArrayList 생성
		ArrayList<Member> memberList = new ArrayList<>();

		// 기본 데이터를 반복문을 통해서 Member 객체로 생성
		for (int i = 0; i < member.length; i++) {
			String[] arr = member[i].split(","); // 콤머로 구분해서 자르고 배열에 넣어줌
			int numVisit = Integer.parseInt(arr[3]);
			char gender = arr[4].charAt(0);
			memberList.add(new Member(arr[0], arr[1], arr[2], numVisit, gender, arr[5])); // 객체생성
		}

		// 2. 이름이 "천재"인 회원을 찾고 별도의 메소드를 통해서 출력하세요.
		System.out.println("이름이 \"천재\"인 회원을 찾고 별도의 메소드를 통해서 해당 회원을 출력하세요.");
		Member tempMem = new Member();
		for (Member member2 : memberList) {
			if (member2.getName().equals("천재")) {
				tempMem = member2;
			}
		}
		// 한 명의 회원을 파라미터로 전달해서 출력하는 메소드
		printMemberInfo(tempMem);
		System.out.println();

		// 3. 전체 회원을 출력해주는 메소드
		System.out.println("전체 회원을 출력해주는 메소드를 만드세요.");
		printAllMembers(memberList);
		System.out.println();

		// 4. 30대인 회원들을 찾아주는 메소드를 만들고 ArrayList에 담아서 반환해주는 메소드를 만드세요.
		// 반환받은 리스트를 main 메소드에서 출력하세요.
		System.out.println("30대인 회원들을 찾아주는 메소드를 만들고 ArrayList에 담아서 반환하세요");
		List<Member> member30 = getMember30(memberList);
		for (Member member2 : member30) {
			System.out.println(member2.getName() + "\t" + member2.getJoinDate() + "\t" + member2.getLastVisitDate()
					+ "\t" + member2.getNumVisit() + "\t" + member2.getGender() + "\t" + member2.getAge());
		}
		System.out.println();

		// 5. 20대 후반들의 방문 회수를 구해주는 메소드를 만들어서 값을 반환받고 출력하세요.
		int visitCount = getVisit20(memberList);
		System.out.println("20대 후반 회원들의 총 방문회수는 총 : " + visitCount + "입니다.");

	} // end main

	// 20대 후반들의 방문 회수
	private static int getVisit20(ArrayList<Member> memberList) {
		int count = 0;
		for (Member mem : memberList) {
			if (mem.getAge().equals("20대후반")) {
				count += mem.getNumVisit();
			}
		}
		return count; // 방문횟수 반환 return 0;
	}

	// 30대인 회원들을 찾아주는 메소드
	private static List<Member> getMember30(ArrayList<Member> memberList) {
		List<Member> member30 = new ArrayList<>();
		for (Member mem : memberList) {
			String ageTest = mem.getAge().substring(0, 2);
			if (Integer.parseInt(ageTest) == 30) {
				member30.add(mem);
			}
		}
		return member30;
	}

	// 전체 멤버 출력 메소드
	private static void printAllMembers(ArrayList<Member> memberList) {
		for (Member member : memberList) {
			System.out.println(member.getName() + "\t" + member.getJoinDate() + "\t" + member.getLastVisitDate() + "\t"
					+ member.getNumVisit() + "\t" + member.getGender() + "\t" + member.getAge());
		}
	}

	// 한 회원의 정보 출력 메소드
	private static void printMemberInfo(Member member) {
		System.out.println(member.getName() + "\t" + member.getJoinDate() + "\t" + member.getLastVisitDate() + "\t"
				+ member.getNumVisit() + "\t" + member.getGender() + "\t" + member.getAge());
	}

}
