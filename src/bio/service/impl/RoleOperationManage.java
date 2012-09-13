package bio.service.impl;

import java.util.List;

import bio.dao.RoleOperationDao;
import bio.po.RoleOperation;
import bio.service.RoleOperationService;

public class RoleOperationManage implements RoleOperationService {
	private RoleOperationDao roleOperationDao;
	public void setRoleOperationDao(RoleOperationDao roleOperationDao)
	{
		this.roleOperationDao=roleOperationDao;
	}

	
	public boolean addRoleOperations(String role_id, String[] opration_id) {
		// TODO Auto-generated method stub
		return roleOperationDao.addRoleOperations(role_id, opration_id);
	}

	
	public boolean delRoleOperations(String role_id, String[] opration_id) {
		// TODO Auto-generated method stub
		return roleOperationDao.delRoleOperations(role_id, opration_id);
	}

	
	public List<RoleOperation> viewOperations(String role_id) {
		// TODO Auto-generated method stub
		return roleOperationDao.viewOperations(role_id);
	}

}
