package cn.my12306.mapper;

import java.util.ArrayList;

import cn.my12306.bean.Province;

public interface ProvinceDaoMapper {

	
	
	/**
	 * 获取省份信息的访问接口
	 * @return ArrayList<Province>
	 */
	public ArrayList<Province> getProvince();
		
}
