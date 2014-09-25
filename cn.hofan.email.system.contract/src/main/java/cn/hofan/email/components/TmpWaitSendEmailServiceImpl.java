package cn.hofan.email.components;

import java.util.List;

import cn.hofan.email.contract.TmpWaitSendEmailService;
import cn.hofan.email.dao.TmpWaitSendEmailDao;
import cn.hofan.email.entity.TmpWaitSendEmail;
import cn.hofan.spat.db.gb.util.GBConverter;
import cn.hofan.spat.db.gb.util.Result;
import cn.hofan.spat.locator.ProxyLocator;

import com.bj58.spat.gaea.server.contract.annotation.ServiceBehavior;

@ServiceBehavior(lookUP="TmpWaitSendEmailService")
public class TmpWaitSendEmailServiceImpl implements TmpWaitSendEmailService {
	
	private TmpWaitSendEmailDao tmpWaitSendEmailDao = ProxyLocator.get(TmpWaitSendEmailDao.class);

	@Override
	public TmpWaitSendEmail get(long id) throws Exception {
		return tmpWaitSendEmailDao.get(id);
	}

	@Override
	public long insert(TmpWaitSendEmail e) throws Exception {
		return tmpWaitSendEmailDao.insert(e);
	}

	@Override
	public int update(TmpWaitSendEmail e) throws Exception {
		return tmpWaitSendEmailDao.update(e);
	}

	@Override
	public int delete(long id) throws Exception {
		return tmpWaitSendEmailDao.delete(id);
	}

	@Override
	public List<TmpWaitSendEmail> find(String condition,String orderBy) throws Exception {
		Result res = GBConverter.expression2Result(condition, TmpWaitSendEmail.class);
		List<TmpWaitSendEmail> list = tmpWaitSendEmailDao.find("*", res.getSql(), res.getValues().toArray(), orderBy);
		return list;
	}

	@Override
	public List<TmpWaitSendEmail> find(String columns,String condition,String orderBy) throws Exception {
		Result res = GBConverter.expression2Result(condition, TmpWaitSendEmail.class);
		List<TmpWaitSendEmail> list = tmpWaitSendEmailDao.find(columns, res.getSql(), res.getValues().toArray(), orderBy);
		return list;
	}

	@Override
	public List<TmpWaitSendEmail> findForPage(String condition,int pageIndex, int pageSize, String orderBy)
			throws Exception {
		Result res = GBConverter.expression2Result(condition, TmpWaitSendEmail.class);
		return tmpWaitSendEmailDao.findForPage("*", res.getSql(), res.getValues().toArray(), pageIndex, pageSize, orderBy);
	}

	@Override
	public List<TmpWaitSendEmail> findForPage(String columns,String condition,int pageIndex, int pageSize, String orderBy)
			throws Exception {
		Result res = GBConverter.expression2Result(condition, TmpWaitSendEmail.class);
		return tmpWaitSendEmailDao.findForPage(columns, res.getSql(), res.getValues().toArray(), pageIndex, pageSize, orderBy);
	}

	@Override
	public int count(String condition) throws Exception {
		Result res = GBConverter.expression2Result(condition, TmpWaitSendEmail.class);
		return tmpWaitSendEmailDao.count(res.getSql(), res.getValues().toArray());
	}
}
