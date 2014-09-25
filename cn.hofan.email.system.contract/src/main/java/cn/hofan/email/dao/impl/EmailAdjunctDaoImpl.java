package cn.hofan.email.dao.impl;

import java.math.BigDecimal;
import java.util.List;

import cn.hofan.email.dao.BaseDaoImpl;
import cn.hofan.email.dao.EmailAdjunctDao;
import cn.hofan.email.entity.EmailAdjunct;

public class EmailAdjunctDaoImpl extends BaseDaoImpl<EmailAdjunct> implements EmailAdjunctDao {

	@Override
	public EmailAdjunct get(long id) throws Exception {
		return super.get(EmailAdjunct.class, id);
	}

	@Override
	public long insert(EmailAdjunct e) throws Exception {
		return (Long) super.insert(e);
	}

	@Override
	public int update(EmailAdjunct e) throws Exception {
		return super.update(e);
	}

	@Override
	public int delete(long id) throws Exception {
		return super.delete(EmailAdjunct.class, id);
	}

	@Override
	public List<EmailAdjunct> find(String columns, String condition,
			Object[] params, String orderBy) throws Exception {
		return super.find(EmailAdjunct.class, columns, condition, params, orderBy);
	}

	@Override
	public List<EmailAdjunct> findForPage(String columns, String condition,
			Object[] params, int pageIndex, int pageSize, String orderBy)
			throws Exception {
		return super.findForPage(EmailAdjunct.class, columns, condition, params, pageIndex, pageSize, orderBy);
	}

	@Override
	public BigDecimal sum(String column, String condition, Object[] params)
			throws Exception {
		return super.sum(EmailAdjunct.class, column, condition, params);
	}

	@Override
	public int count(String condition, Object[] params) throws Exception {
		return super.count(EmailAdjunct.class, condition, params);
	}
}