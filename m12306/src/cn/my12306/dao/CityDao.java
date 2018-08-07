package cn.my12306.dao;
import cn.my12306.bean.City;
import java.util.ArrayList;

public interface CityDao {
	/**
	 * 城市数据访问接口
	 * @author lynn
	 *
	 */
	ArrayList<City> getCity();
}
