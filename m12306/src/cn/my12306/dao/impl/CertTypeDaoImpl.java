package cn.my12306.dao.impl;

import java.sql.ResultSet;
import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import cn.my12306.bean.CertType;
import cn.my12306.dao.BaseDao;
import cn.my12306.dao.CertTypeDao;

@Repository("CertTypeDao")
public class CertTypeDaoImpl implements CertTypeDao{
	/**
	 * 证件类型访问数据库的操作类
	 */
	
	
	@Override
	public int add(CertType certType) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	@Override
	public ArrayList<CertType> getCertType(){
		ArrayList<CertType> list=new ArrayList<CertType>();
		CertType certType=null;
		ResultSet rs=null;
		String sql="select id,content from certtype";
		try {
			rs=BaseDao.executeQuery(sql, null);
			while(rs.next()){
				certType=new CertType(rs.getInt("id"),rs.getString("content"));
				list.add(certType);
				//System.out.println(rs.getString(2));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			BaseDao.getclose(rs);
		}
		return list;
	}

}
