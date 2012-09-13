package bio.service.impl;

import java.util.ArrayList;
import java.util.List;
import bio.dao.RoleDao;
import bio.dao.UserSystemDao;
import bio.po.UserSystem;
import bio.service.UserSystemService;

public class UserSystemManage implements UserSystemService {
	
	private UserSystemDao userSystemDao;	
	private RoleDao roleDao;
	
	public void setUserSystemDao(UserSystemDao userSystemDao) {
		this.userSystemDao = userSystemDao;
	}
	public void setRoleDao(RoleDao roleDao) {
		this.roleDao = roleDao;
	}

	public boolean addUserSystem(UserSystem user) {
		// TODO Auto-generated method stub
		return userSystemDao.addUserSystem(user);
	}

	public boolean delUserSystem(String user_id) {
		// TODO Auto-generated method stub
		return userSystemDao.delUserSystem(user_id);
	}

	public boolean modUserStatus(String user_id,int state) {
		// TODO Auto-generated method stub
		return userSystemDao.modUserStatus(user_id, state);
	}

	public boolean modUserSystem(UserSystem user) {
		// TODO Auto-generated method stub
		return false;
	}

	public List<UserSystem> viewSubAdminSystem(String user_id) {
		// TODO Auto-generated method stub
		List<UserSystem>  list = null;
		List<UserSystem> list2 = userSystemDao.viewSubUsersSystem(user_id);
		if(list2!=null){
			list = new ArrayList<UserSystem>();
			for(int i=0;i<list2.size();i++){
				  if(roleDao.viewRoleType(list2.get(i).getId())==2){
					  list.add(list2.get(i));
				  }
			}
		}
		return list;
	}

	public List<UserSystem> viewSubUserSystem(String user_id) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		List<UserSystem>  list = null;
		List<UserSystem> list2 = userSystemDao.viewSubUsersSystem(user_id);
		if(list2!=null){
			list = new ArrayList<UserSystem>();
			for(int i=0;i<list2.size();i++){
				  if(roleDao.viewRoleType(list2.get(i).getId())==3){
					  list.add(list2.get(i));
				  }
			}
		}
		return list;
	}

	public List<UserSystem> viewSubUsersSystem(String user_id) {
		// TODO Auto-generated method stub
		return userSystemDao.viewSubUsersSystem(user_id);
	}

	public UserSystem viewUserSystem(String user_id) {
		// TODO Auto-generated method stub
		return userSystemDao.viewUserSystem(user_id);
	}

}
