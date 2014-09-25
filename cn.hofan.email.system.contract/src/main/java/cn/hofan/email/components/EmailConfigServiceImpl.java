package cn.hofan.email.components;

import java.util.List;

import cn.hofan.email.contract.EmailConfigService;
import cn.hofan.email.dao.EmailConfigDao;
import cn.hofan.email.entity.EmailConfig;
import cn.hofan.spat.db.gb.util.GBConverter;
import cn.hofan.spat.db.gb.util.Result;
import cn.hofan.spat.locator.ProxyLocator;

import com.bj58.spat.gaea.server.contract.annotation.ServiceBehavior;

@ServiceBehavior(lookUP="EmailConfigService")
public class EmailConfigServiceImpl implements EmailConfigService {
	
	private EmailConfigDao emailConfigDao = ProxyLocator.get(EmailConfigDao.class);

	@Override
	public EmailConfig get(int id) throws Exception {
		return emailConfigDao.get(id);
	}

	@Override
	public int insert(EmailConfig e) throws Exception {
		return emailConfigDao.insert(e);
	}

	@Override
	public int update(EmailConfig e) throws Exception {
		return emailConfigDao.update(e);
	}

	@Override
	public int delete(int id) throws Exception {
		return emailConfigDao.delete(id);
	}

	@Override
	public List<EmailConfig> find(String condition,String orderBy) throws Exception {
		Result res = GBConverter.expression2Result(condition, EmailConfig.class);
		List<EmailConfig> list = emailConfigDao.find("*", res.getSql(), res.getValues().toArray(), orderBy);
		return list;
	}

	@Override
	public List<EmailConfig> find(String columns,String condition,String orderBy) throws Exception {
		Result res = GBConverter.expression2Result(condition, EmailConfig.class);
		List<EmailConfig> list = emailConfigDao.find(columns, res.getSql(), res.getValues().toArray(), orderBy);
		return list;
	}

	@Override
	public List<EmailConfig> findForPage(String condition,int pageIndex, int pageSize, String orderBy)
			throws Exception {
		Result res = GBConverter.expression2Result(condition, EmailConfig.class);
		return emailConfigDao.findForPage("*", res.getSql(), res.getValues().toArray(), pageIndex, pageSize, orderBy);
	}

	@Override
	public List<EmailConfig> findForPage(String columns,String condition,int pageIndex, int pageSize, String orderBy)
			throws Exception {
		Result res = GBConverter.expression2Result(condition, EmailConfig.class);
		return emailConfigDao.findForPage(columns, res.getSql(), res.getValues().toArray(), pageIndex, pageSize, orderBy);
	}

	@Override
	public int count(String condition) throws Exception {
		Result res = GBConverter.expression2Result(condition, EmailConfig.class);
		return emailConfigDao.count(res.getSql(), res.getValues().toArray());
	}
}
