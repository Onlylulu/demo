package cn.my12306.service.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.my12306.bean.CertType;
import cn.my12306.dao.CertTypeDao;
import cn.my12306.service.CertTypeDaoService;

@Service("CertTypeDaoService")
public class CertTypeDaoServiceImpl implements CertTypeDaoService {
	
	
	@Autowired	
	private CertTypeDao certTypeDao;
	
	@Override
	public ArrayList<CertType> getCertType() {
		return certTypeDao.getCertType();
	}

}
