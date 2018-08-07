package cn.my12306.service.impl;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cn.my12306.bean.User;
import cn.my12306.dao.UserDao;
import cn.my12306.service.UserService;

/**
 * 用户接口
 
 * @author 
 *
 */
@Service("UserService")
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDao dao;
	
	/**
	 * 注册业务
	 * @param user 用户对象
	 * @return 1 注册成功  非1 注册失败
	 */
	public int register(User user){
		int rs=-1;
		String pwd=user.getPwd();
		try {
			user.setPwd(this.getPwd(pwd));
		} catch (Exception e) {
			e.printStackTrace();
		}
		rs=dao.add(user);
		return rs;
	}
	
	/**
	 * 登录业务
	 * @param name
	 * @param pwd
	 * @return
	 */
	public User login(String name,String pwd)
	{
		try {
			pwd=this.getPwd(pwd);
		} catch (Exception e) {
			e.printStackTrace();
		}//加工数据
		User user=dao.getUser(name, pwd);//调用数据访问层
		return user;
	}
	/**
	 * 普通用户修改业务
	 * @param user 用户对象
	 * @return 1 修改成功  非1 修改失败
	 */	
	public int general(User user){
		int rs=-1;
		String pwd=user.getPwd();
		try {
			user.setPwd(this.getPwd(pwd));
		} catch (Exception e) {
			e.printStackTrace();
		}
		rs=dao.generalUpdate(user);
		return rs;
	}
	/**
	 * 管理员用户查询
	 */	
	public User adminSelcet(String realname, int sex, String certType,
			String cert, String userType){
		User user=dao.getUsers(realname, sex, certType, cert, userType);
		return user;
	}

	
	/**
	 * 管理员删除
	 * @param user
	 * @return
	 */
	public int adminUpdate(User user){
		int rs=1;
		return rs;
	}
	/**
	 * 加工密码
	 */
	public String getPwd(String pwd){
		MessageDigest md = null;
		try {
			md = MessageDigest.getInstance("MD5");
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		byte[] digest = md.digest(pwd.getBytes());
		String newPwd=new String(digest);
		return newPwd;
	}

	@Override
	public int adminUpdate(int id) {
		// TODO Auto-generated method stub
		return 0;
	}
}
