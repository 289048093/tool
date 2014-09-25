package cn.hofan.email.dao.impl;

import java.math.BigDecimal;
import java.util.List;

import cn.hofan.email.dao.BaseDaoImpl;
import cn.hofan.email.dao.EmailArchiveConfigDao;
import cn.hofan.email.entity.EmailArchiveConfig;

public class EmailArchiveConfigDaoImpl extends BaseDaoImpl<EmailArchiveConfig> implements EmailArchiveConfigDao {

	@Override
	public EmailArchiveConfig get(int id) throws Exception {
		return super.get(EmailArchiveConfig.class, id);
	}

	@Override
	public int insert(EmailArchiveConfig e) throws Exception {
		return (Integer) super.insert(e);
	}

	@Override
	public int update(EmailArchiveConfig e) throws Exception {
		return super.update(e);
	}

	@Override
	public int delete(int id) throws Exception {
		return super.delete(EmailArchiveConfig.class, id);
	}

	@Override
	public List<EmailArchiveConfig> find(String columns, String condition,
			Object[] params, String orderBy) throws Exception {
		return super.find(EmailArchiveConfig.class, columns, condition, params, orderBy);
	}

	@Override
	public List<EmailArchiveConfig> findForPage(String columns, String condition,
			Object[] params, int pageIndex, int pageSize, String orderBy)
			throws Exception {
		return super.findForPage(EmailArchiveConfig.class, columns, condition, params, pageIndex, pageSize, orderBy);
	}

	@Override
	public BigDecimal sum(String column, String condition, Object[] params)
			throws Exception {
		return super.sum(EmailArchiveConfig.class, column, condition, params);
	}

	@Override
	public int count(String condition, Object[] params) throws Exception {
		return super.count(EmailArchiveConfig.class, condition, params);
	}
}