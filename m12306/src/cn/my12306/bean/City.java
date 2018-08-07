package cn.my12306.bean;

public class City {
	//城市编号、属性、所属省份
	private int id;
	private int cityId;
	private String city;
	private String province;
	//set、get方法
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCityId() {
		return cityId;
	}
	public void setCityId(int cityId) {
		this.cityId = cityId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	
	
	//有参 无参 构造
	public City() {
		super();
	}
	public City(int id, int cityId, String city, String province) {
		super();
		this.id = id;
		this.cityId = cityId;
		this.city = city;
		this.province = province;
	}
	
	
}
