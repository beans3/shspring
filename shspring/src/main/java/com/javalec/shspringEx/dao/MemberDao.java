package com.javalec.shspringEx.dao;

import java.util.ArrayList;

import com.javalec.shspringEx.model.Member;

public interface MemberDao {
	
	public void memberInsert(Member member);
	public ArrayList<Member> memberSelect(String id);
	public Member memberUpdate(String id);
	public void memberDelete(String id);

}
