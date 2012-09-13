package bio.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import bio.dao.UserSystemDao;
import bio.po.UserSystem;

public class UserSystemDaoImpl extends HibernateDaoSupport implements UserSystemDao {

	public boolean addUserSystem(UserSystem user) {
		// TODO Auto-generated method stub
		try {
			getHibernateTemplate().save(user);
			// log.debug("save successful");
		} catch (RuntimeException ex ) {
			// log.error("save failed", re);
		}
		return true;
	}

	public boolean delUserSystem(String user_id) {
		// TODO Auto-generated method stub
		try {
			Object usersystem = getHibernateTemplate().load(UserSystem.class, user_id);
			getHibernateTemplate().delete(usersystem);
		} catch (RuntimeException e) {
			// TODO: handle exception
		}
		return true;
	}

	public boolean modUserStatus(String user_id,int state) {
		// TODO Auto-generated method stub
		UserSystem usersystem = (UserSystem) getHibernateTemplate().get(UserSystem.class, user_id);
		if (usersystem == null)
			return false;
		else {
			usersystem.setStatus(state);
			getHibernateTemplate().update(usersystem);
			return true;
		}
	}

	public boolean modUserSystem(UserSystem user) {
		// TODO Auto-generated method stub
		return false;
	}

	public List<UserSystem> viewSubUsersSystem(String user_id) {
		// TODO Auto-generated method stub
		String hql = 	"from UserSystem where fatherid = ? ";
		List<UserSystem> list = getHibernateTemplate().find(hql,user_id);		
		return list;
	}

	public UserSystem viewUserSystem(String user_id) {
		// TODO Auto-generated method stub
		return (UserSystem) getHibernateTemplate().get(UserSystem.class, user_id);
	}

}
