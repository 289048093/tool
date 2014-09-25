package cn.hofan.email.dao;

import java.math.BigDecimal;
import java.util.List;

import cn.hofan.email.entity.EmailAdjunct;

public interface EmailAdjunctDao{
	
	/**
	 * 根据主键查询对象
	 * @param clazz
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public EmailAdjunct get(long id) throws Exception;
	
	/**
	 * 保存对象
	 * @param e
	 * @return
	 * @throws Exception
	 */
	public long insert(EmailAdjunct e) throws Exception;
	
	/**
	 * 更新对象
	 * @param e
	 * @return
	 * @throws Exception
	 */
	public int update(EmailAdjunct e) throws Exception;
	
	/**
	 * 根据主键删除对象，物理删除（*）
	 * @param clazz
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public int delete(long id) throws Exception;
	
	/**
	 * 查询列表
	 * @param clazz
	 * @param columns
	 * @param condition
	 * @param params
	 * @param orderBy
	 * @return
	 * @throws Exception
	 */
	public List<EmailAdjunct> find(String columns, String condition, Object[] params, String orderBy) throws Exception;
	
	/**
	 * 查询分页列表
	 * @param clazz
	 * @param columns
	 * @param condition
	 * @param params
	 * @param pageIndex
	 * @param pageSize
	 * @param orderBy
	 * @return
	 * @throws Exception
	 */
	public List<EmailAdjunct> findForPage(String columns,String condition, Object[] params,  int pageIndex, int pageSize, String orderBy) throws Exception;
	
	/**
	 * sum字段
	 * @param clazz
	 * @param column
	 * @param condition
	 * @return
	 * @throws Exception
	 */
	public BigDecimal sum(String column, String condition,Object[] params) throws Exception;
	
	/**
	 * count表
	 * @param clazz
	 * @param condition
	 * @param params
	 * @return
	 * @throws Exception
	 */
	public int count(String condition,Object[] params) throws Exception;

}
