package com.javalec.shspringEx.service;

import java.util.List;

import com.javalec.shspringEx.model.Board;

public interface BoardService {
	
	public List<Board> boaradList();
	public void boardInsert(Board board);
	public void boardUpdate(Board board);
	public void boardDelete(Board board);
	public Board boardView(Board board);
	public Board modifyView(Board board);
	
}
