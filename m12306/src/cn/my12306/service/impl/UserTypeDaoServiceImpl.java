package cn.my12306.service.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.my12306.bean.UserType;
import cn.my12306.dao.UserTypeDao;
import cn.my12306.service.UserTypeDaoService;

@Service("UserTypeDaoService")
public class UserTypeDaoServiceImpl implements UserTypeDaoService {
	
	@Autowired
	private UserTypeDao userTypeDao;
	
	@Override
	public ArrayList<UserType> getUserType() {
		
		return userTypeDao.getUserType();
	}

}
