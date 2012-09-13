package bio.service;

import java.util.List;

import bio.po.UserDetail;

public interface UserDetailService {
	
    boolean addUserDetail(UserDetail user) ;

    boolean delUserDetail(String user_id);
    
    boolean modUserDetail(UserDetail user);

    UserDetail viewUserDeatil(String user_id);

    List<UserDetail> viewSubUsersDetail(String user_id);
    
    List<UserDetail> viewSubUserDetail(String user_id);

    List<UserDetail> viewSubAdminDetail(String user_id);
    
    boolean modUserStatus(String user_id,int state);
    
}
