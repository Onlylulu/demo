package cn.my12306.service;

import java.util.ArrayList;

import cn.my12306.bean.UserType;

/**
 * 用户类型接口
 * 方法：查询数据库所有用户类型
 * @author Administrator
 *
 */
public interface UserTypeDaoService {

		public ArrayList<UserType> getUserType();
}
