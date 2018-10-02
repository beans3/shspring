package com.javalec.shspringEx.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.javalec.shspringEx.dao.MemberDao;
import com.javalec.shspringEx.model.Member;


@Controller
@RequestMapping("/member/*")
public class MemberController {
	
	@Autowired
	SqlSession sqlsession;
	
	// Join
	@RequestMapping("/joinForm")
	public String memjoinForm() {
		
		MemberDao dao = sqlsession.getMapper(MemberDao.class);				
		return "/member/joinForm";
		
	}
	
	//회원가입
	@RequestMapping("/join")
	public String memjoin(Model model, Member member) {
		
		MemberDao dao = sqlsession.getMapper(MemberDao.class);
		dao.memberInsert(member);
		model.addAttribute("member", member);
		
		return "/member/joinOk";
	}
	
	
	// Modify
	@RequestMapping("/modifyForm")
	public String memModifyForm(@RequestParam("id") String id, Model model) {
		
		MemberDao dao = sqlsession.getMapper(MemberDao.class);
		model.addAttribute("modify", dao.memberUpdate(id));
		
		return "/modifyForm";
	}
	
	@RequestMapping("/modify")
	public String memModify(Member member, Model model) {
		
		MemberDao dao = sqlsession.getMapper(MemberDao.class);
		dao.memberUpdate(member);
		
		return "/modifyOk";
	}
	
	// Remove
	@RequestMapping("/removeForm")
	public String memRemoveForm(HttpServletRequest request) {

		return "/removeForm";
	}
	
	@RequestMapping(value = "/remove", method = RequestMethod.POST)
	public String memRemove(Member member, HttpServletRequest request) {
		
		return "/member/removeOk";
	}

}
