package com.bitcamp.controller;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;

import com.bitcamp.service.MemberService;
import com.bitcamp.domains.MemberBean;
public class MemberController {

	public static void main(String[] args) {
		MemberService service = new MemberService();
		MemberBean member = null;
		
		
		while(true) {
			switch (JOptionPane.showInputDialog("0.종료\n"
					+ " 1.회원가입입력\n"
					+ " 2.마이페이지\n"
					+ " 3.비밀번호 변경\n"
					+ " 4.회원탈퇴\n"
					+ " 5.회원리스트\n"
					+ " 6.아이디 찾기")) {
			case "1":
				JOptionPane.showMessageDialog(null, "회원가입을 입력하세여:");
				String information = JOptionPane.showInputDialog("이름, 아이디, 비밀번호,주민번호,혈액형,키,몸무게");
				String[] arr = information.split(",");
				member = new MemberBean();
				member.setName(arr[0]);
				member.setId(arr[1]);
				member.setPw(arr[2]);
				member.setSsn(arr[3]);
				member.setBlood(arr[4]);
				member.setHeight(Double.parseDouble(arr[5]));
				member.setWeight(Double.parseDouble(arr[6]));
				JOptionPane.showMessageDialog(null, service.join(member));
				break;
				
				
			case "2":
				JOptionPane.showMessageDialog(null, service.getMyPage(member));
				break;
			case "3":
				
				break;
			case "4":
				
				break;
			case "5":
				JOptionPane.showMessageDialog(null, service.list());
				break;
			case "6":
				String searchId= JOptionPane.showInputDialog("검색ID");
				member = service.findId(searchId);
				JOptionPane.showMessageDialog(null, member);
				
				break;
			case "0":
				JOptionPane.showMessageDialog(null, "시스템 종료하겠습니다.");
				return;
			default:
				break;
			}
		}
	}

}
