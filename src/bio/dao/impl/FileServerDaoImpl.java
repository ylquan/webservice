package bio.dao.impl;

import java.util.List;
import java.util.UUID;

import bio.dao.FileServerDao;

import bio.po.FileServer;


import org.hibernate.*;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;







public class FileServerDaoImpl extends HibernateDaoSupport implements FileServerDao{

	
	public boolean addFileServer(FileServer fileserver) {
		// TODO Auto-generated method stub
		boolean flag=false;
		fileserver.setId(UUID.randomUUID().toString().toString().replaceAll("-",
				""));
		try {
			getHibernateTemplate().save(fileserver);
			flag=true;
		} catch (RuntimeException e) {
			// TODO: handle exception
			throw e;
		}
		return flag;
	}

	
	public boolean delFileServer(String serverid) {
		// TODO Auto-generated method stub
		boolean flag=false;
		try {
			Object fileserver=getHibernateTemplate().load(FileServer.class,serverid);
			getHibernateTemplate().delete(fileserver);
			flag=true;
			
		} catch (RuntimeException e) {
			// TODO: handle exception
			throw e;
		}
		return flag;
	}

	
	public boolean modFileServerIpAddr(String serverid, String serveripaddr) {
		// TODO Auto-generated method stub
		FileServer fileserver = (FileServer) getHibernateTemplate().get(FileServer.class, serverid);
		if (fileserver == null)
			return false;
		else {
			fileserver.setIpaddr(serveripaddr);
			getHibernateTemplate().update(fileserver);
			return true;
		}
	}

	
	public boolean modFileServerType(String serverid, int type) {
		// TODO Auto-generated method stub
		FileServer fileserver = (FileServer) getHibernateTemplate().get(FileServer.class, serverid);
		if (fileserver == null)
			return false;
		else {
			fileserver.setType(type);
			getHibernateTemplate().update(fileserver);
			return true;
		}
	}

	
	public boolean modFileServerPortNum(String serverid, int portnum) {
		// TODO Auto-generated method stub
		FileServer fileserver = (FileServer) getHibernateTemplate().get(FileServer.class, serverid);
		if (fileserver == null)
			return false;
		else {
			fileserver.setPortnum(portnum);
			getHibernateTemplate().update(fileserver);
			return true;
		}
	}

	
	public boolean modFileServerName(String serverid, String servername) {
		// TODO Auto-generated method stub
		FileServer fileserver = (FileServer) getHibernateTemplate().get(FileServer.class, serverid);
		if (fileserver == null)
			return false;
		else {
			fileserver.setServername(servername);
			getHibernateTemplate().update(fileserver);
			return true;
		}
	}

	
	public FileServer viewFileServer(String serverid) {
		// TODO Auto-generated method stub
		
		
		return (FileServer)getHibernateTemplate().get(FileServer.class, serverid);
	}

	
	public List<FileServer> viewAllFileServer(int pageNow,int pageSize) {
		// TODO Auto-generated method stub
		Session session=getHibernateTemplate().getSessionFactory().openSession();
		Transaction ts=session.beginTransaction();
		Query query=session.createQuery("from FileServer");
		int firstResult=(pageNow-1)*pageSize;
		query.setFirstResult(firstResult);
		query.setMaxResults(pageSize);
		List<FileServer> fileservers=query.list();
		ts.commit();
		session.close();
		session=null;
		return fileservers;
	}
	
	
	public List<FileServer> viewAllFileServer() {
		// TODO Auto-generated method stub
		List<FileServer> fileservers=getHibernateTemplate().find("from FileServer");
		//另外一种方法
		/*Session session=getHibernateTemplate().getSessionFactory().openSession();
		Transaction ts=session.beginTransaction();
		Query query=session.createQuery("from FileServer");
		
		List<FileServer> fileservers=query.list();
		
		ts.commit();
		session.close();
		session=null;*/
		return fileservers;
	}

}
