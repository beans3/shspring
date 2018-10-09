package com.javalec.shspringEx.dao;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javalec.shspringEx.model.Member;

@Repository
public class MemberDaoImpl implements MemberDao{
	
	@Autowired
	SqlSession sqlSession;

	@Override
	public Member onememberSelect(Member member) {
		
		MemberDao dao = sqlSession.getMapper(MemberDao.class);
		
		
		return null;
	}
	
	@Override
	public void memberInsert(Member member) {
		
		MemberDao dao = sqlSession.getMapper(MemberDao.class);
		dao.memberInsert(member);
		
	}

	@Override
	public ArrayList<Member> memberSelect(Member member) {
		
		MemberDao dao = sqlSession.getMapper(MemberDao.class);
		
		return null;
	}

	@Override
	public void memberUpdate(Member member) {

		MemberDao dao = sqlSession.getMapper(MemberDao.class);
		dao.memberUpdate(member);
		
	}

	@Override
	public void memberDelete(Member member) {


		MemberDao dao = sqlSession.getMapper(MemberDao.class);
		dao.memberDelete(member);
		
	}

}
