package com.bitcamp.service;
import com.bitcamp.domains.MemberBean;
public class MemberService {
	private MemberBean[] members;
	private int count;
	
	public MemberService(){
		members = new MemberBean[2];
		count = 0;
	}
	
	public String join(MemberBean param) {
		String result = "회원가입되셨습니다";
		members[count] = param;
		count++;
		return result;
		
	}
	public String getMyPage(MemberBean param) {
		String result="당신정보입니다.";
		
		return param.toString();
	}
	public String changePassWord(MemberBean param) {
		String result = "";
		
		return result;
	}
	public String withDraw(MemberBean param) {
		String result = "";
		
		return result;
	}
	public String list() {
		String result = "";
		for(int i=0;i<2;i++) {
			result +=members[i].toString();
		}
		return result;
	}
	public MemberBean findId(String id) {
		MemberBean member = new MemberBean();
		for(int i=0;i<2;i++) {
			if(id.equals(members[i].getId())) {
				member = members[i];
			}
		}
		return member;
	}
}
