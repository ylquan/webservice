package bio.service.impl;

import java.util.ArrayList;
import java.util.List;

import bio.dao.RoleDao;
import bio.dao.UserDetailDao;
import bio.po.UserDetail;
import bio.service.UserDetailService;

public class UserDetailManage implements UserDetailService {

	private UserDetailDao userDetailDao;
	
	private RoleDao roleDao;
	public void setRoleDao(RoleDao roleDao) {
		this.roleDao = roleDao;
	}

	public void setUserDetailDao(UserDetailDao userDetailDao) {
		this.userDetailDao = userDetailDao;
	}

	public boolean addUserDetail(UserDetail user) {
		// TODO Auto-generated method stub
		return userDetailDao.addUserDetail(user);
	}

	public boolean delUserDetail(String user_id) {
		// TODO Auto-generated method stub
		return userDetailDao.delUserDetail(user_id);
	}

	public boolean modUserDetail(UserDetail user) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean modUserStatus(String user_id,int state) {
		// TODO Auto-generated method stub
		return userDetailDao.modUserStatus(user_id, state);
	}

	public List<UserDetail> viewSubAdminDetail(String user_id) {
		// TODO Auto-generated method stub
		List<UserDetail>  list = null;
		List<UserDetail> list2 = userDetailDao.viewSubUsersDetail(user_id);
		if(list2!=null){
			list = new ArrayList<UserDetail>();
			for(int i=0;i<list2.size();i++){
				  if(roleDao.viewRoleType(list2.get(i).getId())==2){
					  list.add(list2.get(i));
				  }
			}
		}
		return list;
	}

	public List<UserDetail> viewSubUserDetail(String user_id) {
		// TODO Auto-generated method stub
		List<UserDetail>  list = null;
		List<UserDetail> list2 = userDetailDao.viewSubUsersDetail(user_id);
		if(list2!=null){
			list = new ArrayList<UserDetail>();
			for(int i=0;i<list2.size();i++){
				  if(roleDao.viewRoleType(list2.get(i).getId())==3){
					  list.add(list2.get(i));
				  }
			}
		}
		return list;
	}

	public List<UserDetail> viewSubUsersDetail(String user_id) {
		// TODO Auto-generated method stub
		return userDetailDao.viewSubUsersDetail(user_id);
	}

	public UserDetail viewUserDeatil(String user_id) {
		// TODO Auto-generated method stub
		return userDetailDao.viewUserDeatil(user_id);
	}

}
