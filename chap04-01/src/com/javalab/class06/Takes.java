package com.javalab.class06;

public class Takes {

	// 멤버변수, 인스턴스변수, 필드
	private String id; // 학번
	private String subject; // 과목명
	private String score; // 점수

	// 기본 생성자
	public Takes() {
	}

	// 오버로딩 생성자
	public Takes(String id, String subject, String score) {
		this.id = id;
		this.subject = subject;
		this.score = score;
	}

	// getter setter
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}

}
