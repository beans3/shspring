package com.javalec.shspringEx.dao;

import java.util.ArrayList;

import com.javalec.shspringEx.model.Member;

public interface MemberDao {
	
	public void memberInsert(Member member);
	public ArrayList<Member> memberSelect(Member member);
	public Member onememberSelect(Member member);
	public void memberUpdate(Member member);
	public void memberDelete(Member member);

}
