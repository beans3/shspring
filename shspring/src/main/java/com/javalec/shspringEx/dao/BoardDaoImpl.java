package com.javalec.shspringEx.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javalec.shspringEx.model.Board;

@Repository
public class BoardDaoImpl implements BoardDao {

	@Autowired
	SqlSession sqlSession;
	
	
	//게시판 글 목록
	@Override
	public List<Board> list() {
		BoardDao dao = sqlSession.getMapper(BoardDao.class);
		return dao.list();
	}


	@Override
	public void insert(Board board) {
		BoardDao dao = sqlSession.getMapper(BoardDao.class);
		dao.insert(board);
		
	}


	@Override
	public Board view(Board board) {
		BoardDao dao = sqlSession.getMapper(BoardDao.class);
		return dao.view(board);
	}


	@Override
	public Board modify_view(Board board) {
		BoardDao dao = sqlSession.getMapper(BoardDao.class);
		return  dao.modify_view(board);
	}


	@Override
	public void update(Board board) {
		BoardDao dao = sqlSession.getMapper(BoardDao.class);
		dao.update(board);
		
	}


	@Override
	public void delete(Board board) {
		BoardDao dao = sqlSession.getMapper(BoardDao.class);
		dao.delete(board);
		
	}
}
