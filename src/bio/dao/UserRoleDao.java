package bio.dao;

public interface UserRoleDao {
	
  boolean addUserRole(String user_id, String role_id);//first add user_id_child
  
  int countUser(String role_id);   // used in RoleDao function delRole(String role_id) 

	
  boolean delUser(String user_id);
 
  boolean modUserRole(String user_id,  String newroleid);// modify  String child_user_id,  需要在业务逻辑办理

  String viewUserRole(String user_id);
  
}
