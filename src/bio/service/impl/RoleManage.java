package bio.service.impl;

import java.util.List;

import bio.dao.RoleDao;
import bio.dao.UserRoleDao;
import bio.po.Role;
import bio.service.RoleService;

public class RoleManage implements RoleService {
	
	private RoleDao  roleDao;
	private UserRoleDao userRoleDao;
	/*依赖注入*/
	public void setRoleDao(RoleDao roleDao) {
		this.roleDao = roleDao;
	}
	public void setUserRoleDao(UserRoleDao userRoleDao) {
		this.userRoleDao = userRoleDao;
	}
	
	public boolean addRole(Role role) {
		// TODO Auto-generated method stub
		return roleDao.addRole(role);
	}

	public boolean delRole(String role_id) {
		// TODO Auto-generated method stub
		if(userRoleDao.countUser(role_id)==0)
		   return roleDao.delRole(role_id);
		else {
			/*角色被使用中*/
			return false;
		}
	}

	public boolean isExistRole(String role_id) {
		// TODO Auto-generated method stub
		return roleDao.isExistRole(role_id);
	}

	public boolean modRoleStatus(String role_id,int state) {
		// TODO Auto-generated method stub
		return roleDao.modRoleStatus(role_id,state);
	}

	public List<Role> viewAllSubRole(String role_id) {
		// TODO Auto-generated method stub
		return roleDao.viewAllSubRole(role_id);
	}

	public Role viewRole(String role_id) {
		// TODO Auto-generated method stub
		return roleDao.viewRole(role_id);
	}


	public List<Role> viewSubAdminRole(String role_id) {
		// TODO Auto-generated method stub
		return roleDao.viewSubAdminRole(role_id);
	}

	public List<Role> viewSubRole(String role_id) {
		// TODO Auto-generated method stub
		return roleDao.viewSubRole(role_id);
	}

	public List<Role> viewSubUserRole(String role_id) {
		// TODO Auto-generated method stub
		return roleDao.viewSubUserRole(role_id);
	}
	public List<Role> viewRoleStatus(int state) {
		// TODO Auto-generated method stub
		return roleDao.viewRoleStatus(state);
	}

}
