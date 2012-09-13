package bio.service;

public interface UserRoleService {
	
	  boolean addUserRole(String user_id, String child_user_id ,String role_id);//first add user_id_child
	 	 
	  boolean modUserRole(String user_id, String child_user_id , String newroleid);// modify  String child_user_id,  需要在业务逻辑办理

	  String viewUserRole(String user_id);
}
