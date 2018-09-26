package com.javalec.shspringEx.model;

import java.sql.Timestamp;

public class Board{
	
	private int code;
	private String id;
	private Timestamp regDate;
	private String title;
	private String content;
	int hit;
	int boardGroup;
	int commentStep;
	int commentIndent;

	public Board() {
		// TODO Auto-generated constructor stub
	}
	
	public Board(int code, String id, Timestamp regDate, String title, String content, int hit, int boardGroup, int commentStep, int commentIndent) {
		this.code = code;
		this.id = id;
		this.regDate = regDate;
		this.title = title;
		this.content = content;
		this.hit = hit;
		this.boardGroup = boardGroup;
		this.commentStep = commentStep;
		this.commentIndent = commentIndent;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Timestamp getregDate() {
		return regDate;
	}

	public void setregDate(Timestamp regDate) {
		this.regDate = regDate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getHit() {
		return hit;
	}

	public void setHit(int hit) {
		this.hit = hit;
	}

	public int getBoardGroup() {
		return boardGroup;
	}

	public void setBoardGroup(int boardGroup) {
		this.boardGroup = boardGroup;
	}

	public int getCommentStep() {
		return commentStep;
	}

	public void setCommentStep(int commentStep) {
		this.commentStep = commentStep;
	}

	public int getCommentIndent() {
		return commentIndent;
	}

	public void setCommentIndent(int commentIndent) {
		this.commentIndent = commentIndent;
	}
	
	
}
