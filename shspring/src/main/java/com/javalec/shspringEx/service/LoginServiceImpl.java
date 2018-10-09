package com.javalec.shspringEx.service;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javalec.shspringEx.dao.LoginDao;
import com.javalec.shspringEx.model.Member;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	LoginDao dao;
	
	@Override
	public Member login(Member member) {
		return dao.login(member);
	}

	@Override
	public void logout(HttpSession httpSession) {
		// TODO Auto-generated method stub
		
	}

}
