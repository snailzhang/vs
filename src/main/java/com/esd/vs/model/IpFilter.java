package com.esd.vs.model;

import java.util.Date;

public class IpFilter {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ip_filter.id
     *
     * @mbggenerated Tue Sep 02 10:15:00 CST 2014
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ip_filter.appid
     *
     * @mbggenerated Tue Sep 02 10:15:00 CST 2014
     */
    private String appid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ip_filter.ip
     *
     * @mbggenerated Tue Sep 02 10:15:00 CST 2014
     */
    private String ip;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ip_filter.create_time
     *
     * @mbggenerated Tue Sep 02 10:15:00 CST 2014
     */
    private Date createTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ip_filter.id
     *
     * @return the value of ip_filter.id
     *
     * @mbggenerated Tue Sep 02 10:15:00 CST 2014
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ip_filter.id
     *
     * @param id the value for ip_filter.id
     *
     * @mbggenerated Tue Sep 02 10:15:00 CST 2014
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ip_filter.appid
     *
     * @return the value of ip_filter.appid
     *
     * @mbggenerated Tue Sep 02 10:15:00 CST 2014
     */
    public String getAppid() {
        return appid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ip_filter.appid
     *
     * @param appid the value for ip_filter.appid
     *
     * @mbggenerated Tue Sep 02 10:15:00 CST 2014
     */
    public void setAppid(String appid) {
        this.appid = appid == null ? null : appid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ip_filter.ip
     *
     * @return the value of ip_filter.ip
     *
     * @mbggenerated Tue Sep 02 10:15:00 CST 2014
     */
    public String getIp() {
        return ip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ip_filter.ip
     *
     * @param ip the value for ip_filter.ip
     *
     * @mbggenerated Tue Sep 02 10:15:00 CST 2014
     */
    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ip_filter.create_time
     *
     * @return the value of ip_filter.create_time
     *
     * @mbggenerated Tue Sep 02 10:15:00 CST 2014
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ip_filter.create_time
     *
     * @param createTime the value for ip_filter.create_time
     *
     * @mbggenerated Tue Sep 02 10:15:00 CST 2014
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}