package cn.my12306.service;

import java.util.ArrayList;

import cn.my12306.bean.Province;

/**
 * 省份接口
 * 方法：查询数据库所有省份
 * @author Administrator
 *
 */
public interface ProvinceDaoService {

	
	public ArrayList<Province> getProvince();
}
