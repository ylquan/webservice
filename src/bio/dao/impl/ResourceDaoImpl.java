package bio.dao.impl;

import java.util.UUID;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import bio.dao.ResourceDao;
import bio.po.Operation;
import bio.po.Resource;

public class ResourceDaoImpl extends HibernateDaoSupport implements ResourceDao {

	
	public boolean addResource(Resource resource) {
		// TODO Auto-generated method stub
		boolean flag=false;
		resource.setResid(UUID.randomUUID().toString().toString().replaceAll("-",
				""));
		try {
			getHibernateTemplate().save(resource);
			flag=true;
		} catch (RuntimeException e) {
			// TODO: handle exception
			throw e;
		}
		return flag;
	}

	
	public boolean delResource(String resource_id) {
		// TODO Auto-generated method stub
		boolean flag=false;
		try {
			Object resource=getHibernateTemplate().load(Resource.class,resource_id);
			getHibernateTemplate().delete(resource);
			flag=true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return flag;
	}

	
	public Resource viewResource(String resource_id) {
		// TODO Auto-generated method stub
		return (Resource) getHibernateTemplate().get(Resource.class, resource_id);
	}
}
