package com.javalec.shspringEx.dao;

import java.util.List;

import com.javalec.shspringEx.model.Board;

public interface BoardDao {
	
	public List<Board> list();
	public void insert(Board board);
	public Board view(Board board);
	public Board modify_view(Board board);
	public void update(Board board);
	public void delete(Board board);

}