package com.javalec.shspringEx.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javalec.shspringEx.dao.BoardDao;
import com.javalec.shspringEx.model.Board;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	BoardDao dao;
	
	@Override
	public List<Board> boaradList() {
		// TODO Auto-generated method stub
		return dao.list();
	}

	@Override
	public void boardInsert(Board board) {

		dao.insert(board);
		
	}
	
	@Override
	public Board modifyView(Board board) {
		
		return dao.modify_view(board);
	}

	@Override
	public void boardUpdate(Board board) {
		
		dao.update(board);

	}

	@Override
	public void boardDelete(Board board) {
		
		dao.delete(board);
		
	}

	@Override
	public Board boardView(Board board) {
		
		Board resultBoard = dao.view(board);
		
		return resultBoard;
	}

}
