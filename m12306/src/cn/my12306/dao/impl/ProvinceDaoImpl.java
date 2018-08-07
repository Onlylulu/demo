package cn.my12306.dao.impl;

import java.sql.ResultSet;
import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import cn.my12306.bean.Province;
import cn.my12306.dao.BaseDao;
import cn.my12306.dao.ProvinceDao;

@Repository("ProvinceDao")
public class ProvinceDaoImpl implements ProvinceDao{
	/**
	 * 获取省份信息访问数据库的操作类
	 */
	
	public ArrayList<Province> getProvince(){
		ArrayList<Province> list=new ArrayList<Province>();
		Province province=null;
		ResultSet rs=null;
		String sql="select id,provinceId,province from province";
		try {
			rs=BaseDao.executeQuery(sql, null);
			while(rs.next()){
				province=new Province(rs.getInt("id"),
						  rs.getString("provinceId"),
						  rs.getString("province"));
				list.add(province);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			BaseDao.getclose(rs);
		}
		return list;
	}
}
