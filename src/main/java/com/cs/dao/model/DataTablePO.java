package com.cs.dao.model;

public class DataTablePO extends BasePO {

	private int id = -1;
	
	private int uid = -1;
	
	private String info = "";
	
	private int empty = -1;
	
	private String times = "";
	
	private String names = "";
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setUid(int uid) {
		this.uid = uid;
	}
	
	public int getUid() {
		return this.uid;
	}
	
	public void setInfo(String info) {
		this.info = info;
	}
	
	public String getInfo() {
		return this.info;
	}
	
	public void setEmpty(int empty) {
		this.empty = empty;
	}
	public int getEmpty() {
		return this.empty;
	}
	
	public void setTimes(String times) {
		this.times = times;
	}
	public String getTimes() {
		return this.times;
	}
	
	public void setNames(String names) {
		this.names = names;
	}
	
	public String getNames() {
		return this.names;
	}
}
