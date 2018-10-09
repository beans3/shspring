package com.javalec.shspringEx.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javalec.shspringEx.model.Member;
import com.javalec.shspringEx.service.LoginService;

@Controller
@RequestMapping("/login/*")
public class LoginController {
	
	@Autowired
	LoginService service;
	
	@RequestMapping("/loginForm")
	public String loginForm() {
		
		return "login/loginForm";
	}
	
	@RequestMapping("/loginCheck")
	public String login(HttpSession session, Member member, Model model) {
		
		String loginURL = "";
		
		if(session.getAttribute("login") != null) {
			
			session.removeAttribute("login");
			
		}
		
		Member memberVO = service.login(member);
		
		if(memberVO != null) {
			
			session.setAttribute("login", memberVO);
			loginURL="login/loginOk";
			
		} else {
			loginURL="redirect:loginForm";
		}
		
		model.addAttribute("login", member);
		
		return loginURL;
	}
	
	@RequestMapping("/logout")
	public String logout(HttpSession session) {
		
		session.invalidate();
		
		return "redirect:loginForm";
	}
}
