package cn.my12306.service.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.my12306.bean.Province;
import cn.my12306.dao.ProvinceDao;
import cn.my12306.service.ProvinceDaoService;

@Service("ProvinceDaoService")
public class ProvinceDaoServiceImpl implements ProvinceDaoService {
	
	@Autowired
	private ProvinceDao provinceDao;
	
	@Override
	public ArrayList<Province> getProvince() {

		return provinceDao.getProvince();
	}

}
