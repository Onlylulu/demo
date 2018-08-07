package cn.my12306.bean;

public class Province {
	////省编号、类型
	private int id;
	private String provinceId;
	private String province;
	//get、set方法
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProvinceId() {
		return provinceId;
	}
	public void setProvinceId(String provinceId) {
		this.provinceId = provinceId;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	//有参、无参构造
	public Province() {
		super();
	}
	public Province(int id, String provinceId, String province) {
		super();
		this.id = id;
		this.provinceId = provinceId;
		this.province = province;
	}
	
}
