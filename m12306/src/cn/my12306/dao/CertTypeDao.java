package cn.my12306.dao;

import java.util.ArrayList;

import cn.my12306.bean.CertType;


public interface CertTypeDao {
	/**
	 * 证件类型的数据访问接口
	 * @author lynn
	 *	增删改查
	 */
	int add(CertType certType);
	ArrayList<CertType> getCertType();
		

}
