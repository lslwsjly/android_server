package com.cs.dao.model;


public class StationPO extends BasePO {

	private int id = -1;
	
	private double lng = -1;
	
	private double lat = -1;
	
	private String info = "";
	
	private int tid = -1;
	
	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getLat() {
		return this.lat;
	}
	public void setLat(double lat) {
		this.lat = lat;
	}
	public double getLng() {
		return this.lng;
	}
	public String getInfo() {
		return this.info;
	}
	public void setLng(double lng) {
		this.lng = lng;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public int getTid() {
		return this.tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
}
