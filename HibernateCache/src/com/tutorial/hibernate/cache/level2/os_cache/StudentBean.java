package com.tutorial.hibernate.cache.level2.os_cache;

public class StudentBean {
	int sid;
	String sname;
	float tot_m;

	public void setSid(int sid) {
		this.sid = sid;
	}

	public int getSid() {
		return sid;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSname() {
		return sname;
	}

	public void setTot_m(float tot_m) {
		this.tot_m = tot_m;
	}

	public float getTot_m() {
		return tot_m;
	}
}
