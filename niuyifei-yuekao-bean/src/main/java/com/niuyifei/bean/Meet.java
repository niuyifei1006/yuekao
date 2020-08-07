package com.niuyifei.bean;

public class Meet {
	private Integer mid;
	private Integer code;
	private String mname;
	private Integer tid;
	private String starttime;
	private String endtime;
	private String createtime;
	
	private String tname;
	private String sname;
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Meet(Integer mid, Integer code, String mname, Integer tid, String starttime, String endtime,
			String createtime, String tname, String sname) {
		super();
		this.mid = mid;
		this.code = code;
		this.mname = mname;
		this.tid = tid;
		this.starttime = starttime;
		this.endtime = endtime;
		this.createtime = createtime;
		this.tname = tname;
		this.sname = sname;
	}
	public Meet() {
		super();
	}
	public Meet(Integer mid, Integer code, String mname, Integer tid, String starttime, String endtime,
			String createtime) {
		super();
		this.mid = mid;
		this.code = code;
		this.mname = mname;
		this.tid = tid;
		this.starttime = starttime;
		this.endtime = endtime;
		this.createtime = createtime;
	}
	public Integer getMid() {
		return mid;
	}
	public void setMid(Integer mid) {
		this.mid = mid;
	}
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public Integer getTid() {
		return tid;
	}
	public void setTid(Integer tid) {
		this.tid = tid;
	}
	public String getStarttime() {
		return starttime;
	}
	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}
	public String getEndtime() {
		return endtime;
	}
	public void setEndtime(String endtime) {
		this.endtime = endtime;
	}
	public String getCreatetime() {
		return createtime;
	}
	public void setCreatetime(String createtime) {
		this.createtime = createtime;
	}
	@Override
	public String toString() {
		return "Meet [mid=" + mid + ", code=" + code + ", mname=" + mname + ", tid=" + tid + ", starttime=" + starttime
				+ ", endtime=" + endtime + ", createtime=" + createtime + ", tname=" + tname + ", sname=" + sname + "]";
	}
}