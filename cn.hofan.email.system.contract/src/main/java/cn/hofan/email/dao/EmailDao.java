package cn.hofan.email.dao;

import java.math.BigDecimal;
import java.util.List;

import cn.hofan.email.entity.Email;

public interface EmailDao{
	
	/**
	 * 根据主键查询对象
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public Email get(long id) throws Exception;
	
	/**
	 * 保存对象
	 * @param e
	 * @return
	 * @throws Exception
	 */
	public long insert(Email e) throws Exception;
	
	/**
	 * 更新对象
	 * @param e
	 * @return
	 * @throws Exception
	 */
	public int update(Email e) throws Exception;
	
	/**
	 * 根据主键删除对象，物理删除（*）
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public int delete(long id) throws Exception;
	
	/**
	 * 查询列表
	 * @param columns
	 * @param condition
	 * @param params
	 * @param orderBy
	 * @return
	 * @throws Exception
	 */
	public List<Email> find(String columns, String condition, Object[] params, String orderBy) throws Exception;
	
	/**
	 * 查询分页列表
	 * @param columns
	 * @param condition
	 * @param params
	 * @param pageIndex
	 * @param pageSize
	 * @param orderBy
	 * @return
	 * @throws Exception
	 */
	public List<Email> findForPage(String columns,String condition, Object[] params,  int pageIndex, int pageSize, String orderBy) throws Exception;
	
	/**
	 * sum字段
	 * @param column
	 * @param condition
	 * @return
	 * @throws Exception
	 */
	public BigDecimal sum(String column, String condition,Object[] params) throws Exception;
	
	/**
	 * count表
	 * @param condition
	 * @param params
	 * @return
	 * @throws Exception
	 */
	public int count(String condition,Object[] params) throws Exception;

    /**
     *
     * @param fromEmail
     * @param uid
     * @return
     * @throws Exception
     */
    Email findByFromEmailAndUid(String fromEmail,String uid) throws Exception;

}
