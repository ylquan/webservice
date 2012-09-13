package bio.service;

import java.util.List;

import bio.po.Operation;

public interface OperationService {
	boolean addOperation(Operation operation);

    boolean delOperation(String operation_id);

    Operation viewOperation(String operation_id);
    
    List<Operation> viewRoleOperation(String role_id);
}
