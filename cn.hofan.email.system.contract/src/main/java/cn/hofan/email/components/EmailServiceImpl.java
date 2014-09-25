package cn.hofan.email.components;

import java.util.List;

import cn.hofan.email.contract.EmailService;
import cn.hofan.email.dao.EmailDao;
import cn.hofan.email.entity.Email;
import cn.hofan.spat.db.gb.util.GBConverter;
import cn.hofan.spat.db.gb.util.Result;
import cn.hofan.spat.locator.ProxyLocator;

import com.bj58.spat.gaea.server.contract.annotation.ServiceBehavior;

@ServiceBehavior(lookUP="EmailService")
public class EmailServiceImpl implements EmailService {
	
	private EmailDao emailDao = ProxyLocator.get(EmailDao.class);

	@Override
	public Email get(long id) throws Exception {
		return emailDao.get(id);
	}

	@Override
	public long insert(Email e) throws Exception {
		return emailDao.insert(e);
	}

	@Override
	public int update(Email e) throws Exception {
		return emailDao.update(e);
	}

	@Override
	public int delete(long id) throws Exception {
		return emailDao.delete(id);
	}

	@Override
	public List<Email> find(String condition,String orderBy) throws Exception {
		Result res = GBConverter.expression2Result(condition, Email.class);
		List<Email> list = emailDao.find("*", res.getSql(), res.getValues().toArray(), orderBy);
		return list;
	}

	@Override
	public List<Email> find(String columns,String condition,String orderBy) throws Exception {
		Result res = GBConverter.expression2Result(condition, Email.class);
		List<Email> list = emailDao.find(columns, res.getSql(), res.getValues().toArray(), orderBy);
		return list;
	}

	@Override
	public List<Email> findForPage(String condition,int pageIndex, int pageSize, String orderBy)
			throws Exception {
		Result res = GBConverter.expression2Result(condition, Email.class);
		return emailDao.findForPage("*", res.getSql(), res.getValues().toArray(), pageIndex, pageSize, orderBy);
	}

	@Override
	public List<Email> findForPage(String columns,String condition,int pageIndex, int pageSize, String orderBy)
			throws Exception {
		Result res = GBConverter.expression2Result(condition, Email.class);
		return emailDao.findForPage(columns, res.getSql(), res.getValues().toArray(), pageIndex, pageSize, orderBy);
	}

	@Override
	public int count(String condition) throws Exception {
		Result res = GBConverter.expression2Result(condition, Email.class);
		return emailDao.count(res.getSql(), res.getValues().toArray());
	}
}
