package com.javalec.shspringEx.controller;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javalec.shspringEx.dao.MemberDao;
import com.javalec.shspringEx.model.Member;

@Controller
@RequestMapping("/main")
public class MainController {
	
	@Autowired
	SqlSession sqlSession;
	
	@RequestMapping("/")
	public String main() {
		
		return "main.jsp";
	}
	
	@RequestMapping("/signUp")
	public String signUp() {
		return "signUp";
	}
	
	@RequestMapping("/login")
	public String login(Member member, MemberDao memberDao) {
		if(memberDao.)
		
		
		return "login";
	}
	
	@RequestMapping("/logout")
	public String logout() {
		
		return "main";
	}
	

}
