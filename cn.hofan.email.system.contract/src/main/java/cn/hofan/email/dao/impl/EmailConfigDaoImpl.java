package cn.hofan.email.dao.impl;

import java.math.BigDecimal;
import java.util.List;

import cn.hofan.email.dao.BaseDaoImpl;
import cn.hofan.email.dao.EmailConfigDao;
import cn.hofan.email.entity.EmailConfig;

public class EmailConfigDaoImpl extends BaseDaoImpl<EmailConfig> implements EmailConfigDao {

	@Override
	public EmailConfig get(int id) throws Exception {
		return super.get(EmailConfig.class, id);
	}

	@Override
	public int insert(EmailConfig e) throws Exception {
		return (Integer) super.insert(e);
	}

	@Override
	public int update(EmailConfig e) throws Exception {
		return super.update(e);
	}

	@Override
	public int delete(int id) throws Exception {
		return super.delete(EmailConfig.class, id);
	}

	@Override
	public List<EmailConfig> find(String columns, String condition,
			Object[] params, String orderBy) throws Exception {
		return super.find(EmailConfig.class, columns, condition, params, orderBy);
	}

	@Override
	public List<EmailConfig> findForPage(String columns, String condition,
			Object[] params, int pageIndex, int pageSize, String orderBy)
			throws Exception {
		return super.findForPage(EmailConfig.class, columns, condition, params, pageIndex, pageSize, orderBy);
	}

	@Override
	public BigDecimal sum(String column, String condition, Object[] params)
			throws Exception {
		return super.sum(EmailConfig.class, column, condition, params);
	}

	@Override
	public int count(String condition, Object[] params) throws Exception {
		return super.count(EmailConfig.class, condition, params);
	}
}