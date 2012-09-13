package bio.service;

import java.util.List;

import bio.dto.xsd.UserRespDto;
import bio.po.UserInfo;

public interface UserInfoService {
	
	boolean isExistAccount(String user_account,String user_password);
	
	boolean isExistRelation(String user_id, String child_user_id); //for delUserInfo delUserBase
	
    boolean addUserInfo(UserInfo user) ;

    boolean delUserInfo(String user_id);
    
    boolean modUserInfo(UserInfo user);

    UserInfo viewUserInfo(String user_account);

    int countSubUser(String user_id); // used in UserRoleDao  modify  user  role

   List<UserInfo> viewSubUserInfo(String user_id);

    List<UserInfo> viewSubAdminInfo(String user_id);

    List<UserInfo> viewSubUsersInfo(String user_id);
    
    List<UserInfo> viewUserStatus(int state);
    
    boolean modUserStatus(String user_id,int state);
    
    String getId(String account);
}
