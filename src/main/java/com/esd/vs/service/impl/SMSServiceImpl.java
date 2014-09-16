package com.esd.vs.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esd.vs.common.util.PaginationRecordsAndNumber;
import com.esd.vs.controller.SMSController;
import com.esd.vs.dao.SmsMapper;
import com.esd.vs.model.Sms;
import com.esd.vs.service.SMSService;

@Service
public class SMSServiceImpl implements SMSService {

	private static final Logger logger = LoggerFactory.getLogger(SMSServiceImpl.class);

	@Autowired
	private SmsMapper smsMapper;

	@Override
	public boolean save(Sms t) {
		String method = new Throwable().getStackTrace()[0].toString();
		t.setCreateMethod(t.getCreateMethod() + method);
		int result = smsMapper.insert(t);
		logger.debug("insert:{}", result);
		if (result > 0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean delete(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Sms t) {
		// TODO Auto-generated method stub
		String method = new Throwable().getStackTrace()[0].toString();
		t.setUpdateMethod(t.getUpdateMethod() + method);
		int result = smsMapper.updateByPrimaryKeySelective(t);
		logger.debug("update:{}", result);
		if (result > 0) {
			return true;
		}
		return false;
	}

	@Override
	public Sms getByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PaginationRecordsAndNumber<Sms, Number> getPaginationRecords(Sms t, Integer page, Integer pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

}
