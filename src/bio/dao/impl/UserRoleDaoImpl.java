package bio.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import bio.dao.UserRoleDao;
import bio.po.UserRole;


public class UserRoleDaoImpl  extends HibernateDaoSupport implements UserRoleDao {

	public boolean addUserRole(String user_id,
			String role_id) {
		// TODO Auto-generated method stub
		UserRole  userRole = new UserRole(user_id,role_id);
		try {
			getHibernateTemplate().save(userRole);
			// log.debug("save successful");
		} catch (RuntimeException re) {
			// log.error("save failed", re);
			throw re;
		}
		return true;
	}

	public int countUser(String role_id) {
		// TODO Auto-generated method stub
		String hql = 	"from UserRole where roleid = ? ";
		List<UserRole> list = getHibernateTemplate().find(hql,role_id);		
		if(list==null)
			return 0;
		return list.size();
	}

	public boolean delUser(String user_id) {
		// TODO Auto-generated method stub
		try {
			Object userrole = getHibernateTemplate().load(UserRole.class, user_id);
			getHibernateTemplate().delete(userrole);
		} catch (RuntimeException e) {
			// TODO: handle exception
		}
		return true;
	}

	public boolean modUserRole(String user_id, String roleid) {
		// TODO Auto-generated method stub
		UserRole userRole =(UserRole)getHibernateTemplate().get(UserRole.class, user_id);
		if(userRole == null)
	    	return false;
		else {			
			userRole.setRoleid(roleid);
			getHibernateTemplate().update(userRole);		
			return true;
		}
	}

	public String viewUserRole(String user_id) {
		// TODO Auto-generated method stub
		return ((UserRole)getHibernateTemplate().get(UserRole.class, user_id)).getRoleid();
	}

}
