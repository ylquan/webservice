package bio.dao;

import java.util.List;

import bio.po.UserSystem;

public interface UserSystemDao {
	
    boolean addUserSystem(UserSystem user) ;

    boolean delUserSystem(String user_id);
    
    boolean modUserSystem(UserSystem user);

    UserSystem viewUserSystem(String user_id);

    List<UserSystem> viewSubUsersSystem(String user_id);
    
    boolean modUserStatus(String user_id,int state);
}
