/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package bio.dao;
import java.util.List;
import bio.po.Role;
/**
 *
 * @author fafa
 */
public interface RoleDao {
	
    boolean  addRole(Role role);
    
    boolean  delRole(String role_id);
    
    boolean   isExistRole(String role_id);
    
    boolean   isExistRelation(String role_id,String child_role_id);
    
    List<Role>   viewAllSubRole(String role_id);
    
    Role    viewRole(String role_id);
    
    int     viewRoleType(String role_id);
    
    List<Role>   viewSubAdminRole(String role_id);// used in UserSystemDao
    
    List<Role>   viewSubRole(String role_id);   // used in UserSystemDao
    
    List<Role>   viewSubUserRole(String role_id);  //used in UserSystemDao 
    
    List<Role>   viewRoleStatus(int state);
    
    boolean modRoleStatus(String role_id,int state);
}
