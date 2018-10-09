package com.javalec.shspringEx.service;

import javax.servlet.http.HttpSession;

import com.javalec.shspringEx.model.Member;

public interface LoginService {
	
	public Member login(Member member);
	public void logout(HttpSession httpSession);

}
