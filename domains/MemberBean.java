package com.bitcamp.domains;

public class MemberBean {
	private String name,id,pw,ssn,blood;
	private double height,weight;
	
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return id;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getPw() {
		return pw;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getSsn() {
		return ssn;
	}
	public void setBlood(String blood) {
		this.blood  = blood;
	}
	public String getBlood() {
		return blood;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double hetHeight() {
		return height;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getWeight() {
		return weight;
	}
	
	@Override
	public String toString() {
		return String.format("회원가입 :\n"
				+ "이름 :%s\n"
				+ "아이디 :%s\n"
				+ "비밀번호 :%s\n"
				+ "주민번호 :%s\n"
				+ "혈액형 :%s\n"
				+ "키 :%s\n"
				+ "몸무게 :%s\n", name,id,pw,ssn,blood,height,weight);
	}
}
