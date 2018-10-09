package com.javalec.shspringEx.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javalec.shspringEx.dao.MemberDao;
import com.javalec.shspringEx.model.Member;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	MemberDao dao;
	
	@Override
	public void memberJoin(Member member) {
		
		dao.memberInsert(member);
		
	}

	@Override
	public ArrayList<Member> memberList(Member member) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void memberModify(Member member) {
		
		dao.memberUpdate(member);
	}

	@Override
	public void memberDelete(Member member) {

		dao.memberDelete(member);
		
	}		

}
