package com.bitcamp.controller;
import javax.swing.JOptionPane;
import com.bitcamp.service.MemberService2;
import com.bitcamp.domains.MemberBean;
public class MemberController2 {

	public static void main(String[] args) {
		MemberService2 service = new MemberService2();
		MemberBean member = null;
//MemberBean member = new MemberBean(); 이렇게 안써주는 이유는 회원 수 를 한명만 받는게 아니라 여러 회원을 받아야 하기 떄문에 
//위에 처럼 인스턴스를 초기화를 해주면 새로운 주소 공간에 회원 하나밖에 못적고 또 여러 회원 정보(인스턴스 변수들)들이 한 주소 공간에 들어가 겹치게 된다?
		while(true) {
			switch (JOptionPane.showInputDialog("0.종료\n"
					+ "1.회원가입\n"
					+ "2.마이페이지\n"
					+ "3.비번수정\n"
					+ "4.회원탈퇴\n"
					+ "5.아이디 존재체크\n"
					+ "6.로그인")) {
			case "0":
				JOptionPane.showMessageDialog(null, "시스템 종료하겠습니다.");
				return;
			case "1":
				member = new MemberBean();
//				위에 인스턴스를 초기화 혹은 생성자를 초기화하면 인스턴스의 멤버변수 중 인스턴스 변수들이 초기화된다.
				String information = JOptionPane.showInputDialog("이름,아이디,비번,주민번호,혈액형,키,몸무게");
				String arr[] = information.split(",");//위에 인포메이션을 쪼개는 메서드 그걸 배열 arr에 담는다
				member.setName(arr[0]);//인덱스번호 0인 이름 
				member.setId(arr[1]);//인덱스 번호 1인 아이디
				member.setPw(arr[2]);//인덱스 번호 2인 비번
				member.setSsn(arr[3]);//인덱스 번호 3인 주민번호
				member.setBlood(arr[4]);//인덱스 번호 4인 혈액형
				member.setHeight(Double.parseDouble(arr[5]));//원래 더블타입 키 변수를 String타입에서 더블타입으로 형변환
				member.setWeight(Double.parseDouble(arr[6]));//
				
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
				String id = JOptionPane.showInputDialog(member.getId());
				JOptionPane.showMessageDialog(null, service.existId(id));
				break;
			case "6":
				
				
				break;
			default:
				break;
			}
		}
	}

}
