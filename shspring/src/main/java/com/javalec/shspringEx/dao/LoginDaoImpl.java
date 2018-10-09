package com.javalec.shspringEx.dao;

import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javalec.shspringEx.model.Member;

@Repository
public class LoginDaoImpl implements LoginDao {

	@Autowired
	SqlSession sqlSession;
	
//	@Override
//	public boolean loginCheck(Member member, HttpSession httpSession) {
//		
//		selectOne 한 개 이상의 객체나 null이 리턴 되면 예외 발생, 리턴 되는 객체의 수를 모른다면 selectList 메서드 사용
//		String name = sqlSession.selectOne("com.javalec.shspringEx.dao.LoginDao.loginCheck", member);
//		
//		return (name==null) ? false:true;
//		
//	}

	@Override
	public Member login(Member member) {
		
		return sqlSession.selectOne("com.javalec.shspringEx.dao.LoginDao.login", member);
		
	}

	@Override
	public void logout(HttpSession httpSession) {
		// TODO Auto-generated method stub
		
	}

}
