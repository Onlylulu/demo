package cn.my12306.bean;

public class UserType {
	//用户类型
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
	//无参、有参构造
	public UserType() {
		super();
	}
	public UserType(int id, String content) {
		super();
		this.id = id;
		this.content = content;
	}
	
	
}
