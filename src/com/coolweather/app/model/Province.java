package com.coolweather.app.model;

public class Province {
	private int id;
	private String province_name;
	private String province_code;
	
	public int getId(){
		return id;
	}
	public String getProvinceName(){
		return province_name;
	}
	public String getProvinceCode(){
		return province_code;
	}
	public void setId(int id){
		this.id=id;
	}
	public void setProvinceName(String provincename){
		this.province_name=provincename;
	}
	public void setProvinceCode(String provincecode){
		this.province_code=provincecode;
	}

}
