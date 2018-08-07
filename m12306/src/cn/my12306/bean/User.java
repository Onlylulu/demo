package cn.my12306.bean;

public class User {
	//用户属性
	private int id;
	private String username;
	private String pwd;
	private int rule;
	private String realname;
	private int sex;
	private String city;
	private String certType;
	private String cert;
	private String birthday;
	private String userType;
	private String content;
	private int status;
	private String loginIp;
	private String imagePath;
	//set、get方法
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public int getRule() {
		return rule;
	}
	public void setRule(int rule) {
		this.rule = rule;
	}
	public String getRealname() {
		return realname;
	}
	public void setRealname(String realname) {
		this.realname = realname;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCertType() {
		return certType;
	}
	public void setCertType(String certType) {
		this.certType = certType;
	}
	public String getCert() {
		return cert;
	}
	public void setCert(String cert) {
		this.cert = cert;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getLoginIp() {
		return loginIp;
	}
	public void setLoginIp(String loginIp) {
		this.loginIp = loginIp;
	}
	public String getImagePath() {
		return imagePath;
	}
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	
	//无参、有参构造
	public User() {
		super();
	}
	public User(int id, String username, String pwd, int rule, String realname,
			int sex, String city, String certType, String cert,
			String birthday, String userType, String content, int status,
			String loginIp, String imagePath) {
		super();
		this.id = id;
		this.username = username;
		this.pwd = pwd;
		this.rule = rule;
		this.realname = realname;
		this.sex = sex;
		this.city = city;
		this.certType = certType;
		this.cert = cert;
		this.birthday = birthday;
		this.userType = userType;
		this.content = content;
		this.status = status;
		this.loginIp = loginIp;
		this.imagePath = imagePath;
	}
	
}
