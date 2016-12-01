package com.coolweather.app.model;

public class City {
	private int id;
	private String city_name;
	private String city_code;
	private int province_id;
	
	public int getId(){
		return id;
	}
	public String getCityName(){
		return city_name;
	}
	public String getCityCode(){
		return city_code;
	}
	public int getProvinceId(){
		return province_id;
	}
	public void setId(int id){
		this.id=id;
	}
	public void setCityName(String cityname){
		this.city_name=cityname;
	}
	public void setCityCode(String citycode){
		this.city_code=citycode;
	}
	public void setProvinceId(int id){
		this.province_id=id;
	}
}
