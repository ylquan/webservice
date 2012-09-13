package bio.dao;
import bio.po.UserInfo;

import java.util.List;
public interface UserInfoDao {
	
	boolean isExistAccount(String user_account,String user_password);
	
	boolean isExistRelation(String user_id, String child_user_id); //for delUserInfo delUserBase
	
    boolean addUserInfo(UserInfo user) ;

    boolean delUserInfo(String user_id);
    
    boolean modUserInfo(UserInfo user);

    UserInfo viewUserInfo(String user_account);

    int countSubUser(String user_id); // used in UserRoleDao  modify  user  role

    List<UserInfo> viewSubUsersInfo(String user_id);
    
    boolean modUserStatus(String user_id,int state);
    
    List<UserInfo> viewUserInfoStatus(int state);
    
    String getId(String account);
}
