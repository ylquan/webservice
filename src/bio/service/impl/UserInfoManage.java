package bio.service.impl;

import java.util.ArrayList;
import java.util.List;

import bio.dao.RoleDao;
import bio.dao.UserInfoDao;
import bio.po.UserInfo;
import bio.service.UserInfoService;

public class UserInfoManage implements UserInfoService{
	
	private UserInfoDao  userInfoDao;
	private RoleDao  roleDao;
	/*“¿¿µ◊¢»Î*/
	public void setUserInfoDao(UserInfoDao userInfoDao) {
		this.userInfoDao = userInfoDao;
	}

	public void setRoleDao(RoleDao roleDao) {
		this.roleDao = roleDao;
	}


	public boolean addUserInfo(UserInfo user) {
		// TODO Auto-generated method stub
		return userInfoDao.addUserInfo(user);
	}

//	public int countSubUser(String user_id) {
//		// TODO Auto-generated method stub
//		return userInfoDao.countSubUser(user_id);
//	}

	public boolean delUserInfo(String user_id) {
		// TODO Auto-generated method stub
		return userInfoDao.delUserInfo(user_id);
	}

	public boolean isExistAccount(String user_account, String user_password) {
		// TODO Auto-generated method stub
		return userInfoDao.isExistAccount(user_account, user_password);
	}

	public boolean isExistRelation(String user_id, String child_user_id) {
		// TODO Auto-generated method stub
		return userInfoDao.isExistRelation(user_id, child_user_id);
	}

	public boolean modUserInfo(UserInfo user) {
		// TODO Auto-generated method stub
		return userInfoDao.modUserInfo(user);
	}

	public List<UserInfo> viewSubAdminInfo(String user_id) {
		// TODO Auto-generated method stub
		List<UserInfo>  list = null;
		List<UserInfo> list2 = userInfoDao.viewSubUsersInfo(user_id);
		if(list2!=null){
			list = new ArrayList<UserInfo>();
			for(int i=0;i<list2.size();i++){
				  if(roleDao.viewRoleType(list2.get(i).getId())==2){
					  list.add(list2.get(i));
				  }
			}
		}
		return list;
	}

	public List<UserInfo> viewSubUserInfo(String user_id) {
		// TODO Auto-generated method stub
		List<UserInfo>  list = null;
		List<UserInfo> list2 = userInfoDao.viewSubUsersInfo(user_id);
		if(list2!=null){
			list = new ArrayList<UserInfo>();
			for(int i=0;i<list2.size();i++){
				  if(roleDao.viewRoleType(list2.get(i).getId())==3){
					  list.add(list2.get(i));
				  }
			}
		}
		return list;
	}

	public List<UserInfo> viewSubUsersInfo(String user_id) {
		// TODO Auto-generated method stub
		return userInfoDao.viewSubUsersInfo(user_id);
	}

	public UserInfo viewUserInfo(String user_account) {
		// TODO Auto-generated method stub
		return userInfoDao.viewUserInfo(user_account);
	}

	public List<UserInfo> viewUserStatus(int state) {
		// TODO Auto-generated method stub
		return userInfoDao.viewUserInfoStatus(state);
	}

	public boolean modUserStatus(String user_id, int state) {
		// TODO Auto-generated method stub
		return userInfoDao.modUserStatus(user_id, state);
	}

	public int countSubUser(String user_id) {
		// TODO Auto-generated method stub
		return userInfoDao.countSubUser(user_id);
	}
	
	public String getId(String account)
	{
		return userInfoDao.getId(account);
	}

}
