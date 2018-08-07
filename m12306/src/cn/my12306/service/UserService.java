package cn.my12306.service;

import java.security.MessageDigest;

import cn.my12306.bean.User;
import cn.my12306.dao.UserDao;
import cn.my12306.dao.impl.UserDaoImpl;

/**
 * 用户接口
 
 * @author 
 *
 */
public interface UserService {
	
	/**
	 * 注册业务
	 * @param user 用户对象
	 * @return 1 注册成功  非1 注册失败
	 */
	public int register(User user);
	
	/**
	 * 登录业务
	 * @param name
	 * @param pwd
	 * @return
	 */
	public User login(String name,String pwd);

	/**
	 * 普通用户修改业务
	 * @param user 用户对象
	 * @return 1 修改成功  非1 修改失败
	 */	
	public int general(User user);

	/**
	 * 管理员用户查询
	 */	
	public User adminSelcet(String realname, int sex, String certType,
			String cert, String userType);

	public int adminUpdate(int id);

	/**
	 * 加工密码
	 */
	public String getPwd(String pwd);
}
