package cn.my12306.service;

import java.util.ArrayList;

import cn.my12306.bean.City;

/**
 * 城市接口
 * 方法：查询数据库所有城市
 * @author Administrator
 *
 */
public interface CityDaoService {
	
	ArrayList<City> getCity();
}
