package com.javalab;

public class Takes {

	// 멤버변수, 인스턴스변수, 필드
	private String id;
	private String subject;
	private String score;
	
	// 기본생성자
	public Takes() {
	}
	
	// 오버로딩 생성자
	public Takes(String id, String subject, String score) {
		this.id = id;
		this.subject = subject;
		this.score = score;
	}

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

	@Override
	public String toString() {
		return this.id + "\t" + this.subject + "\t" + this.score;
	}
	
	
}
