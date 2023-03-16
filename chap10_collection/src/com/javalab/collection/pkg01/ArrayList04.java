package com.javalab.collection.pkg01;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* [Raw Data]
  "제목1", "내용1", "글쓴이1"
  "제목2", "내용2", "글쓴이2"
  "제목3", "내용3", "글쓴이3"
  "제목4", "내용4", "글쓴이4"
  "제목5", "내용5", "글쓴이5"
  
  private String subject;
  private String content;
  private String writer;
*/

public class ArrayList04 {
	public static void main(String[] args) {

		// [문제.1] ArrayList 컬렉션 생성
		List<Board> list = new ArrayList<>();

		// 객체 추가
		list.add(new Board("제목1", "내용1", "글쓴이1"));
		list.add(new Board("제목2", "내용2", "글쓴이2"));
		list.add(new Board("제목3", "내용3", "글쓴이3"));
		list.add(new Board("제목4", "내용4", "글쓴이4"));
		list.add(new Board("제목5", "내용5", "글쓴이5"));

		// [문제.2] 저장된 총 객체 수 얻기
		int size = list.size();
		System.out.println("총 객체 수: " + size);
		System.out.println();

		// [문제.3] 2번쨰 인덱스의 객체 가져와서 출력하기
		Board board = list.get(2);
		// 이것도 가능하다
//		System.out.println(board.getContent() + board.getSubject() + board.getWriter());
		// 디버깅
		System.out.println(board.toString()); // 앞으로 이렇게 출력해야한다.
		System.out.println();
		
		// [문제.4] 모든 객체를 하나씩 가져오기
		System.out.println("[Raw Data]");
		for (int i = 0; i < list.size(); i++) {
			System.out
					.println(list.get(i).getSubject() + " " 
							+ list.get(i).getContent() + " " + list.get(i).getWriter());
		}
		System.out.println();
		
		// [문제.5] 객체 삭제
		// 인덱스가 제거되었을떄 뒤 인덱스가 앞으로 1칸씩 당겨진다.
		System.out.println("[ 객체 삭제 ]");
		list.remove(2);
		list.remove(2);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getSubject() + " " 
							+ list.get(i).getContent() + " " + list.get(i).getWriter());
			
		}
		System.out.println();
		
		// [문제.6] "제목11", "내용11", "글쓴이11" <- list 인덱스 1번에 넣으세요.
		System.out.println("[인덱스 1번에 추가]");
		list.set(1, new Board("제목11", "내용11", "글쓴이11"));
		for(Board b : list) {
			System.out.println(b.toString());
		}
		
	} // end main
} // end class

class Board {

	private String subject;
	private String content;
	private String writer;

	public Board(String subject, String content, String writer) {
		this.subject = subject;
		this.content = content;
		this.writer = writer;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	// 상속할떄 @Override 나옴 
	// 모든 Object를 상속받는다
	@Override
	public String toString() {
		return "Board [subject=" + subject + ", content=" + content + ", writer=" + writer + "]";
	}
	
	

}
