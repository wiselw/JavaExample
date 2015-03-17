package com.json.demo;

import java.util.List;


public class Project {
	private int success;
	private int fail;
	private int skip;
	private int total;
	private List<Suite> suites;
	public int getSuccess() {
		return success;
	}
	public void setSuccess(int success) {
		this.success = success;
	}
	public int getFail() {
		return fail;
	}
	public void setFail(int fail) {
		this.fail = fail;
	}
	public int getSkip() {
		return skip;
	}
	public void setSkip(int skip) {
		this.skip = skip;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public List<Suite> getSuites() {
		return suites;
	}
	public void setSuites(List<Suite> suites) {
		this.suites = suites;
	}
}
