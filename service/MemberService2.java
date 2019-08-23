package com.bitcamp.service;
import com.bitcamp.domains.MemberBean;
public class MemberService2 {
	/**
	 * 요구사항(기능정의)
	 * <사용자 기능>
	 * 1.회원가입
	 * 2.마이페이지
	 * 3.비번수정
	 * 4.회원탈퇴
	 * 5.아이디 존재 체크
	 * 6.로그인
	 * **********************
	 * 
	 * <관리자 기능>
	 * 1.회원목록
	 * 2.아이디 검색
	 * 3.이름 검색
	 * 4.전체 회원 수 
	 *
	 *********************************/
	
	private MemberBean[] members;//멤버변수이므로 절대 초기화 ㄴㄴ 선언만 타입은 MemberBean배열 타입
	private int count;
	
//  기본 생성자 패턴(코드 상엔 보이지 않지만 있는 존재?)
//  public 클래스이름(){} 기본생성자 정의
	public MemberService2() {
		members = new MemberBean[10];//members라는 배열 변수에 10칸의 공간(range를 걸어둔다 =범위)을 맥시멈을 만들어준다.
		count = 0;//몇 명의 회원들이 가입했는지 세주는 변수 
	}
	/**
	 * 1.회원가입
	 */
	public String join(MemberBean param) {
		String result = "회원가입되셨습니다.";
		members[count] = param;
		count++;
		return result;
	}
	
	/**
	* 2.마이페이지
	*/	
	public String getMyPage(MemberBean param) {
		String result = "";
		return param.toString();
	}
	/**
	* 3.비밀번호 변경
	*/	
	public String changePassWord(MemberBean param) {
		String result = "비밀번호가 변경되었습니다.";
	
		return result;
	}
			
	/**
	* 4.회원탈퇴
	*/	
	public String withDraw(MemberBean param) {
		String result ="";
		
		return result;
	}
	/**
	* 5.아이디 존재 체크
	*/	
	//search하는 부분은 모르면 for , if가 기본 패턴이니까 써놓고 생각 
	public String existId(String id) {//Q. 다른 메서드들은 매개변수에 객체를 전달받았는데 이 메서드 처럼 매개변수에 primitive타입 변수를 전달받았는지 궁금합니다.
		String result ="가입 가능한 아이디 입니다.";
		for(int i=0;i<count;i++) {
			if(id.equals(members[i].getId())) {
				result = "이미 존재하는 아이디";
				break;
			}
			
		}
		
		return result;
	}
	/**
	* 6.로그인(아이디 패스워드만 입력받은 상태)
	*/	
		
	public String login(MemberBean param) {
		String result = "로그인 실패";
		for(int i=0;i<count;i++) {
			if(param.getId().equals(members[i].getId())
					&&param.getPw().equals(members[i].getPw())) {
				result = "로그인 성공";
				break;
			}
		}
		
		return result;
	}
	
	
	
	/*****************************************************************************
	 * <관리자 기능>
	 * 1.회원 목록 
	 */
	public String list(MemberBean param) {
		String result = "";
		
		return result;
	}
	
	/*************************************
	 * <관리자 기능>
	 * 1.아이디 검색 
	 */
	public String findById() {
		String result = "";
		
		return result;
	}
	
	/*************************************
	 * <관리자 기능>
	 * 1.이름 검색
	 */
	public String findName() {
		String result ="";
		
		return result;
	}
	
	/*************************************
	 * <관리자 기능>
	 * 1.전체 회원 수  
	 */
	public String countAll() {
		String result = "";
		
		return result;
	}
	
	
	
}