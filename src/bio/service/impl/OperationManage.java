package bio.service.impl;

import bio.po.Operation;
import java.util.ArrayList;
import bio.po.RoleOperation;
import bio.service.OperationService;

import java.util.List;
import bio.dao.OperationDao;
import bio.dao.RoleOperationDao;
public class OperationManage implements OperationService{
	private OperationDao operationDao;
	private RoleOperationDao roleOperationDao;
	public void setRoleOperationDao(RoleOperationDao roleOperationDao) {
		this.roleOperationDao = roleOperationDao;
	}
	public void setOperationDao(OperationDao operationDao)
	{this.operationDao=operationDao;}
	public boolean addOperation(Operation operation)
	{
		return operationDao.addOperation(operation);
	}
	public boolean delOperation(String operation_id)
	{
		//if(RoleOperationDao.countUser(role_id)==0)
		return operationDao.delOperation(operation_id);
		//else return false;
	} 
	public Operation viewOperation(String operation_id)
	{
		return operationDao.viewOperation(operation_id);
	}
	public List<Operation> viewRoleOperation(String role_id)
	{
		List<RoleOperation> list=roleOperationDao.viewOperations(role_id);
		List<Operation> list1=new ArrayList<Operation>();
		for(int i=0;i<list.size();i++)
		{
			Operation operation=operationDao.viewOperation(list.get(i).getId().getOpid());
			list1.add(operation);
		}
		return list1;
	}
}
