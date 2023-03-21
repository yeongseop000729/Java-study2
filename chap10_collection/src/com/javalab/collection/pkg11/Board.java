package com.javalab.collection.pkg11;

public class Board {

	private int id; // 게시물 번호
	private String title; // 게시물 제목
	private String writer; // 작성자
	private String date; // 작성일
	private int hitcount; // 조회수

	// 기본 생성자
	public Board() {
		super();
	}

	public Board(int id, String title, String writer, String date, int hitcount) {
		super();
		this.id = id;
		this.title = title;
		this.writer = writer;
		this.date = date;
		this.hitcount = hitcount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getHitcount() {
		return hitcount;
	}

	public void setHitcount(int hitcount) {
		this.hitcount = hitcount;
	}

	@Override
	public String toString() {
		return "Board [id=" + id + ", title=" + title + ", writer=" + writer + ", date=" + date + ", hitcount="
				+ hitcount + "]";
	}

}
