package cn.my12306.dao.impl;

import java.sql.ResultSet;

import org.springframework.stereotype.Repository;

import cn.my12306.bean.User;
import cn.my12306.dao.BaseDao;
import cn.my12306.dao.UserDao;

@Repository("UserDao")
public class UserDaoImpl implements UserDao{
	/**
	 * 获取用户信息访问数据库的操作类
	 * 
	 */
	//注册用户
	public int add(User user){
		String sql="INSERT INTO users(username,pwd,rule,realname,sex,city,certType,cert,birthday,userType,content,status,loginIp,imagePath )"+
					" VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		Object[] objs={user.getUsername(),user.getPwd(),user.getRule(),user.getRealname(),
					   user.getSex(),user.getCity(),user.getCertType(),user.getCert(),
					   user.getBirthday(),user.getUserType(),user.getContent(),
					   user.getStatus(),user.getLoginIp(),user.getImagePath()};
		return BaseDao.executeUpdate(sql, objs);
	}

	//查询用户
	public User getUser(String username,String pwd){
		String sql="SELECT id,username,rule,realname,sex,city,certType,cert, "
				+ " birthday,userType,content,status,loginIp,imagePath "
				+ " FROM users WHERE username=? AND pwd=? ";
		Object[] objs={username,pwd};
		User user=null;
		ResultSet rs=null;
		try {
			rs=BaseDao.executeQuery(sql, objs);
			while(rs.next()){
				user=new User(rs.getInt("id"),rs.getString("username"),null,
							  rs.getInt("rule"),rs.getString("realname"),
							  rs.getInt("sex"),rs.getString("city"),
							  rs.getString("certType"),rs.getString("cert"),
							  rs.getString("birthday"),rs.getString("userType"),
							  rs.getString("content"),rs.getInt("status"),
							  rs.getString("loginIp"),rs.getString("imagePath"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			BaseDao.getclose(rs);
		}
		return user;
	}

	//管理员根据id修改用户
	@Override
	public int adminUpdate(User user) {
		String sql="UPDATE users SET username=?,pwd=?,realname=?,sex=?,city=?,"
				+ "certType=?,cert=?,birthday=?,userType=?,content=?,status=?,loginIp=?,imagePath=?"
				+ " WHERE id=?";

		return 0;
	}

	//普通用户修改自己信息
	@Override
	public int generalUpdate(User user) {
		String sql="UPDATE users SET username=?,pwd=?,realname=?,sex=?,city=?,"
				+ "certType=?,cert=?,birthday=?,userType=?,content=?,status=?,loginIp=?,imagePath=?"
				+ " WHERE id=?";
		Object[] objs={user.getUsername(),user.getPwd(),user.getRealname(),user.getSex(),
					   user.getCity(),user.getCertType(),user.getCert(),
					   user.getBirthday(),user.getUserType(),user.getContent(),
					   user.getStatus(),user.getLoginIp(),user.getImagePath(),
					   user.getId()};
		return BaseDao.executeUpdate(sql, objs);
	}
	
	//查询用户根据 真实名字、性别、证件类型、证件号码、旅客类型
	@Override
	public User getUsers(String realname, int sex, String certType,
			String cert, String userType) {
		String sql="select * from users where realname=? and sex=? and certType=? and "
				+ "cert=? and userType=?";
		Object[] objs={realname,sex,certType,cert,userType};
		User user=null;
		ResultSet rs=null;
		try {
			rs=BaseDao.executeQuery(sql, objs);
			while(rs.next()){
				user=new User(rs.getInt("id"),rs.getString("username"),null,
						  	  rs.getInt("rule"),rs.getString("realname"),
						      rs.getInt("sex"),rs.getString("city"),
						      rs.getString("certType"),rs.getString("cert"),
						      rs.getString("birthday"),rs.getString("userType"),
						      rs.getString("content"),rs.getInt("status"),
						      rs.getString("loginIp"),rs.getString("imagePath"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			BaseDao.getclose(rs);
		}
		return user;
	}


}
