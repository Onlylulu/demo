package cn.my12306.mapper;

import java.util.ArrayList;

import cn.my12306.bean.UserType;

public interface UserTypeDaoMapper {

	/**
	 * 获取用户类型
	 * @return ArrayList<UserType>
	 */
	public ArrayList<UserType> getUserType();
}
