package bio.dao.impl;

import java.util.List;
import java.util.UUID;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;


import bio.dao.UserFileServerDao;
import bio.po.FileServer;
import bio.po.RoleOperation;
import bio.po.UserFileserver;
import bio.po.UserFileserverId;
import bio.po.UserInfo;

public class UserFileServerDaoImpl extends HibernateDaoSupport implements UserFileServerDao{

	
	public boolean addUserFileServer(UserFileserver userfileserver) {
		// TODO Auto-generated method stub
		boolean flag=false;
	
		try {
			getHibernateTemplate().save(userfileserver);
			flag=true;
		} catch (RuntimeException e) {
			// TODO: handle exception
			throw e;
		}
		return flag;
	}

	
	public boolean delUserFileServer(String usrid, String serverid) {
		// TODO Auto-generated method stub
		boolean flag=false;
		UserFileserverId userfileserverid = new UserFileserverId();
		
			
		userfileserverid.setUsrid(usrid);
		userfileserverid.setServerid(serverid);	
		try {
			Object userfileserver=getHibernateTemplate().load(UserFileserver.class,userfileserverid);
			getHibernateTemplate().delete(userfileserver);
			flag=true;
			
		} catch (RuntimeException e) {
			// TODO: handle exception
			throw e;
		}
		return flag;
	}

	
	public boolean modUserFileServerPassword(String usrid, String serverid,	String usrpasswd) {
		// TODO Auto-generated method stub
		UserFileserverId userfileserverid = new UserFileserverId();
		
		
		userfileserverid.setUsrid(usrid);
		userfileserverid.setServerid(serverid);
		
		UserFileserver userfileserver = (UserFileserver) getHibernateTemplate().get(UserFileserver.class, userfileserverid);
		if (userfileserver == null)
			return false;
		else {
			userfileserver.setUsrpasswd(usrpasswd);
			getHibernateTemplate().update(userfileserver);
			return true;
		}
	}

	
	public List<UserFileserver> viewAllUserFileServer(int pageNow,int pageSize) {
		// TODO Auto-generated method stub
		Session session=getHibernateTemplate().getSessionFactory().openSession();
		Transaction ts=session.beginTransaction();
		Query query=session.createQuery("from UserFileserver");
		int firstResult=(pageNow-1)*pageSize;
		query.setFirstResult(firstResult);
		query.setMaxResults(pageSize);
		List<UserFileserver> userfileservers=query.list();
		ts.commit();
		session.close();
		session=null;
		return userfileservers;
	}

	
	public UserFileserver viewUserFileServer(String usrid, String serverid) {
		// TODO Auto-generated method stub
		UserFileserverId userfileserverid = new UserFileserverId();
		
		
		userfileserverid.setUsrid(usrid);
		userfileserverid.setServerid(serverid);
		
		return (UserFileserver)getHibernateTemplate().get(UserFileserver.class, userfileserverid);
	}

	
	public List<UserFileserver> viewAllUserFileServer() {
		// TODO Auto-generated method stub
		
		List<UserFileserver> userfileservers=getHibernateTemplate().find("from UserFileserver");
		return userfileservers;
	}

	
	public boolean modUserFileServerFilePath(String usrid, String serverid,String filepath) {
		// TODO Auto-generated method stub
		UserFileserverId userfileserverid = new UserFileserverId();
    	userfileserverid.setUsrid(usrid);
		userfileserverid.setServerid(serverid);
		UserFileserver userfileserver = (UserFileserver) getHibernateTemplate().get(UserFileserver.class, userfileserverid);
		if (userfileserver == null)
			return false;
		else {
			userfileserver.setFilepath(filepath);
			getHibernateTemplate().update(userfileserver);
			return true;
		}
	}

}
