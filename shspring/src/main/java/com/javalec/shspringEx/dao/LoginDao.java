package com.javalec.shspringEx.dao;

import javax.servlet.http.HttpSession;

import com.javalec.shspringEx.model.Member;

public interface LoginDao {
	
	public Member login(Member member);
	public void logout(HttpSession httpSession);

}
