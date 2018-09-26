package com.javalec.shspringEx.dao;

import java.util.ArrayList;

import com.javalec.shspringEx.model.Board;

public interface BoardDao {
	
	public ArrayList<Board> list();
	public void write(String id, String title, String content);
	public Board view(int code);
	public Board modify_view(int code);
	public void modify(String id, String title, String content, int code);
	public void delete(int code);

}
