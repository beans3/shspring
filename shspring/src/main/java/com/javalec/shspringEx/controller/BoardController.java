package com.javalec.shspringEx.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javalec.shspringEx.model.Board;
import com.javalec.shspringEx.service.BoardService;


/**
 * Handles requests for the application home page.
 */
/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping("/board/*")
public class BoardController {

	@Autowired
	BoardService service;
	
	//�Խ��� ���
	@RequestMapping({"/", "list"})
	public String list(Model model) {
		
		List<Board> boardList = service.boaradList();
		model.addAttribute("list", boardList);

		return "board/list";
	}
	
	//�۾��� ������
	@RequestMapping("/writeForm")
	public String writeForm() {
		return "board/writeForm";
	}
	
	//�۾���
	@RequestMapping("/write")
	public String write(@ModelAttribute("board") Board board) {
	
		service.boardInsert(board);

		return "redirect:list";
	}
	
	//�� ���� ������
	@RequestMapping("/view")
	public String view(@ModelAttribute("board") Board board, HttpServletRequest request, Model model) {
		
		int code = Integer.parseInt(request.getParameter("code"));
        board.setCode(code);
        
        Board resultBoard = service.boardView(board);
        
        model.addAttribute("view", resultBoard);
		
		return "board/view";
	}
	
	//���� ������
	@RequestMapping("modify_view")
	public String modify_view(@ModelAttribute("board") Board board, HttpServletRequest request, Model model) {
		
		int code = Integer.parseInt(request.getParameter("code"));
		board.setCode(code);
		
		Board resultBoard = service.modifyView(board);
		model.addAttribute("modify", resultBoard);
		
		return "board/modify_view";
	}
	
	//����
	@RequestMapping("/modify")
	public String modify(Board board) {
		
		service.boardUpdate(board);
		
		return "redirect:list";
	}
	
	//�� ����
	@RequestMapping("/delete")
	public String delete(@ModelAttribute("board") Board board) {
		
		service.boardDelete(board);
		
		return "redirect:list";
	}
//	
//	//�亯 ������
//	@RequestMapping("reply_form")
//	public String reply_form() {
//		
//		return "/reply";
//	}
//	
//	@RequestMapping("reply")
//	public String reply(Board board) {
//		return "/view";
//	}
	
}

