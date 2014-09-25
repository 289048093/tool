package cn.hofan.email.dao.impl;

import java.math.BigDecimal;
import java.util.List;

import cn.hofan.email.dao.BaseDaoImpl;
import cn.hofan.email.dao.EmailDao;
import cn.hofan.email.entity.Email;

public class EmailDaoImpl extends BaseDaoImpl<Email> implements EmailDao {

	@Override
	public Email get(long id) throws Exception {
		return super.get(Email.class, id);
	}

	@Override
	public long insert(Email e) throws Exception {
		return (Long) super.insert(e);
	}

	@Override
	public int update(Email e) throws Exception {
		return super.update(e);
	}

	@Override
	public int delete(long id) throws Exception {
		return super.delete(Email.class, id);
	}

	@Override
	public List<Email> find(String columns, String condition,
			Object[] params, String orderBy) throws Exception {
		return super.find(Email.class, columns, condition, params, orderBy);
	}

	@Override
	public List<Email> findForPage(String columns, String condition,
			Object[] params, int pageIndex, int pageSize, String orderBy)
			throws Exception {
		return super.findForPage(Email.class, columns, condition, params, pageIndex, pageSize, orderBy);
	}

	@Override
	public BigDecimal sum(String column, String condition, Object[] params)
			throws Exception {
		return super.sum(Email.class, column, condition, params);
	}

	@Override
	public int count(String condition, Object[] params) throws Exception {
		return super.count(Email.class, condition, params);
	}

    @Override
    public Email findByFromEmailAndUid(String fromEmail, String uid) throws Exception {
        List<Email> emails = find("*", "from_email=? and uidl=?", new Object[]{fromEmail, uid}, "id");
        if(emails==null || emails.isEmpty()){
            return null;
        }
        return emails.get(0);
    }
}