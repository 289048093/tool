package cn.hofan.email.dao.impl;

import java.math.BigDecimal;
import java.util.List;

import cn.hofan.email.dao.BaseDaoImpl;
import cn.hofan.email.dao.TmpWaitSendEmailDao;
import cn.hofan.email.entity.TmpWaitSendEmail;

public class TmpWaitSendEmailDaoImpl extends BaseDaoImpl<TmpWaitSendEmail> implements TmpWaitSendEmailDao {

	@Override
	public TmpWaitSendEmail get(long id) throws Exception {
		return super.get(TmpWaitSendEmail.class, id);
	}

	@Override
	public long insert(TmpWaitSendEmail e) throws Exception {
		return (Long) super.insert(e);
	}

	@Override
	public int update(TmpWaitSendEmail e) throws Exception {
		return super.update(e);
	}

	@Override
	public int delete(long id) throws Exception {
		return super.delete(TmpWaitSendEmail.class, id);
	}

	@Override
	public List<TmpWaitSendEmail> find(String columns, String condition,
			Object[] params, String orderBy) throws Exception {
		return super.find(TmpWaitSendEmail.class, columns, condition, params, orderBy);
	}

	@Override
	public List<TmpWaitSendEmail> findForPage(String columns, String condition,
			Object[] params, int pageIndex, int pageSize, String orderBy)
			throws Exception {
		return super.findForPage(TmpWaitSendEmail.class, columns, condition, params, pageIndex, pageSize, orderBy);
	}

	@Override
	public BigDecimal sum(String column, String condition, Object[] params)
			throws Exception {
		return super.sum(TmpWaitSendEmail.class, column, condition, params);
	}

	@Override
	public int count(String condition, Object[] params) throws Exception {
		return super.count(TmpWaitSendEmail.class, condition, params);
	}
}