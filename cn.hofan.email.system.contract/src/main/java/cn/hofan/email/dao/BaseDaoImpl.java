package cn.hofan.email.dao;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import cn.hofan.email.util.DBHelper;
import cn.hofan.spat.db.dal.DAOHelper;
import cn.hofan.spat.db.dal.sql.select.IRowCallbackHandler;
import cn.hofan.spat.db.dal.sql.select.Query;
import cn.hofan.spat.db.dal.sql.update.UpdateStatement;
import cn.hofan.spat.db.dal.util.Commons;

public class BaseDaoImpl<T>{

    @SuppressWarnings("unchecked")
    public T get(Class<T> clazz, Object id) throws Exception {
        DAOHelper daoHelper = DBHelper.daoHelper;
        if (daoHelper != null) {
            return (T)daoHelper.session.get(clazz, id);
        } else {
            return null;
        }
    }

    public Object insert(Object e) throws Exception {
        DAOHelper daoHelper = DBHelper.daoHelper;
        if (daoHelper != null) {
            return daoHelper.session.save(e);
        } else {
            return null;
        }
    }

    public int update(Object e) throws Exception {
        DAOHelper daoHelper = DBHelper.daoHelper;
        if (daoHelper != null) {
            return daoHelper.session.updateEntity(e);
        } else {
            return 0;
        }
    }

    public int update(Class<T> clazz,String updateStatement,String condition,List<Object> params )throws Exception{           
	    DAOHelper daoHelper = DBHelper.daoHelper;
	    if(daoHelper != null){
	        UpdateStatement statement = daoHelper.session.createUpdateStatement(clazz, updateStatement, condition);
	        if(params != null && params.size()>0){
	            statement.addParam(params);	            
	        }
	        return statement.excuteUpdate();
	        
	    }else{
	        return 0;
	    }
	}

    public int delete(Class<T> clazz, Object id) throws Exception {
        DAOHelper daoHelper = DBHelper.daoHelper;
        if (daoHelper != null) {
            return daoHelper.session.deleteEntityById(clazz, id);
        } else {
            return 0;
        }
    }

    @SuppressWarnings("unchecked")
    public List<T> find(Class<T> clazz, String columns, String condition, Object[] params, String orderBy)
        throws Exception {
        DAOHelper daoHelper = DBHelper.daoHelper;
        if (daoHelper != null) {
            Query query = daoHelper.session.createQuery(clazz, columns, condition);
            if (params != null && params.length > 0) {
                for (Object param : params) {
                    query.addParam(param);
                }
            }
            query.setOrderBy(orderBy);
            return (List<T>)query.list();
        } else {
            return null;
        }
    }

    @SuppressWarnings("unchecked")
    public List<T> findForPage(Class<T> clazz, String columns, String condition, Object[] params, int pageIndex,
                               int pageSize, String orderBy) throws Exception {
        DAOHelper daoHelper = DBHelper.daoHelper;
        if (daoHelper != null) {
            Query query = daoHelper.session.createQuery(clazz, columns, condition);
            if (params != null && params.length > 0) {
                for (Object param : params) {
                    query.addParam(param);
                }
            }
            query.setOrderBy(orderBy);
            query.setPageIndex(pageIndex);
            query.setPageSize(pageSize);
            return (List<T>)query.list();
        } else {
            return null;
        }
    }

    public BigDecimal sum(Class<T> clazz, String column, String condition, Object[] params) throws Exception {
        DAOHelper daoHelper = DBHelper.daoHelper;
        if (daoHelper != null) {
            StringBuilder sql = new StringBuilder("select sum(");
            sql.append(column).append(") from ");
            sql.append(Commons.getTableName(clazz)).append(" where ");
            sql.append(condition);
            BigDecimal sum = (BigDecimal)daoHelper.sql.execQuery(sql.toString(), params, new IRowCallbackHandler() {

                public Object exec(ResultSet rs) throws SQLException {
                    if (rs.next()) {
                        return rs.getBigDecimal(1);
                    }
                    return null;
                }
            });

            return sum;
        } else {
            return null;
        }
    }

    public int count(Class<T> clazz, String condition, Object[] params) throws Exception {
        DAOHelper daoHelper = DBHelper.daoHelper;
        if (daoHelper != null) {
            Query query = daoHelper.session.createQuery(clazz, condition);
            if (params != null && params.length > 0) {
                for (Object param : params) {
                    query.addParam(param);
                }
            }
            return (int)query.count();
        } else {
            return 0;
        }
    }


}
