package bio.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import bio.dao.RoleOperationDao;
import bio.po.RoleOperation;
import bio.po.RoleOperationId;

public class RoleOperationDaoImpl extends HibernateDaoSupport implements RoleOperationDao {

	
	public boolean addRoleOperations(String role_id, String[] opration_id) {
		// TODO Auto-generated method stub
		try {
			for(int i=0;i<opration_id.length;i++)
			{
				RoleOperationId roleOperationId=new RoleOperationId();
				RoleOperation roleOperation=new RoleOperation();
				roleOperationId.setRoleid(role_id);
				roleOperationId.setOpid(opration_id[i]);
				roleOperation.setId(roleOperationId);
				getHibernateTemplate().save(roleOperation);
			}
			// log.debug("save successful");
		} catch (RuntimeException re) {
			// log.error("save failed", re);
			throw re;
		}
		return true;
	}

	
	public boolean delRoleOperations(String role_id, String[] opration_id) {
		// TODO Auto-generated method stub
		try {
			for(int i=0;i<opration_id.length;i++)
			{
				getHibernateTemplate().delete(find(role_id, opration_id[i]));
			}
			// log.debug("save successful");
		} catch (RuntimeException re) {
			// log.error("save failed", re);
			throw re;
		}
		return true;
	}

	
	public List<RoleOperation> viewOperations(String role_id) {
		// TODO Auto-generated method stub
		String hql = "from RoleOperation where roleid = ?";
		List<RoleOperation> list = getHibernateTemplate().find(hql, role_id);
		return list;
	}
	public RoleOperation find(String roleid,String opid)
	{
		RoleOperationId roleOperationId=new RoleOperationId();
		roleOperationId.setOpid(opid);
		roleOperationId.setRoleid(roleid);
		return (RoleOperation)getHibernateTemplate().get(RoleOperation.class, roleOperationId);
	}

}
