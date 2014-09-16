/*
 * Copyright (c) 2013 哈尔滨亿时代数码科技开发有限公司（www.hrbesd.com）. All rights reserved.
 * 
 * HRBESD PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.esd.vs.controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.junit.runner.Request;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cloopen.rest.sdk.CCPRestSDK;
import com.esd.vs.model.IpFilter;
import com.esd.vs.model.Sms;
import com.esd.vs.service.IpFilterService;
import com.esd.vs.service.SMSService;

/**
 * 
 * 主页处理
 * 
 * @author zhangjianzong
 * 
 */
@Controller
@RequestMapping(value = "/sms")
public class SMSController {
	private static final Logger logger = LoggerFactory.getLogger(SMSController.class);
	@Value("${accountSid}")
	private String accountSid;
	@Value("${accountToken}")
	private String accountToken;
	@Value("${appId}")
	private String appId;

	@Autowired
	private SMSService smsService;
	@Autowired
	private IpFilterService ipFilterService;

	/**
	 * 登录页面
	 * 
	 * @return
	 */
	@RequestMapping(value = "/send", method = RequestMethod.GET)
	@ResponseBody
	public String send(HttpServletRequest request, HttpSession session) {
		Sms sms = new Sms();
		String resultCode = "-1";
		String ip = getRemoteAddress(request);
		//String appId = request.getParameter("appId");
		if (ipFilter(appId, ip) == false) {
			logger.debug("无权限访问");
			return resultCode;
		}
		logger.debug("有权限访问");
		String phone = request.getParameter("phone");
		String code = request.getParameter("code");
		sms.setIp(ip);
		sms.setPhone(phone);
		sms.setCode(code);
		sms.setAccountSid(accountSid);
		sms.setAccountToken(accountToken);
		sms.setAppid(appId);
		sms.setCreateMethod(new Throwable().getStackTrace()[0].toString());
		smsService.save(sms);
		// logger.debug("phone:{} code:{}", phone, code);
		//
		// HashMap<String, Object> result = null;
		// CCPRestSDK restAPI = new CCPRestSDK();
		// restAPI.init("sandboxapp.cloopen.com", "8883");//
		// 初始化服务器地址和端口，格式如下，服务器地址不需要写https://
		// restAPI.setAccount(accountSid, accountToken);// 初始化主帐号名称和主帐号令牌
		// restAPI.setAppId(appId);// 初始化应用ID
		// result = restAPI.sendTemplateSMS(phone, "1", new String[] { code });
		//
		// String resultCode = String.valueOf(result.get("statusCode"));
		// sms.setUpdateMethod(new Throwable().getStackTrace()[0].toString());
		// sms.setStatusCode(resultCode);
		// sms.setResult(result.get("data").toString());
		// if ("000000".equals(resultCode) == false) {
		// logger.error("错误码=" + result.get("statusCode") + " 错误信息= " +
		// result.get("statusMsg"));
		// }
		smsService.update(sms);
		return resultCode;
	}

	
	private Boolean ParamsCheck(Request request){
		
		
		return Boolean.TRUE;
	}
	
	/**
	 * 获取远程调用IP地址
	 * 
	 * @param request
	 * @return
	 */
	private String getRemoteAddress(HttpServletRequest request) {
		String ip = request.getHeader("x-forwarded-for");
		if (ip == null || ip.length() == 0 || ip.equalsIgnoreCase("unknown")) {
			ip = request.getHeader("Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || ip.equalsIgnoreCase("unknown")) {
			ip = request.getHeader("WL-Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || ip.equalsIgnoreCase("unknown")) {
			ip = request.getRemoteAddr();
		}
		return ip;
	}

	/**
	 * IP绑定过滤
	 * @param appid
	 * @param ip
	 * @return
	 */
	public Boolean ipFilter(String appid, String ip) {
		List<IpFilter> list = ipFilterService.selectByAppId(appid);
		for (Iterator<IpFilter> iterator = list.iterator(); iterator.hasNext();) {
			IpFilter it = (IpFilter) iterator.next();
			logger.debug("ip filter:{}<==>{}", ip, it.getIp());
			if (ip.equals(it.getIp())) {
				return Boolean.TRUE;
			}
		}
		return Boolean.FALSE;
	}
}
