package cn.hofan.email.components;

import java.util.List;

import cn.hofan.email.contract.EmailAdjunctService;
import cn.hofan.email.dao.EmailAdjunctDao;
import cn.hofan.email.entity.EmailAdjunct;
import cn.hofan.spat.db.gb.util.GBConverter;
import cn.hofan.spat.db.gb.util.Result;
import cn.hofan.spat.locator.ProxyLocator;

import com.bj58.spat.gaea.server.contract.annotation.ServiceBehavior;

@ServiceBehavior(lookUP="EmailAdjunctService")
public class EmailAdjunctServiceImpl implements EmailAdjunctService {
	
	private EmailAdjunctDao emailAdjunctDao = ProxyLocator.get(EmailAdjunctDao.class);

	@Override
	public EmailAdjunct get(long id) throws Exception {
		return emailAdjunctDao.get(id);
	}

	@Override
	public long insert(EmailAdjunct e) throws Exception {
		return emailAdjunctDao.insert(e);
	}

	@Override
	public int update(EmailAdjunct e) throws Exception {
		return emailAdjunctDao.update(e);
	}

	@Override
	public int delete(long id) throws Exception {
		return emailAdjunctDao.delete(id);
	}

	@Override
	public List<EmailAdjunct> find(String condition,String orderBy) throws Exception {
		Result res = GBConverter.expression2Result(condition, EmailAdjunct.class);
		List<EmailAdjunct> list = emailAdjunctDao.find("*", res.getSql(), res.getValues().toArray(), orderBy);
		return list;
	}

	@Override
	public List<EmailAdjunct> find(String columns,String condition,String orderBy) throws Exception {
		Result res = GBConverter.expression2Result(condition, EmailAdjunct.class);
		List<EmailAdjunct> list = emailAdjunctDao.find(columns, res.getSql(), res.getValues().toArray(), orderBy);
		return list;
	}

	@Override
	public List<EmailAdjunct> findForPage(String condition,int pageIndex, int pageSize, String orderBy)
			throws Exception {
		Result res = GBConverter.expression2Result(condition, EmailAdjunct.class);
		return emailAdjunctDao.findForPage("*", res.getSql(), res.getValues().toArray(), pageIndex, pageSize, orderBy);
	}

	@Override
	public List<EmailAdjunct> findForPage(String columns,String condition,int pageIndex, int pageSize, String orderBy)
			throws Exception {
		Result res = GBConverter.expression2Result(condition, EmailAdjunct.class);
		return emailAdjunctDao.findForPage(columns, res.getSql(), res.getValues().toArray(), pageIndex, pageSize, orderBy);
	}

	@Override
	public int count(String condition) throws Exception {
		Result res = GBConverter.expression2Result(condition, EmailAdjunct.class);
		return emailAdjunctDao.count(res.getSql(), res.getValues().toArray());
	}
}
