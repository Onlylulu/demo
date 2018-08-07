package cn.my12306.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.my12306.bean.CertType;
import cn.my12306.bean.City;
import cn.my12306.bean.Province;
import cn.my12306.bean.UserType;
import cn.my12306.dao.CertTypeDao;
import cn.my12306.dao.CityDao;
import cn.my12306.dao.ProvinceDao;
import cn.my12306.dao.UserTypeDao;




@Controller
public class DropDownBoxController {
	
	//导入证件类型
	@Autowired
	private CertTypeDao ertTypeDao;
	//导入城市类型
	@Autowired
	private CityDao cityDao;
	//导入省份类型
	@Autowired
	private ProvinceDao provinceDao;
	//导入用户类型
	@Autowired
	private UserTypeDao userTypeDao;
	
	@RequestMapping(value="/DropDownBox",method={RequestMethod.GET})
	public @ResponseBody String DropDownBox() throws JsonGenerationException, JsonMappingException, IOException{
		
		//取各个下拉框信息
		ArrayList<CertType> certTypes=ertTypeDao.getCertType();
		ArrayList<City> citys=cityDao.getCity();
		ArrayList<Province> provinces=provinceDao.getProvince();
		ArrayList<UserType> userTypes=userTypeDao.getUserType();
		
		//数据存入map
		HashMap<String, ArrayList> map=new HashMap<String, ArrayList>();
		map.put("certTypes", certTypes);
		map.put("citys", citys);
		map.put("provinces", provinces);
		map.put("userTypes", userTypes);
		
		//转json格式
		ObjectMapper mapper=new ObjectMapper();
		return mapper.writeValueAsString(map);
	}
}
