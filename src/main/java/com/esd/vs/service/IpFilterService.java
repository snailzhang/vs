package com.esd.vs.service;

import java.util.List;

import com.esd.vs.model.IpFilter;

public interface IpFilterService extends BaseService<IpFilter> {
	List<IpFilter> selectByAppId(String appid);
}
