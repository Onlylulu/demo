package cn.my12306.bean;

public class CertType {
	//证件类型、编号
	private int id;
	private String content;
	//set、get方法
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	//有参、无参构造
	public CertType() {
		super();
	}
	public CertType(int id, String content) {
		super();
		this.id = id;
		this.content = content;
	} 
	
}
