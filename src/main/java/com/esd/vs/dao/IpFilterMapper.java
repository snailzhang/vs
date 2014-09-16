package com.esd.vs.dao;

import java.util.List;

import com.esd.vs.model.IpFilter;

public interface IpFilterMapper {

	int deleteByPrimaryKey(Integer id);

	int insert(IpFilter record);

	int insertSelective(IpFilter record);

	IpFilter selectByPrimaryKey(Integer id);

	List<IpFilter> selectByAppId(String appid);

	int updateByPrimaryKeySelective(IpFilter record);

	int updateByPrimaryKey(IpFilter record);
}