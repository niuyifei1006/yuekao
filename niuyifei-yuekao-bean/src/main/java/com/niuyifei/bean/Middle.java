package com.niuyifei.bean;

public class Middle {
	private int mid;
	private int sid;
	public Middle() {
		super();
	}
	public Middle(int mid, int sid) {
		super();
		this.mid = mid;
		this.sid = sid;
	}
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	@Override
	public String toString() {
		return "Middle [mid=" + mid + ", sid=" + sid + "]";
	}
}
