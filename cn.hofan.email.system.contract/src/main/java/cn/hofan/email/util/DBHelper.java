package cn.hofan.email.util;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.bj58.spat.gaea.server.util.config.Path;

import cn.hofan.spat.db.dal.DAOHelper;
import cn.hofan.spat.db.dal.pool.DBPoolFactory;

public class DBHelper {
	
	private static Log log = LogFactory.getLog(DBHelper.class);
	
	public static DAOHelper daoHelper = null;

	static {
		try {
			String configPath = Path.getCurrentPath() +"/config/mysqldb.properties";
			log.info("db config path:" + configPath);
			daoHelper = new DAOHelper(DBPoolFactory.getDBConnectionPool(configPath));
		} catch (Exception ex) {
			log.error(ex.getMessage(),ex);
		}
	}

}
