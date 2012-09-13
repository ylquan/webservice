package bio.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import bio.dao.UserDetailDao;
import bio.po.UserDetail;

public class UserDetailDaoImpl  extends HibernateDaoSupport implements UserDetailDao {

	public boolean addUserDetail(UserDetail user) {
		boolean flag=false;
		// TODO Auto-generated method stub
		try {
			getHibernateTemplate().save(user);
			flag=true;
			// log.debug("save successful");
		} catch (Exception ex ) {
			// log.error("save failed", re);
			ex.printStackTrace();
		}
		return flag;
	}

	public boolean delUserDetail(String user_id) {
		// TODO Auto-generated method stub
		try {
			Object userdetail = getHibernateTemplate().load(UserDetail.class, user_id);
			getHibernateTemplate().delete(userdetail);
		} catch (RuntimeException e) {
			// TODO: handle exception
		}
		return true;
	}

	public boolean modUserDetail(UserDetail user) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean modUserStatus(String user_id,int state) {
		// TODO Auto-generated method stub
		UserDetail userdetail = (UserDetail) getHibernateTemplate().get(UserDetail.class, user_id);
		if (userdetail == null)
			return false;
		else {
			userdetail.setStatus(state);
			getHibernateTemplate().update(userdetail);
			return true;
		}
	}

	public List<UserDetail> viewSubUsersDetail(String user_id) {
		// TODO Auto-generated method stub
		String hql = 	"from UserDetail where fatherid = ? ";
		List<UserDetail> list = getHibernateTemplate().find(hql,user_id);		
		return list;
	}

	public UserDetail viewUserDeatil(String user_id) {
		// TODO Auto-generated method stub
		return (UserDetail) getHibernateTemplate().get(UserDetail.class, user_id);
	}

}
