package cn.hofan.email.contract;

import java.util.List;

import cn.hofan.email.entity.EmailConfig;

import com.bj58.spat.gaea.server.contract.annotation.OperationContract;
import com.bj58.spat.gaea.server.contract.annotation.ServiceContract;

@ServiceContract
public interface EmailConfigService {

	/**
	 * 根据主键查询对象
	 * @param clazz
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@OperationContract
	public EmailConfig get(int id) throws Exception;
	
	/**
	 * 保存对象
	 * @param e
	 * @return
	 * @throws Exception
	 */
	@OperationContract
	public int insert(EmailConfig e) throws Exception;
	
	/**
	 * 更新对象
	 * @param e
	 * @return
	 * @throws Exception
	 */
	@OperationContract
	public int update(EmailConfig e) throws Exception;
	
	/**
	 * 根据主键删除对象，物理删除（*）
	 * @param clazz
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@OperationContract
	public int delete(int id) throws Exception;
	
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
	@OperationContract
	public List<EmailConfig> find(String condition, String orderBy) throws Exception;
	
	@OperationContract
	public List<EmailConfig> find(String columns,String condition, String orderBy) throws Exception;
	
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
	@OperationContract
	public List<EmailConfig> findForPage(String condition,int pageIndex, int pageSize, String orderBy) throws Exception;
	
	@OperationContract
	public List<EmailConfig> findForPage(String columns,String condition,int pageIndex, int pageSize, String orderBy) throws Exception;
	
	
	@OperationContract
	public int count(String condition) throws Exception;
}
