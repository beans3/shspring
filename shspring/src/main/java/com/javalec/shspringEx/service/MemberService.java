package com.javalec.shspringEx.service;

import java.util.ArrayList;

import com.javalec.shspringEx.model.Member;

public interface MemberService {
	
	public void memberJoin(Member member);
	public ArrayList<Member> memberList(Member member);
	public void memberModify(Member member);
	public void memberDelete(Member member);

}
