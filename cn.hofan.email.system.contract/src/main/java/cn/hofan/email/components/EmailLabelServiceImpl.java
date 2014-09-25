package cn.hofan.email.components;

import java.util.List;

import cn.hofan.email.contract.EmailLabelService;
import cn.hofan.email.dao.EmailLabelDao;
import cn.hofan.email.entity.EmailLabel;
import cn.hofan.spat.db.gb.util.GBConverter;
import cn.hofan.spat.db.gb.util.Result;
import cn.hofan.spat.locator.ProxyLocator;

import com.bj58.spat.gaea.server.contract.annotation.ServiceBehavior;

@ServiceBehavior(lookUP="EmailLabelService")
public class EmailLabelServiceImpl implements EmailLabelService {
	
	private EmailLabelDao emailLabelDao = ProxyLocator.get(EmailLabelDao.class);

	@Override
	public EmailLabel get(int id) throws Exception {
		return emailLabelDao.get(id);
	}

	@Override
	public int insert(EmailLabel e) throws Exception {
		return emailLabelDao.insert(e);
	}

	@Override
	public int update(EmailLabel e) throws Exception {
		return emailLabelDao.update(e);
	}

	@Override
	public int delete(int id) throws Exception {
		return emailLabelDao.delete(id);
	}

	@Override
	public List<EmailLabel> find(String condition,String orderBy) throws Exception {
		Result res = GBConverter.expression2Result(condition, EmailLabel.class);
		List<EmailLabel> list = emailLabelDao.find("*", res.getSql(), res.getValues().toArray(), orderBy);
		return list;
	}

	@Override
	public List<EmailLabel> find(String columns,String condition,String orderBy) throws Exception {
		Result res = GBConverter.expression2Result(condition, EmailLabel.class);
		List<EmailLabel> list = emailLabelDao.find(columns, res.getSql(), res.getValues().toArray(), orderBy);
		return list;
	}

	@Override
	public List<EmailLabel> findForPage(String condition,int pageIndex, int pageSize, String orderBy)
			throws Exception {
		Result res = GBConverter.expression2Result(condition, EmailLabel.class);
		return emailLabelDao.findForPage("*", res.getSql(), res.getValues().toArray(), pageIndex, pageSize, orderBy);
	}

	@Override
	public List<EmailLabel> findForPage(String columns,String condition,int pageIndex, int pageSize, String orderBy)
			throws Exception {
		Result res = GBConverter.expression2Result(condition, EmailLabel.class);
		return emailLabelDao.findForPage(columns, res.getSql(), res.getValues().toArray(), pageIndex, pageSize, orderBy);
	}

	@Override
	public int count(String condition) throws Exception {
		Result res = GBConverter.expression2Result(condition, EmailLabel.class);
		return emailLabelDao.count(res.getSql(), res.getValues().toArray());
	}
}
