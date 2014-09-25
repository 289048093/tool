package cn.hofan.email.dao.impl;

import cn.hofan.email.dao.EmailConfigDao;
import cn.hofan.email.entity.EmailConfig;
import cn.hofan.spat.db.dal.annotation.Transaction;
import cn.hofan.spat.locator.ProxyLocator;
import org.junit.Test;

import java.util.List;

/**
 * @author lizhao  2014/9/22.
 */

@Transaction
public class EmailConfigDaoTest {

    EmailConfigDao emailConfigDao = ProxyLocator.get(EmailConfigDao.class);

    @Test
    public void testFind() throws Exception {
        List<EmailConfig> es = emailConfigDao.find("last_load_time", null, null, "id");
        System.out.println(es.get(0).getLastLoadTime());
    }

}
