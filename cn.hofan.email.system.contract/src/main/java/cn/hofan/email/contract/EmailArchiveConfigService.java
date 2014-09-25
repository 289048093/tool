package cn.hofan.email.contract;

import java.util.List;

import cn.hofan.email.entity.EmailArchiveConfig;

import com.bj58.spat.gaea.server.contract.annotation.OperationContract;
import com.bj58.spat.gaea.server.contract.annotation.ServiceContract;

@ServiceContract
public interface EmailArchiveConfigService {

	/**
	 * 根据主键查询对象
	 * @param clazz
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@OperationContract
	public EmailArchiveConfig get(int id) throws Exception;
	
	/**
	 * 保存对象
	 * @param e
	 * @return
	 * @throws Exception
	 */
	@OperationContract
	public int insert(EmailArchiveConfig e) throws Exception;
	
	/**
	 * 更新对象
	 * @param e
	 * @return
	 * @throws Exception
	 */
	@OperationContract
	public int update(EmailArchiveConfig e) throws Exception;
	
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
	public List<EmailArchiveConfig> find(String condition, String orderBy) throws Exception;
	
	@OperationContract
	public List<EmailArchiveConfig> find(String columns,String condition, String orderBy) throws Exception;
	
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
	public List<EmailArchiveConfig> findForPage(String condition,int pageIndex, int pageSize, String orderBy) throws Exception;
	
	@OperationContract
	public List<EmailArchiveConfig> findForPage(String columns,String condition,int pageIndex, int pageSize, String orderBy) throws Exception;
	
	
	@OperationContract
	public int count(String condition) throws Exception;
}
