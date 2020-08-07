package com.niuyifei.bean;

public class Server {
	private Integer sid;
	private String sname;
	public Server() {
		super();
	}
	public Server(Integer sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
	}
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	@Override
	public String toString() {
		return "Server [sid=" + sid + ", sname=" + sname + "]";
	}
}
