package cn.my12306.dao.impl;

import java.sql.ResultSet;
import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import cn.my12306.bean.UserType;
import cn.my12306.dao.BaseDao;
import cn.my12306.dao.UserTypeDao;

@Repository("UserTypeDao")
public class UserTypeDaoImpl implements UserTypeDao{
	/**
	 * 获取用户类型访问数据库的操作类
	 */

	public ArrayList<UserType> getUserType(){
		ArrayList<UserType> list=new ArrayList<UserType>();
		UserType userType=null;
		ResultSet rs=null;
		String sql="select id,content from userType";
		try {
			rs=BaseDao.executeQuery(sql, null);
			while(rs.next()){
				userType=new UserType(rs.getInt("id"),rs.getString("content"));
				list.add(userType);
				//System.out.println(rs.getString(2));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			BaseDao.getclose(rs);
		}
		return list;
	}
}
