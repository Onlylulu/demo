package cn.my12306.service;

import java.util.ArrayList;

import cn.my12306.bean.CertType;
/**
 * 证件类型接口
 * 方法：查询数据库所有证件类型
 * @author Administrator
 *
 */


public interface CertTypeDaoService {
	
	public  ArrayList<CertType> getCertType();
}
