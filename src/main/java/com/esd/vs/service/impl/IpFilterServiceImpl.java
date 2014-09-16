package com.esd.vs.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esd.vs.common.util.PaginationRecordsAndNumber;
import com.esd.vs.dao.IpFilterMapper;
import com.esd.vs.model.IpFilter;
import com.esd.vs.service.IpFilterService;

@Service
public class IpFilterServiceImpl implements IpFilterService {

	@Autowired
	private IpFilterMapper ipFilterMapper;

	public List<IpFilter> selectAppId(String appid) {
		List<IpFilter> ipFilter = null;
		ipFilter = ipFilterMapper.selectByAppId(appid);
		return ipFilter;
	}

	@Override
	public boolean save(IpFilter t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(IpFilter t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public IpFilter getByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PaginationRecordsAndNumber<IpFilter, Number> getPaginationRecords(IpFilter t, Integer page, Integer pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<IpFilter> selectByAppId(String appid) {
		// TODO Auto-generated method stub
		return ipFilterMapper.selectByAppId(appid);
	}

}
