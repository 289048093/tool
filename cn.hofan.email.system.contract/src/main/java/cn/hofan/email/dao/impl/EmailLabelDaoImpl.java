package cn.hofan.email.dao.impl;

import java.math.BigDecimal;
import java.util.List;

import cn.hofan.email.dao.BaseDaoImpl;
import cn.hofan.email.dao.EmailLabelDao;
import cn.hofan.email.entity.EmailLabel;

public class EmailLabelDaoImpl extends BaseDaoImpl<EmailLabel> implements EmailLabelDao {

	@Override
	public EmailLabel get(int id) throws Exception {
		return super.get(EmailLabel.class, id);
	}

	@Override
	public int insert(EmailLabel e) throws Exception {
		return (Integer) super.insert(e);
	}

	@Override
	public int update(EmailLabel e) throws Exception {
		return super.update(e);
	}

	@Override
	public int delete(int id) throws Exception {
		return super.delete(EmailLabel.class, id);
	}

	@Override
	public List<EmailLabel> find(String columns, String condition,
			Object[] params, String orderBy) throws Exception {
		return super.find(EmailLabel.class, columns, condition, params, orderBy);
	}

	@Override
	public List<EmailLabel> findForPage(String columns, String condition,
			Object[] params, int pageIndex, int pageSize, String orderBy)
			throws Exception {
		return super.findForPage(EmailLabel.class, columns, condition, params, pageIndex, pageSize, orderBy);
	}

	@Override
	public BigDecimal sum(String column, String condition, Object[] params)
			throws Exception {
		return super.sum(EmailLabel.class, column, condition, params);
	}

	@Override
	public int count(String condition, Object[] params) throws Exception {
		return super.count(EmailLabel.class, condition, params);
	}
}