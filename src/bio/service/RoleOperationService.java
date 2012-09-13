package bio.service;

import java.util.List;

import bio.po.RoleOperation;

public interface RoleOperationService {
	boolean  addRoleOperations(String role_id, String[] opration_id);
    boolean  delRoleOperations(String role_id, String[] opration_id);
    List<RoleOperation> viewOperations(String role_id);
}
