package bio.service.impl;

import java.util.List;

import bio.po.RoleResource;
import bio.service.RoleResourceService;
import bio.dao.RoleResourceDao;
public class RoleResourceManage implements RoleResourceService {
	private RoleResourceDao roleResourceDao;

	public void setRoleResourceDao(RoleResourceDao roleResourceDao) {
		this.roleResourceDao = roleResourceDao;
	}

	
	public boolean addRoleResources(String role_id, String[] resource_id) {
		// TODO Auto-generated method stub
		return roleResourceDao.addRoleResources(role_id, resource_id);
	}

	
	public boolean delRoleResources(String role_id, String[] resource_id) {
		// TODO Auto-generated method stub
		return roleResourceDao.delRoleResources(role_id, resource_id);
	}

	
	public List<RoleResource> viewResources(String role_id) {
		// TODO Auto-generated method stub
		return roleResourceDao.viewResources(role_id);
	}

}
