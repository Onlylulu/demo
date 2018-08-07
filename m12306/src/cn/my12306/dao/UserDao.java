package cn.my12306.dao;

import cn.my12306.bean.User;

public interface UserDao {
	//注册用户
	int add(User user);

	//查询用户根据名字和密码
	User getUser(String username,String pwd);
	
	//查询用户根据 真实名字、性别、证件类型、证件号码、旅客类型
	User getUsers(String realname,int sex,String certType,String cert,String userType);
	
	//管理员根据id修改用户
	int adminUpdate(User user);
	
	//普通用户改自己信息
	int generalUpdate(User user);
}
