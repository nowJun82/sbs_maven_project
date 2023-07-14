package com.sbs.java.ssg.controller;

import com.sbs.java.ssg.dto.Member;

// session
// 현재 사용자가 이용 중인 정보
// 이 안의 정보는 사용자가 프로그램을 사용 할 때 동안은 계속 유지 됨.

public class Session {
	private Member loginedMember;

	public Member getLogindMember() {
		return loginedMember;
	}

	public void setLoginedMember(Member loginedMember) {
		this.loginedMember = loginedMember;
	}

	public boolean isLogined() {
		return loginedMember != null;
	}
}