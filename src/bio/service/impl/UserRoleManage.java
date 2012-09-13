package bio.service.impl;

import bio.dao.RoleDao;
import bio.dao.UserInfoDao;
import bio.dao.UserRoleDao;
import bio.po.Role;
import bio.service.UserRoleService;

public class UserRoleManage implements UserRoleService {

	private UserRoleDao userRoleDao;

	private UserInfoDao userInfoDao;
	private RoleDao roleDao;

	public void setUserRoleDao(UserRoleDao userRoleDao) {
		this.userRoleDao = userRoleDao;
	}

	public void setUserInfoDao(UserInfoDao userInfoDao) {
		this.userInfoDao = userInfoDao;
	}

	public void setRoleDao(RoleDao roleDao) {
		this.roleDao = roleDao;
	}

	public boolean addUserRole(String user_id, String child_user_id,
			String role_id) {
		// TODO Auto-generated method stub
		String  father_id = userRoleDao.viewUserRole(user_id);
		if(userInfoDao.isExistRelation(user_id, child_user_id) && roleDao.isExistRelation(father_id, role_id)){
			return  userRoleDao.addUserRole(child_user_id, role_id);
		}
		return false;
	}

	public boolean modUserRole(String user_id, String child_user_id,
			String newroleid) {
		// TODO Auto-generated method stub
		String  father_id = userRoleDao.viewUserRole(user_id);
		if(userInfoDao.isExistRelation(user_id, child_user_id) && roleDao.isExistRelation(father_id, newroleid)){
			return  userRoleDao.modUserRole(child_user_id, newroleid);
		}
		return false;
	}
	public String viewUserRole(String user_id)
	{
		String  role_id = userRoleDao.viewUserRole(user_id);
		return role_id;
	}
}
