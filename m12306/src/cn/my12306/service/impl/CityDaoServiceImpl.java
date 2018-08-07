package cn.my12306.service.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.my12306.bean.City;
import cn.my12306.dao.CityDao;
import cn.my12306.service.CityDaoService;


@Service("CityDaoService")
public class CityDaoServiceImpl implements CityDaoService {
	
	@Autowired
	private CityDao cityDao;
	
	@Override
	public ArrayList<City> getCity() {

		return cityDao.getCity();
	}

}
