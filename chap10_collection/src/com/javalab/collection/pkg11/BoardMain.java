package com.javalab.collection.pkg11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class BoardMain {

	public static void main(String[] args) {

		// 게시물 객체를 저장할 ArrayList 선언
		List<Board> boardList = new ArrayList<>();

		// ArrayList에 게시물 저장
		boardList.add(new Board(100, "객체 배열을 통하여 학생명단 평균점수 최고점수 최고점 학생을 출력하세요", "김정희", "2023.03.03", 84));
		boardList.add(new Board(101, "객체지향 프로그래밍 - 인스턴스 멤버와 정적멤버", "최윤희", "2021.07.21", 99));
		boardList.add(new Board(102, "클래스와 객체지향 프로그래밍(Object Oriented Programming)", "우성민", "2020.06.10", 264));
		boardList.add(new Board(103, "[정렬] 선택 정렬(Selection Sort)", "정민태", "2023.01.02", 77));
		boardList.add(new Board(104, "Math.random() 메소드를 통한 난수 발생시키기", "김갑철", "2022.10.12", 94));
		boardList.add(new Board(105, "배열을 통한 사원 정보 관리 #2", "이수영", "2021.07.25", 70));
		boardList.add(new Board(106, "배열을 통한 학생 정보 관리 #1", "박영준", "2023.02.01", 80));
		boardList.add(new Board(107, "문자열(장문) 처리하기", "성수정", "2019.12.30", 56));
		boardList.add(new Board(108, "[과제] 주말과제 - 최고 점수와 최고 점수 학생명 구하기", "홍세나", "2020.05.17", 84));
		boardList.add(new Board(109, "[모듈화] 최고 점수와 최고 점수 학생명 구하기", "홍세나", "2023.03.03", 64));
		boardList.add(new Board(110, "다차원 배열 자료 저장 구조와 인덱스", "서동욱", "2022.07.010", 94));
		boardList.add(new Board(111, "제어문 반복문", "정연남", "2022.08.03", 84));
		boardList.add(new Board(112, "연산자(Operator)", "최정빈", "2020.01.01", 64));
		boardList.add(new Board(113, "키보드를 통해서 데이터 읽어들이기", "오민희", "2022.09.12", 984));
		boardList.add(new Board(114, "변수와 자료형 #1", "이의정", "2022.09.03", 164));

		// 1. 전체 게시물 출력
		printAllBoard(boardList);
		System.out.println();
		System.out.println();

		// 2. 우성민, 홍세나가 작성한 게시물 출력하기
		List<Board> boardNameList = getBoardByName(boardList);// 반환받은 ArrayList(홍세나,우성민)
		System.out.println("2. 우성민, 홍세나가 작성한 게시물의 목록을 출력");
		for (Board board : boardNameList) {
			if (board.getWriter().equals("우성민") || board.getWriter().equals("홍세나")) {
				System.out.printf("%d \t  %s \t %s \t %d \n", board.getId(), board.getTitle(), board.getWriter(),
						board.getHitcount());
			}
		}
		System.out.println();
		System.out.println();

		// 3. 배열과 관련된 게시물 출력 메소드 호출
		System.out.println("3. 배열과 관련된 게시물 출력");
		printBoard(boardList);
		System.out.println();
		System.out.println();

		// 4. 조회수가 가장 큰 게시물 출력메소드 호출
		System.out.println("4. 조회수가 가장 큰 게시물 출력");
		printHitCountBoard(boardList);
		System.out.println();
		System.out.println();

		// 게시물 객체를 HashSet 컬렉션에 추가
		Set<Board> boardSet = new HashSet<Board>();
		boardSet.add(new Board(100, "객체 배열을 통하여 학생명단 평균점수 최고점수 최고점 학생을 출력하세요", "김정희", "2023.03.03", 84));
		boardSet.add(new Board(101, "객체지향 프로그래밍 - 인스턴스 멤버와 정적멤버", "최윤희", "2021.07.21", 99));
		boardSet.add(new Board(102, "클래스와 객체지향 프로그래밍(Object Oriented Programming)", "우성민", "2020.06.10", 264));
		boardSet.add(new Board(103, "[정렬] 선택 정렬(Selection Sort)", "정민태", "2023.01.02", 77));
		boardSet.add(new Board(104, "Math.random() 메소드를 통한 난수 발생시키기", "김갑철", "2022.10.12", 94));
		boardSet.add(new Board(105, "배열을 통한 사원 정보 관리 #2", "이수영", "2021.07.25", 70));
		boardSet.add(new Board(106, "배열을 통한 학생 정보 관리 #1", "박영준", "2023.02.01", 80));
		boardSet.add(new Board(107, "문자열(장문) 처리하기", "성수정", "2019.12.30", 56));
		boardSet.add(new Board(108, "[과제] 주말과제 - 최고 점수와 최고 점수 학생명 구하기", "홍세나", "2020.05.17", 84));
		boardSet.add(new Board(109, "[모듈화] 최고 점수와 최고 점수 학생명 구하기", "홍세나", "2023.03.03", 64));
		boardSet.add(new Board(110, "다차원 배열 자료 저장 구조와 인덱스", "서동욱", "2022.07.010", 94));
		boardSet.add(new Board(111, "제어문 반복문", "정연남", "2022.08.03", 84));
		boardSet.add(new Board(112, "연산자(Operator)", "최정빈", "2020.01.01", 64));
		boardSet.add(new Board(113, "키보드를 통해서 데이터 읽어들이기", "오민희", "2022.09.12", 984));
		boardSet.add(new Board(114, "변수와 자료형 #1", "이의정", "2022.09.03", 164));

		// 5. HashSet 컬렉션을 이용하여 전체 게시물 출력 메소드 호출
		System.out.println("5. HashSet을 통하여 전체 게시물 출력");
		printSetBoard(boardSet);
		System.out.println();
		System.out.println();

		// HashMap에 게시물 객체 저장(Key-게시물id, Value-게시물 객체)
		Map<Integer, Board> boardMap = new HashMap<Integer, Board>();

		boardMap.put(100, new Board(100, "객체 배열을 통하여 학생명단 평균점수 최고점수 최고점 학생을 출력하세요", "김정희", "2023.03.03", 84));
		boardMap.put(101, new Board(101, "객체지향 프로그래밍 - 인스턴스 멤버와 정적멤버", "최윤희", "2021.07.21", 99));
		boardMap.put(102, new Board(102, "클래스와 객체지향 프로그래밍(Object Oriented Programming)", "우성민", "2020.06.10", 264));
		boardMap.put(103, new Board(103, "[정렬] 선택 정렬(Selection Sort)", "정민태", "2023.01.02", 77));
		boardMap.put(104, new Board(104, "Math.random() 메소드를 통한 난수 발생시키기", "김갑철", "2022.10.12", 94));
		boardMap.put(105, new Board(105, "배열을 통한 사원 정보 관리 #2", "이수영", "2021.07.25", 70));
		boardMap.put(106, new Board(106, "배열을 통한 학생 정보 관리 #1", "박영준", "2023.02.01", 80));
		boardMap.put(107, new Board(107, "문자열(장문) 처리하기", "성수정", "2019.12.30", 56));
		boardMap.put(108, new Board(108, "[과제] 주말과제 - 최고 점수와 최고 점수 학생명 구하기", "홍세나", "2020.05.17", 84));
		boardMap.put(109, new Board(109, "[모듈화] 최고 점수와 최고 점수 학생명 구하기", "홍세나", "2023.03.03", 64));
		boardMap.put(110, new Board(110, "다차원 배열 자료 저장 구조와 인덱스", "서동욱", "2022.07.010", 94));
		boardMap.put(111, new Board(111, "제어문 반복문", "정연남", "2022.08.03", 84));
		boardMap.put(112, new Board(112, "연산자(Operator)", "최정빈", "2020.01.01", 64));
		boardMap.put(113, new Board(113, "키보드를 통해서 데이터 읽어들이기", "오민희", "2022.09.12", 984));
		boardMap.put(114, new Board(114, "변수와 자료형 #1", "이의정", "2022.09.03", 164));

		// 6. HashMap을 통하여 게시물 출력해주는 메소드 호출
		System.out.println("6. HashMap을 통하여 전체 게시물 출력");
		printMapBoard(boardMap);
		System.out.println();
		System.out.println();

	}

	// HashMap을 통하여 게시물 출력해주는 메소드
	private static void printMapBoard(Map<Integer, Board> boardMap) {

		for (Integer id : boardMap.keySet()) { // boardMap.keySet() : key가 든 Set반환
			System.out.printf("%d \t  %s \t %s \t %d \n", boardMap.get(id).getId(), boardMap.get(id).getTitle(),
					boardMap.get(id).getWriter(), boardMap.get(id).getHitcount());
		}

		Set<Integer> keySet = boardMap.keySet();
		Iterator<Integer> iter = keySet.iterator();
		while (iter.hasNext()) {
			Integer key = iter.next();
			Board board = boardMap.get(key);
			System.out.printf("%d \t  %s \t %s \t %d \n", board.getId(), board.getTitle(), board.getWriter(),
					board.getHitcount());
		}

	}

	// HashSet을 전달받아서 출력해주는 메소드
	private static void printSetBoard(Set<Board> boardSet) {
		System.out.println("HashSet을 통한 전체 게시물 목록 출력");
		for (Board board : boardSet) {
			System.out.printf("%d \t  %s \t %s \t %d \n", board.getId(), board.getTitle(), board.getWriter(),
					board.getHitcount());
		}
	}

	// 조회수가 가장 큰 게시물 출력 메소드
	private static void printHitCountBoard(List<Board> boardList) {
		int maxCount = 0; // 조회수가 수 임시 보관
		int index = 0; // 조회수가 가장 많은 게시물의 인덱스

		// [방법.1] 향상된 for
		for (Board board : boardList) {
			if (board.getHitcount() > maxCount) {
				maxCount = board.getHitcount();
				index = board.getId(); // 해당 게시물의 id
			}
		}
		System.out.println("찾아진 인덱스 : " + index);
		for (Board board : boardList) {
			if (board.getId() == index) {
				System.out.printf("%d \t  %s \t %s \t %d \n", board.getId(), board.getTitle(), board.getWriter(),
						board.getHitcount());
			}
		}

		// [방법.2] 일반for
		/*
		 * for (int i = 0; i < boardList.size(); i++) {
		 * if(boardList.get(i).getHitcount() > maxCount) { maxCount =
		 * boardList.get(i).getHitcount(); index = i; // boardList의 인덱스 } }
		 * System.out.printf("%d \t  %s \t %s \t %d \n", boardList.get(index).getId(),
		 * boardList.get(index).getTitle(), boardList.get(index).getWriter(),
		 * boardList.get(index).getHitcount());
		 */

	} // end printHitCountBoard

	// 배열과 관련된 게시물 출력 메소드
	public static void printBoard(List<Board> boardList) {
		for (Board board : boardList) {
			if (board.getTitle().contains("배열")) {
				System.out.printf("%d \t  %s \t %s \t %d \n", board.getId(), board.getTitle(), board.getWriter(),
						board.getHitcount());
			}

		}
	}

	// 우성민 홍세나가 작성한 게시물 출력 메소드
	private static List<Board> getBoardByName(List<Board> boardList) {
		// 우성민 홍세나 게시물을 담을 ArrayList 생성
		List<Board> anotherList = new ArrayList<Board>();

		// [방법.1 일반 for] 우성민 홍세나 작성한 게시물 찾아서 ArrayList에 저장
		for (int i = 0; i < boardList.size(); i++) {
			String writer = boardList.get(i).getWriter(); // 작성자
			if (writer.equals("우성민") || writer.equals("홍세나")) { // 작성자가 우성민 또는 홍세나
				anotherList.add(boardList.get(i));
			}
		}

		// [방법.2 향상된 for] 우성민 홍세나 작성한 게시물 찾아서 ArrayList에 저장
//	      for (Board board : boardList) {
//	         String writer = board.getWriter();   // 작성자  
//	         if(writer.equals("우성민") || writer.equals("홍세나")) {   // 작성자가  우성민 또는 홍세나
//	            anotherList.add(board);
//	         }
//	      }

		return anotherList; // 우성민 홍세나가 작성한 게시물을 담은 ArrayList 반환
	}

	// 전체 게시물 출력 메소드
	private static void printAllBoard(List<Board> boardList) {
		System.out.println("1. 일반 for문으로 전체 게시물 출력");
		for (int i = 0; i < boardList.size(); i++) {
			System.out.printf("%d \t  %s \t %s \t %d \n", boardList.get(i).getId(), boardList.get(i).getTitle(),
					boardList.get(i).getWriter(), boardList.get(i).getHitcount());
		}
		System.out.println();
		System.out.println("1.1 향상된 for문으로 전체 게시물 출력");
		for (Board board : boardList) {
			System.out.printf("%d \t  %s \t %s \t %d \n", board.getId(), board.getTitle(), board.getWriter(),
					board.getHitcount());
		}

	}

}
