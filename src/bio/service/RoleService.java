package bio.service;

import java.util.List;


import bio.po.Role;

public interface RoleService {
	
    boolean  addRole(Role role);
    
    boolean  delRole(String role_id); //需要查看是否有用户对应
    
    boolean   isExistRole(String role_id);
    
    List<Role>   viewAllSubRole(String role_id);
    
    Role    viewRole(String role_id);   
    
    List<Role>   viewSubAdminRole(String role_id);// used in UserSystemDao
    
    List<Role>   viewSubRole(String role_id);   // used in UserSystemDao
    
    List<Role>   viewSubUserRole(String role_id);  //used in UserSystemDao 
    
    List<Role>   viewRoleStatus(int state); 
    
    boolean modRoleStatus(String role_id,int state);
}
