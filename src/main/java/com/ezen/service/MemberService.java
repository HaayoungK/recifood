package com.ezen.service;

import java.util.List;

import com.ezen.entity.Member;

public interface MemberService {
	
	void updateMember(Member member); // 회원 수정
	
	void deleteMember(Member member); // 회원 탈퇴
	
	Member getMember(Member member);
	
	List<Member> getMemberList(Member Member);
}
