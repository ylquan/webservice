package bio.dao.impl;

import bio.po.Role;
import bio.po.UserInfo;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;


import bio.dao.RoleDao;

import java.util.List;
import java.util.UUID;

public class RoleDaoImpl extends HibernateDaoSupport implements RoleDao {

	public boolean addRole(Role role) {
		// TODO Auto-generated method stub
		/* UUID应该在管理员提交角色申请时加上 */
		role.setId(UUID.randomUUID().toString().toString().replaceAll("-",
				""));
		try {
			getHibernateTemplate().save(role);
			// log.debug("save successful");
		} catch (RuntimeException re) {
			// log.error("save failed", re);
			throw re;
		}
		return true;
	}

	public boolean delRole(String role_id) {
		// TODO Auto-generated method stub
		try {
			Object role = getHibernateTemplate().load(Role.class, role_id);
			getHibernateTemplate().delete(role);
		} catch (RuntimeException e) {
			// TODO: handle exception
		}
		return true;
	}

	public Role viewRole(String role_id) {
		// TODO Auto-generated method stub
		return (Role) getHibernateTemplate().get(Role.class, role_id);
	}

	public boolean isExistRole(String role_id) {
		// TODO Auto-generated method stub
		String hql = "from Role where id = ?";
		List<Role> list = getHibernateTemplate().find(hql, role_id);
		if (list.size() > 0)
			return true;
		else
			return false;
	}

	public List<Role> viewAllSubRole(String role_id) {/*返回包括自身的子角色信息*/
		// TODO Auto-generated method stub
		String hql = "from Role where id =" + role_id;
		List<Role> list = viewSubRole(role_id);
		list.add(viewRole(role_id)); /* viewRole可能返回 NULL */
		return list;
	}

	public List<Role> viewSubAdminRole(String role_id) {
		// TODO Auto-generated method stub
		String hql = "from Role where fatherid = ? and type = 2";
		List<Role> list = getHibernateTemplate().find(hql, role_id);
		return list;
	}

	public List<Role> viewSubRole(String role_id) {
		// TODO Auto-generated method stub
		String hql = "from Role where fatherid = ? ";
		List<Role> list = getHibernateTemplate().find(hql, role_id);
		return list;
	}

	public List<Role> viewSubUserRole(String role_id) {
		// TODO Auto-generated method stub
		String hql = "from Role where fatherid = ? and type = 3";
		List<Role> list = getHibernateTemplate().find(hql, role_id);
		return list;
	}

	public boolean modRoleStatus(String role_id,int state) {
		Role role = (Role) getHibernateTemplate().get(Role.class, role_id);
		if (role == null)
			return false;
		else {
			role.setStatus(state);
			getHibernateTemplate().update(role);
			return true;
		}
	}

	public int viewRoleType(String role_id) {
		// TODO Auto-generated method stub
		return viewRole(role_id).getType();// 可能返回NULL ？
	}

	public boolean isExistRelation(String role_id, String child_role_id) {
		// TODO Auto-generated method stub
		String hql = "from Role where roleId = ? and roleFatherId = ?";
        Object[] params = new Object[]{child_role_id, role_id};
		List<UserInfo> list = getHibernateTemplate().find(hql, params);
		if(list.size() > 0)
			return true;
		else
		    return false;
	}

	public List<Role> viewRoleStatus(int state) {
		// TODO Auto-generated method stub
		String hql = "from Role where status = ?";
		List<Role> list = getHibernateTemplate().find(hql, state);
		return list;
	}
}

/*
 * //先加载特定实
 * 
 * Object p = getHibernateTemplate().load(Person.class, new Integer(personid));
 * 
 * //删除特定实例
 * 
 * getHibernateTemplate().delete(p);
 * 
 * 
 * 根据主键返回特定实例
 * 
 * @ return 特定主键对应的Person实例
 * 
 * @ param 主键值
 * 
 * public News getPerson(int personid)
 * 
 * {
 * 
 * return (Person)getHibernateTemplate().get(Person.class, new
 * Integer(personid));
 * 
 * }
 * 
 * public String print(int id) {
 * 
 * Session se =this.getSession();//获取Session对象
 * 
 * String hql = "from Ssh where id=" + id;
 * 
 * //依据hql获取实体集合，此处不要用Query类来实现
 * 
 * List<Ssh> list = this.getHibernateTemplate().find(hql);
 * 
 * String a = list.get(0).getName();
 * 
 * return a;
 * 
 * }
 */