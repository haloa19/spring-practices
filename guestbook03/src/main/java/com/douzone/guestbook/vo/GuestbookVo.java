package com.douzone.guestbook.vo;

public class GuestbookVo {
	private Long no;
	private String name;
	private String contents;
	private String password;
	private String ngDate;
	
	public Long getNo() {
		return no;
	}
	public void setNo(Long no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNgDate() {
		return ngDate;
	}
	public void setNgDate(String ngDate) {
		this.ngDate = ngDate;
	}
	@Override
	public String toString() {
		return "GuestBookVo [no=" + no + ", name=" + name + ", contents=" + contents + ", password=" + password
				+ ", ngDate=" + ngDate + "]";
	}	

}
