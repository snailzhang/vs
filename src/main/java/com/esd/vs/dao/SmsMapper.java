package com.esd.vs.dao;

import com.esd.vs.model.Sms;

public interface SmsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms
     *
     * @mbggenerated Mon Sep 01 16:51:30 CST 2014
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms
     *
     * @mbggenerated Mon Sep 01 16:51:30 CST 2014
     */
    int insert(Sms record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms
     *
     * @mbggenerated Mon Sep 01 16:51:30 CST 2014
     */
    int insertSelective(Sms record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms
     *
     * @mbggenerated Mon Sep 01 16:51:30 CST 2014
     */
    Sms selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms
     *
     * @mbggenerated Mon Sep 01 16:51:30 CST 2014
     */
    int updateByPrimaryKeySelective(Sms record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms
     *
     * @mbggenerated Mon Sep 01 16:51:30 CST 2014
     */
    int updateByPrimaryKey(Sms record);
}