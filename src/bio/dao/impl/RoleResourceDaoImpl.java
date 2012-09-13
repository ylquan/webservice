package bio.dao.impl;

import java.util.List;

import bio.dao.RoleResourceDao;
import bio.po.RoleOperation;
import bio.po.RoleOperationId;
import bio.po.RoleResourceId;
import bio.po.RoleResource;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
public class RoleResourceDaoImpl extends HibernateDaoSupport implements RoleResourceDao {

	
	public boolean addRoleResources(String role_id, String[] resource_id) {
		// TODO Auto-generated method stub
		try {
			for(int i=0;i<resource_id.length;i++)
			{
				RoleResourceId roleResourceId=new RoleResourceId();
				RoleResource roleResource=new RoleResource();
				roleResourceId.setRoleid(role_id);
				roleResourceId.setResid(resource_id[i]);
				roleResource.setId(roleResourceId);
				getHibernateTemplate().save(roleResource);
			}
			// log.debug("save successful");
		} catch (RuntimeException re) {
			// log.error("save failed", re);
			throw re;
		}
		return true;
	}

	
	public boolean delRoleResources(String role_id, String[] resource_id) {
		// TODO Auto-generated method stub
		try {
			for(int i=0;i<resource_id.length;i++)
			{
				getHibernateTemplate().delete(find(role_id, resource_id[i]));
			}
			// log.debug("save successful");
		} catch (RuntimeException re) {
			// log.error("save failed", re);
			throw re;
		}
		return true;
	}

	
	public List<RoleResource> viewResources(String role_id) {
		// TODO Auto-generated method stub
		String hql = "from RoleResource where roleid = ?";
		List<RoleResource> list = getHibernateTemplate().find(hql, role_id);
		return list;
	}

	public RoleResource find(String roleid,String resid)
	{
		RoleResourceId roleResourceId=new RoleResourceId();
		roleResourceId.setResid(resid);
		roleResourceId.setRoleid(roleid);
		return (RoleResource)getHibernateTemplate().get(RoleResource.class, roleResourceId);
	}
}
