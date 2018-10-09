package com.javalec.shspringEx.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.javalec.shspringEx.model.Member;
import com.javalec.shspringEx.service.MemberService;


@Controller
@RequestMapping("/member/*")
public class MemberController {
	
	@Autowired
	MemberService service;
	
	//회원 가입 페이지
	@RequestMapping("/joinForm")
	public String memjoinForm() {
	
		return "/member/joinForm";
		
	}
	
	//회원가입
	@RequestMapping("/join")
	public String memjoin(Model model, Member member) {
		
		service.memberJoin(member);
		model.addAttribute("member", member);
		
		return "/member/joinOk";
	}
	
	
	// 회원 정보 수정 페이지
	@RequestMapping("/modifyForm")
	public String memModifyForm(@RequestParam("id") String id, Model model) {

		model.addAttribute("modify", id);
		
		return "/modifyForm";
	}
	
	//회원 정보 수정
	@RequestMapping("/modify")
	public String memModify(Member member, Model model) {
		
		service.memberModify(member);
		
		return "/modifyOk";
	}
	
	// 회원 탈퇴	
	@RequestMapping(value = "/remove", method = RequestMethod.POST)
	public String memRemove(Member member, HttpServletRequest request) {
		
		service.memberDelete(member);
		
		return "/member/removeOk";
	}

}
