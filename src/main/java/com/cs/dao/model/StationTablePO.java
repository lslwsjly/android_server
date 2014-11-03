package com.cs.dao.model;

public class StationTablePO extends BasePO{

	private int id = -1;
	
	private String info;
	
	private int uid = -1;
	
	private int count = -1;
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setInfo(String info) {
		this.info = info;
	}
	
	public String getInfo() {
		return this.info;
	}
	
	public void setUid(int uid) {
		this.uid = uid;
	}
	
	public int getUid() {
		return this.uid;
	}
	
	public void setCount(int count) {
		this.count = count;
	}
	
	public int getCount() {
		return this.count;
	}
}
