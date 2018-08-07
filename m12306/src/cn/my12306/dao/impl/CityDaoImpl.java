package cn.my12306.dao.impl;
import cn.my12306.bean.City;
import cn.my12306.dao.BaseDao;
import cn.my12306.dao.CityDao;

import java.sql.ResultSet;
import java.util.ArrayList;

import org.springframework.stereotype.Repository;


@Repository("CityDao")
public class CityDaoImpl implements CityDao{
	/**
	 * 获取所有城市信息访问数据库的操作类
	 */

	public ArrayList<City> getCity(){
		ArrayList<City> list=new ArrayList<City>();
		City city=null;
		ResultSet rs=null;
		String sql="select id,cityId,city,province from city";
		try {
			rs=BaseDao.executeQuery(sql, null);
			while(rs.next()){
				city=new City(rs.getInt("id"),rs.getInt("cityId"),
						rs.getString("city"),rs.getString("province"));
				list.add(city);
				}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			BaseDao.getclose(rs);
		}
		return list;
	}
}
