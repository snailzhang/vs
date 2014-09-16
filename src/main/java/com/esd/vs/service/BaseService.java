package com.esd.vs.service;

import com.esd.vs.common.util.PaginationRecordsAndNumber;

/**
 * 通用service接口
 * 
 * @author Administrator
 * 
 * @param <T>
 */
public interface BaseService<T> {
	/**
	 * save : 保存
	 * 
	 * @param t
	 * @return boolean
	 */
	boolean save(T t);

	/**
	 * delete : 根据id删除
	 * 
	 * @param id
	 * @return boolean
	 */
	boolean delete(Integer id);

	/**
	 * update ：根据主键更新
	 * 
	 * @param t
	 * @return boolean
	 */
	boolean update(T t);

	/**
	 * getByPrimaryKey : 根据主键id查询一条数据,其中的数据已经处理成可供前台显示的
	 * 
	 * @param id
	 * @return T
	 */
	T getByPrimaryKey(Integer id);

	/**
	 * getPaginationRecords: 分页查询
	 * 
	 * @param t
	 *            : 类型对象, 其中的属性可以做为相应的查询参数
	 * @param page
	 *            : 起始页数
	 * @param pageSize
	 *            :返回条数
	 * @return PaginationRecordsAndNumber<T, Number>
	 */
	PaginationRecordsAndNumber<T, Number> getPaginationRecords(T t, Integer page, Integer pageSize);

}
