package com.javalec.shspringEx.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.javalec.shspringEx.dao.BoardDao;
import com.javalec.shspringEx.model.Board;


/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping("/board/*")
public class BoardController {

	@Autowired
	SqlSession sqlSession;
	
	//�Խ��� ���
	@RequestMapping({"/", "list"})
	public String list(Model model) {
		
		BoardDao dao = sqlSession.getMapper(BoardDao.class);
		model.addAttribute("list", dao.list());

		return "board/list";
	}
	
	//�۾��� ������
	@RequestMapping("/writeForm")
	public String writeForm() {
		return "board/writeForm";
	}
	
	//�۾���
	@RequestMapping("/write")
	public String write(HttpServletRequest request, Model model) {
		
		BoardDao dao = sqlSession.getMapper(BoardDao.class);
		dao.write(request.getParameter("id"), request.getParameter("title"), request.getParameter("content"));

		return "redirect:list";
	}
	
	//�� ���� ������
	@RequestMapping("/view")
	public String view(@RequestParam("code") int code, Model model) {
		BoardDao dao = sqlSession.getMapper(BoardDao.class);
		model.addAttribute("view", dao.view(code));
		
		return "board/view";
	}
	
	//���� ������
	@RequestMapping("modify_view")
	public String modify_view(@RequestParam("code") int code, Model model) {
		
		BoardDao dao = sqlSession.getMapper(BoardDao.class);
		model.addAttribute("modify", dao.modify_view(code));		
		
		return "board/modify_view";
	}
	
	//����
	@RequestMapping("/modify")
	public String modify(@RequestParam("id") String id, @RequestParam("title") String title, @RequestParam("content") String content, @RequestParam("code") int code) {
		
		BoardDao dao = sqlSession.getMapper(BoardDao.class);
		dao.modify(id, title, content, code);
		
		return "redirect:list";
	}
	
	//�� ����
	@RequestMapping("/delete")
	public String delete(@RequestParam("code") int code) {
		BoardDao dao = sqlSession.getMapper(BoardDao.class);
		dao.delete(code);
		
		return "redirect:list";
	}
	
	//�亯 ������
	@RequestMapping("reply_form")
	public String reply_form() {
		
		return "/reply";
	}
	
	@RequestMapping("reply")
	public String reply(Board board) {
		return "/view";
	}
	
}
