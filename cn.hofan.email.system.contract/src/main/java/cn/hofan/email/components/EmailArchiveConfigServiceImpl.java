package cn.hofan.email.components;

import java.util.List;

import cn.hofan.email.contract.EmailArchiveConfigService;
import cn.hofan.email.dao.EmailArchiveConfigDao;
import cn.hofan.email.entity.EmailArchiveConfig;
import cn.hofan.spat.db.gb.util.GBConverter;
import cn.hofan.spat.db.gb.util.Result;
import cn.hofan.spat.locator.ProxyLocator;

import com.bj58.spat.gaea.server.contract.annotation.ServiceBehavior;

@ServiceBehavior(lookUP="EmailArchiveConfigService")
public class EmailArchiveConfigServiceImpl implements EmailArchiveConfigService {
	
	private EmailArchiveConfigDao emailArchiveConfigDao = ProxyLocator.get(EmailArchiveConfigDao.class);

	@Override
	public EmailArchiveConfig get(int id) throws Exception {
		return emailArchiveConfigDao.get(id);
	}

	@Override
	public int insert(EmailArchiveConfig e) throws Exception {
		return emailArchiveConfigDao.insert(e);
	}

	@Override
	public int update(EmailArchiveConfig e) throws Exception {
		return emailArchiveConfigDao.update(e);
	}

	@Override
	public int delete(int id) throws Exception {
		return emailArchiveConfigDao.delete(id);
	}

	@Override
	public List<EmailArchiveConfig> find(String condition,String orderBy) throws Exception {
		Result res = GBConverter.expression2Result(condition, EmailArchiveConfig.class);
		List<EmailArchiveConfig> list = emailArchiveConfigDao.find("*", res.getSql(), res.getValues().toArray(), orderBy);
		return list;
	}

	@Override
	public List<EmailArchiveConfig> find(String columns,String condition,String orderBy) throws Exception {
		Result res = GBConverter.expression2Result(condition, EmailArchiveConfig.class);
		List<EmailArchiveConfig> list = emailArchiveConfigDao.find(columns, res.getSql(), res.getValues().toArray(), orderBy);
		return list;
	}

	@Override
	public List<EmailArchiveConfig> findForPage(String condition,int pageIndex, int pageSize, String orderBy)
			throws Exception {
		Result res = GBConverter.expression2Result(condition, EmailArchiveConfig.class);
		return emailArchiveConfigDao.findForPage("*", res.getSql(), res.getValues().toArray(), pageIndex, pageSize, orderBy);
	}

	@Override
	public List<EmailArchiveConfig> findForPage(String columns,String condition,int pageIndex, int pageSize, String orderBy)
			throws Exception {
		Result res = GBConverter.expression2Result(condition, EmailArchiveConfig.class);
		return emailArchiveConfigDao.findForPage(columns, res.getSql(), res.getValues().toArray(), pageIndex, pageSize, orderBy);
	}

	@Override
	public int count(String condition) throws Exception {
		Result res = GBConverter.expression2Result(condition, EmailArchiveConfig.class);
		return emailArchiveConfigDao.count(res.getSql(), res.getValues().toArray());
	}
}
