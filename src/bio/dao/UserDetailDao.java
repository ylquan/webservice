package bio.dao;

import java.util.List;

import bio.po.UserDetail;;

public interface UserDetailDao {
		
    boolean addUserDetail(UserDetail user) ;

    boolean delUserDetail(String user_id);
    
    boolean modUserDetail(UserDetail user);

    UserDetail viewUserDeatil(String user_id);

    List<UserDetail> viewSubUsersDetail(String user_id);
    
    boolean modUserStatus(String user_id,int state);
}
