package cn.my12306.dao;

import java.util.ArrayList;
import cn.my12306.bean.UserType;

public interface UserTypeDao{
	/**
	 * 获取用户类型
	 * @return ArrayList<UserType>
	 */
	public ArrayList<UserType> getUserType();
}
