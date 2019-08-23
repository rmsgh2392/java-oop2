package com.bitcamp.controller;
import javax.swing.JOptionPane;

import com.bitcamp.domains.MemberBean2;
import com.bitcamp.service.MemberService2;
public class AdminController {

	public static void main(String[] args) {
		MemberBean2 member = null;
		MemberService2 service = new MemberService2();
		while(true) {
			switch (JOptionPane.showInputDialog("0.종료\n"
					+ "1.회원목록\n"
					+ "2.아이디 검색\n"
					+ "3.이름검색\n"
					+ "4.전체 회원수")) {
			case "0":
				JOptionPane.showMessageDialog(null, "시스템 종료하겠습니다.");
				break;
			case "1":
				
				
				
				break;
			case "2":
				
				break;
			case "3":
				
				break;
			case "4":
				
				break;

			default:
				break;
			}
		}
		
		
	}

}
