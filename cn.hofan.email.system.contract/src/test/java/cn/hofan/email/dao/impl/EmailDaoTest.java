package cn.hofan.email.dao.impl;

import cn.hofan.email.dao.EmailDao;
import cn.hofan.email.entity.Email;
import cn.hofan.spat.db.dal.annotation.Transaction;
import org.junit.Test;

/**
 * @author lizhao  2014/9/19.
 */

public class EmailDaoTest {

    @Test
    public void testInsert() throws Exception {
        Email email = new Email();
        email.setSubject("test");
        email.setToEmail("asdf@asdf");
        email.setContent("content");
        EmailDao dao = new EmailDaoImpl();
        dao.insert(email);
    }
}
